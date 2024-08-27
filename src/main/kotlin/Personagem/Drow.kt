package personagem

import Personagem.IRaca

class Drow : IRaca {
    override val name = "Drow"
    override val description = "Carisma + 1"
    override val bonusStats = mapOf("Carisma" to 1)
}
