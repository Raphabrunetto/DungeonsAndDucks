package personagem

import Interfaces.IClass

class Mage : IClass {
    override val name = "Mage"
    override val description = "Especialista em magia com alta inteligência e habilidades mágicas. inteligência + 5"
    override val bonusStats = mapOf("inteligência" to 5)
}
