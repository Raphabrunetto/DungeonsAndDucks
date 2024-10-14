package personagem

import Interfaces.IClass

class Warrior : IClass {
    override val name = "Warrior"
    override val description = "Especialista em combate corpo a corpo com alta resistência. força + 4 constituição +3"
    override val bonusStats = mapOf("força" to 4, "constituição" to 3)
}
