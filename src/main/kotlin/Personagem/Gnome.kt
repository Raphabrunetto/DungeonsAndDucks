package personagem

import Interfaces.IRaca

    class Gnome(override val nome: String) : IRaca {
    override val name = "Gnome"
    override val description = "Inteligência + 2"
    override val bonusStats = mapOf("Inteligência" to 2)
}
