package gamerules

import Personagem.IRaca
import personagem.* // Certifique-se de que você tem todas as importações necessárias
import kotlin.system.exitProcess

fun chooseRace(races: List<IRaca>): IRaca {
    println("\nEscolha uma raça (digite o nome):")
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

fun chooseClass(classes: List<IClass>): IClass {
    println("\nEscolha uma classe (digite o nome):")
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
    println("\nDigite o nome do seu personagem:")
    return readLine()?.takeIf { it.isNotBlank() } ?: run {
        println("Nome inválido. Saindo do programa.")
        exitProcess(1)
    }
}
