package Personagem

import GameCharacter

class MageDistribuicaoStrategy : DistribuicaoAtributosStrategy {
    override fun aplicarBonus(personagem: GameCharacter, bonus: Map<String, Int>) {
        bonus.forEach { (atributo, valor) ->
            when (atributo.lowercase()) {
                "inteligência" -> personagem.inteligencia += valor
                "sabedoria" -> personagem.sabedoria += valor
            }
        }
    }
}