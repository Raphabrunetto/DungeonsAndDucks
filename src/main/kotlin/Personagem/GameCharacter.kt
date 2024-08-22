package personagem

import kotlin.math.min

class GameCharacter(
    val name: String,
    val race: Race,
    val characterClass: CharacterClass
) {
    // Atributos base mínimos
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
    private val raceClassBonuses = baseAttributes.map { (attribute, baseValue) ->
        val bonusFromRace = race.bonusStats[attribute] ?: 0
        val bonusFromClass = characterClass.bonusStats[attribute] ?: 0
        attribute to min(16, baseValue + bonusFromRace + bonusFromClass)
    }.toMap().toMutableMap()

    // Pontos disponíveis para distribuir
    private var pontosRestantes = 27

    init {
        // Aplicar bônus de raça e classe aos atributos
        applyRaceAndClassBonuses()
    }

    // Função para distribuir pontos
    fun distribuirPontosAtributos(i: Int) {
        while (pontosRestantes > 0) {
            println("Distribua seus pontos entre os atributos (total disponível: $pontosRestantes):")

            val iterator = finalAttributes.iterator()
            var continueLoop = true

            while (iterator.hasNext() && continueLoop) {
                val (atributo, valorAtual) = iterator.next()
                // Calcula o valor máximo possível para o atributo
                val valorMaximoPossivel = min(16, baseAttributes[atributo]!! + pontosRestantes)

                // Calcula os bônus de raça e classe
                val bonusFromRace = race.bonusStats[atributo] ?: 0
                val bonusFromClass = characterClass.bonusStats[atributo] ?: 0
                val valorFinal = valorAtual + bonusFromRace + bonusFromClass

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

                // Verifica se ainda há pontos restantes e continua o loop
                if (pontosRestantes <= 0) {
                    continueLoop = false
                }
            }

            println("Pontos restantes: $pontosRestantes")
        }
    }

    // Aplicar bônus de raça e classe aos atributos finais
    private fun applyRaceAndClassBonuses() {
        finalAttributes.keys.forEach { attribute ->
            val bonusFromRace = race.bonusStats[attribute] ?: 0
            val bonusFromClass = characterClass.bonusStats[attribute] ?: 0
            finalAttributes[attribute] = min(16, baseAttributes[attribute]!! + bonusFromRace + bonusFromClass)
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
        println("Bônus de Raça: ${formatBonusStats(race.bonusStats)}")
        println("Bônus de Classe: ${formatBonusStats(characterClass.bonusStats)}")
    }

    private fun formatBonusStats(bonusStats: Map<String, Int>): String {
        return bonusStats.entries.joinToString(", ") { "${it.key.replaceFirstChar { it.uppercase() }}: ${it.value}" }
    }
}
