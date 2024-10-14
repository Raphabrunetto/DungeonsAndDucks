import Interfaces.IClass
import Interfaces.IRaca
import kotlin.system.exitProcess

// Defina a classe CharacterCreationUtils
class CharacterCreationUtils {

    // Função para escolher a raça
    fun chooseRace(races: List<IRaca>): IRaca {
        println("\n")
        println("Escolha uma raça (digite o nome):")
        races.forEach { race ->
            println("${race.name}: ${race.description}")
        }

        val raceChoiceName = readLine()?.capitalize() ?: run {
            println("Escolha inválida. Saindo do programa.")
            exitProcess(1)
        }

        return races.find { it.name.equals(raceChoiceName, ignoreCase = true) } ?: run {
            println("Raça não encontrada. Saindo do programa.")
            exitProcess(1)
        }
    }

    // Função para escolher a classe
    fun chooseClass(classes: List<IClass>): IClass {
        println("\n")
        println("Escolha uma classe (digite o nome):")
        classes.forEach { characterClass ->
            println("${characterClass.name}: ${characterClass.description}")
        }

        val classChoiceName = readLine()?.capitalize() ?: run {
            println("Escolha inválida. Saindo do programa.")
            exitProcess(1)
        }

        return classes.find { it.name.equals(classChoiceName, ignoreCase = true) } ?: run {
            println("Classe não encontrada. Saindo do programa.")
            exitProcess(1)
        }
    }

    // Função para escolher o nome do personagem
    fun chooseCharacterName(): String {
        println("\n")
        println("Digite o nome do seu personagem:")
        return readLine() ?: run {
            println("Nome inválido. Saindo do programa.")
            exitProcess(1)
        }
    }
}
