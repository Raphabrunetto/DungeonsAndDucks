package org.example

import GameCharacter

interface DistribuicaoAtributosStrategy {
    fun distribuir(personagem: GameCharacter, pontos: Int)

}