package personagem

class GameData {

    fun getRaces(): List<Race> {
        return listOf(
            Race(
                name = "Elf",
                description = "Um ser mágico com longevidade e habilidades superiores. Destreza + 2",
                bonusStats = mapOf("Destreza" to 2)
            ),
            Race(
                name = "Mid-Orc",
                description = "Um guerreiro robusto com grande força e resistência. Força + 2 Constituição + 1",
                bonusStats = mapOf("Força" to 2, "Constituição" to 1)
            ),
            Race(
                name = "Human",
                description = "Um guerreiro com estatísticas medianas. Força, Destreza, Constituição, Inteligência, Sabedoria, Carisma + 1",
                bonusStats = mapOf("Força" to 1, "Destreza" to 1, "Constituição" to 1, "Inteligência" to 1, "Sabedoria" to 1, "Carisma" to 1)
            ),
            Race(
                name = "Dwarf",
                description = "Um anão com grande habilidade de constituição. Constituição + 2",
                bonusStats = mapOf("Constituição" to 2)
            ),
            Race(
                name = "Draconato",
                description = "Raça vinda dos Dragões que já habitaram este planeta um dia. Força + 2 Carisma + 1 ",
                bonusStats = mapOf("Força" to 2, "Carisma" to 1)
            ),
            Race(
                name = "Mountain Dwarf",
                description = "Raça de anões que criaram sua civilização nas montanhas, são mais fortes que os normais. Força + 2",
                bonusStats = mapOf("Força" to 2)
            ) ,
            Race(
                name = "Halfling",
                description = "Força + 2",
                bonusStats = mapOf("Destreza" to 2)
            ),
            Race(
            name = "forest gnome",
            description ="Destreza + 2",
            bonusStats = mapOf("Destreza" to 2)
            ),
            Race(
            name = "rock gnome",
            description = "Constituição + 1",
            bonusStats = mapOf("Constituição" to 1)
            ),
            Race(
            name = "robust halfling",
            description = "Constituição + 1",
            bonusStats = mapOf("Constituição" to 1)
            ),
            Race(
            name = "halfling",
            description = "Destreza + 2",
            bonusStats = mapOf("Destreza" to 2)
            ),
            Race(
            name = "high elf",
            description = "Inteligência + 1",
            bonusStats = mapOf("Inteligência" to 1)
            ) ,
            Race(
            name = "Gnome",
            description = "Inteligência + 2",
            bonusStats = mapOf("Inteligência" to 2)
            ),
            Race(
            name = "Tiefling",
            description = "Inteligência + 1, Carisma + 1",
            bonusStats = mapOf("Inteligência" to 1, "Carisma" to 1)
            ),
            Race(
            name = "Hill Dwarf",
            description = "Sabedoria + 1",
            bonusStats = mapOf("Sabedoria" to 1)
            ),
            Race(
            name = "forest elf",
            description = "Sabedoria + 1",
            bonusStats = mapOf("Sabedoria" to 1)
            ),
            Race(
            name = "Drow",
            description = "Carisma + 1",
            bonusStats = mapOf("Carisma" to 1)
            ),
            Race(
            name = "Lightfoot halfling",
            description = "Carisma + 1",
            bonusStats = mapOf("Carisma" to 1)
            )
        )
    }

    fun getClasses(): List<CharacterClass> {
        return listOf(
            CharacterClass(
                name = "Warrior",
                description = "Especialista em combate corpo a corpo com alta resistência. força + 4 constituição +3",
                bonusStats = mapOf("força" to 4, "constituição" to 3)
            ),
            CharacterClass(
                name = "Archer",
                description = "Especialista em combate à distância com alta agilidade. destreza + 4, carisma + 2 ",
                bonusStats = mapOf("destreza" to 4, "carisma" to 2)
            ),
            CharacterClass(
                name = "Mage",
                description = "Especialista em magia com alta inteligência e habilidades mágicas. inteligência + 5",
                bonusStats = mapOf("inteligência" to 5)
            )
        )
    }
}
