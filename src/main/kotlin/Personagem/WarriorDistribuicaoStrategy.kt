package Personagem


import personagem.GameCharacter

class WarriorDistribuicaoStrategy : DistribuicaoAtributosStrategy {
    override fun aplicarBonus(personagem: GameCharacter, bonus: Map<String, Int>) {
        bonus.forEach { (atributo, valor) ->
            when (atributo.lowercase()) {
                "força" -> personagem.forca += valor
                "constituição" -> personagem.constituicao += valor
            }
        }
    }
}
