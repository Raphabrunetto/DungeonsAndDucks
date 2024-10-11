import Personagem.ArcherDistribuicaoStrategy
import Personagem.IRaca
import Personagem.MageDistribuicaoStrategy
import Personagem.WarriorDistribuicaoStrategy
import personagem.*
import gamerules.chooseCharacterName
import gamerules.chooseClass
import gamerules.chooseRace

fun main() {
    // Definindo as listas de raças e classes
    val races: List<IRaca> = listOf(
        Human(), Elf(), Dwarf(), Halfling(), ForestGnome(), RockGnome(),
        RobustHalfling(), HighElf(), Gnome(), Tiefling(),
        HillDwarf(), ForestElf(), Drow(), LightfootHalfling()
    )
    val classes: List<IClass> = listOf(
        Warrior(), Archer(), Mage()
    )

    // Escolha da raça, classe e nome do personagem
    val selectedRace = chooseRace(races)
    val selectedClass = chooseClass(classes)
    val characterName = chooseCharacterName()

    // Criação do personagem
    val character = GameCharacter().apply {
        this.name = characterName // Supondo que você tenha um atributo 'name'
    }

    // Determinando a estratégia de distribuição com base na classe selecionada
    val estrategia = when (selectedClass) {
        is Archer -> ArcherDistribuicaoStrategy()
        is Warrior -> WarriorDistribuicaoStrategy() // Implementar conforme necessário
        is Mage -> MageDistribuicaoStrategy() // Implementar conforme necessário
        else -> throw IllegalArgumentException("Classe desconhecida")
    }

    // Criando o distribuidor com a estratégia correta
    val distribuidor = DistribuicaoPontos(estrategia)

    // Distribuindo atributos
    distribuidor.distribuirAtributos(character, selectedRace, selectedClass)

    // Exibir informações do personagem
    println("Personagem criado: ${character.name}")
    println("Raça: ${selectedRace.name}")
    println("Classe: ${selectedClass.name}")
    println("\nAtributos:")
    println("\nForça: ${character.forca}")
    println("Destreza: ${character.destreza}")
    println("Constituição: ${character.constituicao}")
    println("Inteligência: ${character.inteligencia}")
    println("Sabedoria: ${character.sabedoria}")
    println("Carisma: ${character.carisma}")
    println("Pontos de Vida: ${character.pontosDeVida}")
}
