package personagem

class GameData {

    fun getRaces(): List<Race> {
        return listOf(
            Race(
                name = "Elf",
                description = "Um ser mágico com longevidade e habilidades superiores.",
                bonusStats = mapOf("Destreza" to 2)
            ),
            Race(
                name = "Mid-Orc",
                description = "Um guerreiro robusto com grande força e resistência.",
                bonusStats = mapOf("Força" to 2, "Constituição" to 1)
            ),
            Race(
                name = "Human",
                description = "Um guerreiro com estatísticas medianas.",
                bonusStats = mapOf("Força" to 1, "Destreza" to 1, "Constituição" to 1, "Inteligência" to 1, "Sabedoria" to 1, "Carisma" to 1)
            ),
            Race(
                name = "Dwarf",
                description = "Um anão com grande habilidade de constituição.",
                bonusStats = mapOf("Constituição" to 2)
            ),
            Race(
                name = "Draconato",
                description = "Raça vinda dos Dragões que já habitaram este planeta um dia.",
                bonusStats = mapOf("Força" to 2, "Carisma" to 1)
            ),
            Race(
                name = "Mountain Dwarf",
                description = "Raça de anões que criaram sua civilização nas montanhas, são mais fortes que os normais.",
                bonusStats = mapOf("Força" to 2)
            )
        )
    }

    fun getClasses(): List<CharacterClass> {
        return listOf(
            CharacterClass(
                name = "Guerreiro",
                description = "Especialista em combate corpo a corpo com alta resistência.",
                bonusStats = mapOf("força" to 4, "constituição" to 3)
            ),
            CharacterClass(
                name = "Arqueiro",
                description = "Especialista em combate à distância com alta agilidade.",
                bonusStats = mapOf("destreza" to 4, "carisma" to 2)
            ),
            CharacterClass(
                name = "Mago",
                description = "Especialista em magia com alta inteligência e habilidades mágicas.",
                bonusStats = mapOf("inteligência" to 5, "mana" to 5)
            )
        )
    }
}
