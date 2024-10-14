package Personagem

import personagem.GameCharacter

interface DistribuicaoAtributosStrategy {
    fun aplicarBonus(personagem: GameCharacter, bonus: Map<String, Int>)
}
