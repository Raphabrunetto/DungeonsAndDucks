package Personagem

import GameCharacter

class ArcherDistribuicaoStrategy : DistribuicaoAtributosStrategy {
    override fun aplicarBonus(personagem: GameCharacter, bonus: Map<String, Int>) {
        bonus.forEach { (atributo, valor) ->
            when (atributo.lowercase()) {
                "destreza" -> personagem.destreza += valor
                "carisma" -> personagem.carisma += valor
            }
        }
    }
}