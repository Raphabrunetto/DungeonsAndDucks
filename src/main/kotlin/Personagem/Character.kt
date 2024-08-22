package personagem

class Character(
    val name: String,
    val race: Race,
    val characterClass: CharacterClass
) {
    private val baseAttributes = mutableMapOf(
        "força" to 8,
        "destreza" to 8,
        "inteligência" to 8,
        "constituição" to 8,
        "carisma" to 8,
        "sabedoria" to 8
    )

    private val finalAttributes = mutableMapOf<String, Int>()

    // Atualiza os atributos base com os novos valores fornecidos pelo jogador
    fun updateBaseAttributes(novosAtributos: Map<String, Int>) {
        baseAttributes.clear()
        baseAttributes.putAll(novosAtributos)

        // Atualiza os atributos finais com os novos valores base
        updateFinalAttributes()
    }

    // Atualiza os atributos finais com base nos atributos base e nos bônus
    private fun updateFinalAttributes() {
        finalAttributes.clear()
        finalAttributes.putAll(baseAttributes.mapValues { (attribute, baseValue) ->
            baseValue + (race.bonusStats[attribute] ?: 0) + (characterClass.bonusStats[attribute] ?: 0)
        })
    }

    fun displayCharacterInfo() {
        println("Nome: $name")
        println("Raça: ${race.name}")
        println("Descrição da Raça: ${race.description}")
        println("Bônus de Atributos da Raça: ${formatBonusStats(race.bonusStats)}")
        println("Classe: ${characterClass.name}")
        println("Descrição da Classe: ${characterClass.description}")
        println("Bônus de Atributos da Classe: ${formatBonusStats(characterClass.bonusStats)}")
        println("Atributos Finais: ${formatBonusStats(finalAttributes)}")
    }

    private fun formatBonusStats(bonusStats: Map<String, Int>): String {
        return bonusStats.entries.joinToString(", ") { "${it.key}: ${it.value}" }
    }
}
