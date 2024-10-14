package personagem

import Interfaces.IRaca

class MidOrc(override val nome: String) : IRaca {
    override val name = "Mid-Orc"
    override val description = "Um guerreiro robusto com grande força e resistência. Força + 2 Constituição + 1"
    override val bonusStats = mapOf("Força" to 2, "Constituição" to 1)
}
