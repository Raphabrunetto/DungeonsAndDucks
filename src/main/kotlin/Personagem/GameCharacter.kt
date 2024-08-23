package personagem

import kotlin.math.min

class GameCharacter(
    val name: String,
    val race: Race,
    val characterClass: CharacterClass
) {
    // Atributos base mínimos do player
    private val baseAttributes = mutableMapOf(
        "força" to 8,
        "destreza" to 8,
        "inteligência" to 8,
        "constituição" to 8,
        "carisma" to 8,
        "sabedoria" to 8
    )

    // Atributos finais considerando bônus de raça e classe
    private val finalAttributes = baseAttributes.toMutableMap()

    // Pontos disponíveis para distribuir
    private var pontosRestantes = 27

    init {
        // Aplicar bônus de raça e classe aos atributos
        applyRaceAndClassBonuses()
    }

    private fun applyRaceAndClassBonuses() {
        // Aplica os bônus de raça
        race.bonusStats.forEach { (attribute, bonus) ->
            finalAttributes[attribute.lowercase()] = (finalAttributes[attribute.lowercase()] ?: 0) + bonus
        }

        // Aplica os bônus de classe
        characterClass.bonusStats.forEach { (attribute, bonus) ->
            finalAttributes[attribute.lowercase()] = (finalAttributes[attribute.lowercase()] ?: 0) + bonus
        }

        // Garantir que nenhum atributo exceda 16 após aplicação dos bônus
        finalAttributes.forEach { (attribute, value) ->
            finalAttributes[attribute] = min(16, value)
        }
    }

    // Função para distribuir pontos
    fun distribuirPontosAtributos(i: Int) {
        while (pontosRestantes > 0) {
            println("Distribua seus pontos entre os atributos (total disponível: $pontosRestantes):")

            finalAttributes.forEach { (atributo, valorAtual) ->
                // Calcula o valor máximo possível para o atributo
                val valorMaximoPossivel = min(16, valorAtual + pontosRestantes)

                println("$atributo (Atual: $valorAtual, Máximo possível: $valorMaximoPossivel):")
                val novoValor = readLine()?.toIntOrNull()

                if (novoValor != null) {
                    if (novoValor < 8 || novoValor > 16) {
                        println("Valor inválido para $atributo. Deve estar entre 8 e 16.")
                    } else {
                        val custo = novoValor - valorAtual

                        if (custo <= pontosRestantes && novoValor <= valorMaximoPossivel) {
                            finalAttributes[atributo] = novoValor
                            pontosRestantes -= custo
                        } else {
                            println("Pontos insuficientes ou valor máximo excedido para $atributo. Tente um valor menor.")
                        }
                    }
                } else {
                    println("Valor inválido para $atributo. Tente novamente.")
                }
            }

            println("Pontos restantes: $pontosRestantes")
        }
    }

    fun displayCharacterInfo() {
        println("Nome: $name")
        println("Raça: ${race.name}")
        println("Classe: ${characterClass.name}")
        println("Atributos:")
        finalAttributes.forEach { (key, value) ->
            println("$key (Atual: $value)")
        }
        println("Bônus de Raça do personagem: ${formatBonusStats(race.bonusStats)}")
        println("Bônus de Classe do personagem: ${formatBonusStats(characterClass.bonusStats)}")
    }

    private fun formatBonusStats(bonusStats: Map<String, Int>): String {
        return bonusStats.entries.joinToString(", ") { "${it.key.replaceFirstChar { char -> char.uppercase() }}: ${it.value}" }
    }
}
