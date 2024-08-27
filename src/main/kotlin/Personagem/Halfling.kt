package personagem

import Personagem.IRaca

class Halfling : IRaca {
    override val name = "Halfling"
    override val description = "Força + 2 e Destreza + 2"
    override val bonusStats = mapOf("Força" to 2, "Destreza" to 2)
}
