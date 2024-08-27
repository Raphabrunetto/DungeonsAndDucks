package personagem

import Personagem.IRaca

class HillDwarf : IRaca {
    override val name = "Hill Dwarf"
    override val description = "Sabedoria + 1"
    override val bonusStats = mapOf("Sabedoria" to 1)
}
