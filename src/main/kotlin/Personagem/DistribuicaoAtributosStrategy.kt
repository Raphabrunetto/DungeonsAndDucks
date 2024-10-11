package Personagem

import GameCharacter

interface DistribuicaoAtributosStrategy {
    fun aplicarBonus(personagem: GameCharacter, bonus: Map<String, Int>)
}
