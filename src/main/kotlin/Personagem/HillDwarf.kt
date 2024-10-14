package personagem

import Interfaces.IRaca

class HillDwarf(override val nome: String) : IRaca {
    override val name = "Hill Dwarf"
    override val description = "Sabedoria + 1"
    override val bonusStats = mapOf("Sabedoria" to 1)
}
