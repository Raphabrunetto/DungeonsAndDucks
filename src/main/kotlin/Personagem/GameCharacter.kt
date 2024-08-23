package org.example

import java.util.Scanner
import java.util.logging.Logger
import java.util.logging.Level
import java.util.logging.ConsoleHandler
import java.util.logging.SimpleFormatter

class GameCharacter {
    var forca: Int = 8
    var destreza: Int = 8
    var constituicao: Int = 8
    var inteligencia: Int = 8
    var sabedoria: Int = 8
    var carisma: Int = 8
    var pontosDeVida: Int = 10

    fun calcularPontosDeVida() {
        pontosDeVida = 10 + ((constituicao - 10) / 2)
    }
}