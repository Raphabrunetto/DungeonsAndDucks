package personagem

import Interfaces.IRaca

class Tiefling(override val nome: String) : IRaca {
    override val name = "Tiefling"
    override val description = "Inteligência + 1, Carisma + 1"
    override val bonusStats = mapOf("Inteligência" to 1, "Carisma" to 1)
}
