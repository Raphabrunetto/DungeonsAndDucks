import personagem.Race
import personagem.CharacterClass
import kotlin.system.exitProcess

fun chooseRace(races: List<Race>): Race {
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

fun chooseClass(classes: List<CharacterClass>): CharacterClass {
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

fun chooseCharacterName(): String {
    println("Digite o nome do seu personagem:")
    return readLine() ?: run {
        println("Nome inválido. Saindo do programa.")
        exitProcess(1)
    }
}
