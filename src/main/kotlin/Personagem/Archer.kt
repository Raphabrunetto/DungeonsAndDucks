package personagem

import Interfaces.IClass

class Archer : IClass {
    override val name = "Archer"
    override val description = "Especialista em combate à distância com alta agilidade. destreza + 4, carisma + 2"
    override val bonusStats = mapOf("destreza" to 4, "carisma" to 2)
}
