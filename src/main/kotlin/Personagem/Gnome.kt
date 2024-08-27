package personagem

import Personagem.IRaca

class Gnome : IRaca {
    override val name = "Gnome"
    override val description = "Inteligência + 2"
    override val bonusStats = mapOf("Inteligência" to 2)
}
