package Functions

import kotlin.system.exitProcess

fun chooseCharacterName(): Any {
    println("Digite o nome do seu personagem:")
    return readLine() ?: run {
        println("Nome inválido. Saindo do programa.")
        exitProcess(1)
    }
}
