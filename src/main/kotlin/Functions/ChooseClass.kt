package Functions

import personagem.CharacterClass
import kotlin.system.exitProcess

fun chooseClass(classes: List<CharacterClass>): Any {
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
