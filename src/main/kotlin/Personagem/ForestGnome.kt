package personagem

import Interfaces.IRaca

class ForestGnome: IRaca {
    override val name = "Forest Gnome"
    override val description = "Destreza + 2"
    override val bonusStats = mapOf("Destreza" to 2)
}
