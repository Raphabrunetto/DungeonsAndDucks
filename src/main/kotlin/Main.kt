import Interfaces.IClass
import Interfaces.IRaca
import personagem.DistribuicaoPontos
import personagem.GameCharacter
import personagem.*

fun main() {
    val distribuidor = DistribuicaoPontos()

    // Lista de raças
    val races: List<IRaca> = listOf(
        Human("Humano"), Elf("Elfo"), Dwarf("Anão"), Halfling("Halfling"),
        ForestGnome("Gnome da Floresta"), RockGnome("Gnome Rocha"), RobustHalfling("Halfling Robusto"),
        HighElf("Elfo Alto"), Draconato("Draconato"), Gnome("Gnome"), Tiefling("Tiefling"),
        HillDwarf("Anão da Colina"), ForestElf("Elfo da Floresta"), Drow("Drow"), LightfootHalfling("Halfling Pé-leve")
    )

    // Lista de classes
    val classes: List<IClass> = listOf(Warrior(), Archer(), Mage())

    // Escolha da raça
    println("\nEscolha uma raça (digite o nome):")
    races.forEach { race ->
        println("${race.name}: ${race.description}")
    }
    val selectedRaceName = readLine()?.capitalize() ?: run {
        println("Escolha inválida. Saindo do programa.")
        return
    }
    val selectedRace = races.find { it.name.equals(selectedRaceName, ignoreCase = true) } ?: run {
        println("Raça não encontrada. Saindo do programa.")
        return
    }

    // Escolha da classe
    println("\nEscolha uma classe (digite o nome):")
    classes.forEach { characterClass ->
        println("${characterClass.name}: ${characterClass.description}")
    }
    val selectedClassName = readLine()?.capitalize() ?: run {
        println("Escolha inválida. Saindo do programa.")
        return
    }
    val selectedClass = classes.find { it.name.equals(selectedClassName, ignoreCase = true) } ?: run {
        println("Classe não encontrada. Saindo do programa.")
        return
    }

    // Escolha do nome do personagem
    println("\nDigite o nome do seu personagem:")
    val characterName = readLine() ?: run {
        println("Nome inválido. Saindo do programa.")
        return
    }

    // Criação do personagem
    val character = GameCharacter(nome = characterName, classe = selectedClass, raca = selectedRace)

    // Distribuição manual de pontos
    distribuidor.distribuirPontosJogador(character)

    // Aplicar bônus de raça e classe
    distribuidor.distribuirAtributos(character, selectedRace, selectedClass)

    // Atualizar pontos de vida
    character.atualizarPontosDeVida()

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
