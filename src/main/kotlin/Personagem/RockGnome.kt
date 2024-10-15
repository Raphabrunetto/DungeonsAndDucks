package personagem

import Interfaces.IRaca

class RockGnome: IRaca {
    override val name = "Rock Gnome"
    override val description = "Constituição + 1"
    override val bonusStats = mapOf("Constituição" to 1)
}
