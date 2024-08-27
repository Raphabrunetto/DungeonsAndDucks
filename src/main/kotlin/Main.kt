import Personagem.IRaca
import personagem.*

fun main() {
    val distribuidor = DistribuicaoPontos()
    val races: List<IRaca> = listOf(
        Human(), Elf(), Dwarf(), Halfling(), ForestGnome(), RockGnome(),
        RobustHalfling(), HighElf(), Gnome(), Tiefling(),
        HillDwarf(), ForestElf(), Drow(), LightfootHalfling()
    )
    val classes: List<IClass> = listOf(
        Warrior(), Archer(), Mage()
    )

    // Escolha da raça e da classe
    val selectedRace = chooseRace(races)
    val selectedClass = chooseClass(classes)
    val characterName = chooseCharacterName()

    // Criação do personagem
    val character = GameCharacter()

    // Distribuir atributos
    distribuidor.distribuirAtributos(character, selectedRace, selectedClass)

    // Exibir informações do personagem
    println("Personagem criado: $characterName")
    println("Raça: ${selectedRace.name}")
    println("Classe: ${selectedClass.name}")
    println("\n")
    println("Atributos:")
    println("\n")
    println("Força: ${character.forca}")
    println("Destreza: ${character.destreza}")
    println("Constituição: ${character.constituicao}")
    println("Inteligência: ${character.inteligencia}")
    println("Sabedoria: ${character.sabedoria}")
    println("Carisma: ${character.carisma}")
    println("Pontos de Vida: ${character.pontosDeVida}")
}
