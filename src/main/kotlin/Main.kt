import Interfaces.IClass
import Interfaces.IRaca
import personagem.*

fun main() {
    val distribuidor = DistribuicaoPontos()
    val races: List<IRaca> = listOf(
        Human("Humano"),
        Elf("Elfo"),
        Dwarf("Anão"),
        Halfling("Halfling"),
        ForestGnome("Gnome da Floresta"),
        RockGnome("Gnome Rocha"),
        RobustHalfling("Halfling Robusto"),
        HighElf("Elfo Alto"),
        Draconato("Draconato"),
        Gnome("Gnome"),
        Tiefling("Tiefling"),
        HillDwarf("Anão da Colina"),
        ForestElf("Elfo da Floresta"),
        Drow("Drow"),
        LightfootHalfling("Halfling Pé-leve")
    )

    val classes: List<IClass> = listOf(
        Warrior(), Archer(), Mage()
    )

    // Escolha da raça e da classe
    val selectedRace = chooseRace(races)
    val selectedClass = chooseClass(classes)
    val characterName = chooseCharacterName()

    // Criação do personagem
    val character = GameCharacter(nome = characterName, classe = selectedClass, raca = selectedRace)

    // Distribuir atributos
    distribuidor.distribuirAtributos(character, selectedRace, selectedClass)

    // Exibir informações do personagem
    println("\nPersonagem criado: $characterName")
    println("Raça: ${selectedRace.name}")
    println("Classe: ${selectedClass.name}")
    println("\nAtributos:")
    println("Força: ${character.forca}")
    println("Destreza: ${character.destreza}")
    println("Constituição: ${character.constituicao}")
    println("Inteligência: ${character.inteligencia}")
    println("Sabedoria: ${character.sabedoria}")
    println("Carisma: ${character.carisma}")
    println("Pontos de Vida: ${character.pontosDeVida}")
}
