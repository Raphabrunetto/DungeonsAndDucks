package personagem

import Interfaces.IRaca

class Halfling(override val nome: String) : IRaca {
    override val name = "Halfling"
    override val description = "Força + 2 e Destreza + 2"
    override val bonusStats = mapOf("Força" to 2, "Destreza" to 2)
}
