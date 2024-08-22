import GameRules.Points
import personagem.Character
import personagem.GameData
import kotlin.math.min

fun main() {
    val gameData = GameData()

    val races = gameData.getRaces()
    val classes = gameData.getClasses()

    val selectedRace = chooseRace(races)
    val selectedClass = chooseClass(classes)
    val characterName = chooseCharacterName()

    // Inicializa atributos com valores iniciais
    val atributos = mutableMapOf(
        "força" to 8,
        "destreza" to 8,
        "constituição" to 8,
        "inteligência" to 8,
        "sabedoria" to 8,
        "carisma" to 8
    )

    val pontosDisponiveis = 27
    val pontos = Points(pontosDisponiveis)

    // Contador de pontos restantes
    var pontosRestantes = pontosDisponiveis

    while (pontosRestantes > 0) {
        println("Distribua seus pontos entre os atributos (total disponível: $pontosRestantes):")

        for ((atributo, valorAtual) in atributos) {
            val custoAtual = pontos.getCusto(valorAtual)
            val pontosDisponiveisParaAtributo = pontosRestantes + custoAtual
            val valorMaximo = 16 // Valor máximo possível para um atributo
            val valorMinimo = 8 // Valor mínimo possível para um atributo

            // Cálculo do valor máximo disponível para o atributo
            val valorMaximoDisponivel = min(valorMaximo, 8 + pontosRestantes)

            println("$atributo (Disponível: $valorMaximoDisponivel):")
            val novoValor = readLine()?.toIntOrNull()

            if (novoValor != null) {
                if (novoValor < valorMinimo || novoValor > valorMaximo) {
                    println("Valor inválido para $atributo. Deve estar entre $valorMinimo e $valorMaximo.")
                    continue
                }

                val custoNovo = pontos.getCusto(novoValor)
                val custoAnterior = pontos.getCusto(valorAtual)

                if (pontosRestantes + custoAnterior >= custoNovo) {
                    atributos[atributo] = novoValor
                    pontosRestantes = pontosDisponiveis - pontos.calcularCustoTotal(atributos)
                } else {
                    println("Pontos insuficientes para aumentar $atributo para $novoValor. Tente um valor menor.")
                }
            } else {
                println("Valor inválido para $atributo. Tente novamente.")
            }
        }

        println("Pontos restantes: $pontosRestantes")

        if (pontosRestantes == 0) {
            if (pontos.distribuirPontos(atributos)) {
                val character = Character(
                    name = characterName,
                    race = selectedRace,
                    characterClass = selectedClass
                )

                // Atualiza os atributos base do personagem com os valores fornecidos
                character.updateBaseAttributes(atributos)

                println("\nInformações do Personagem:")
                character.displayCharacterInfo()
                break
            } else {
                println("Distribuição inválida de pontos. Tente novamente.")
            }
        } else {
            println("Ainda há pontos restantes. Por favor, ajuste a distribuição.")
        }
    }
}
