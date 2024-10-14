package personagem

import Interfaces.IRaca

class RobustHalfling(override val nome: String) : IRaca {
    override val name = "Robust Halfling"
    override val description = "Constituição + 1"
    override val bonusStats = mapOf("Constituição" to 1)
}
