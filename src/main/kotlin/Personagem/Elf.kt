package personagem

import Interfaces.IRaca

class Elf: IRaca {
    override val name = "Elf"
    override val description = "Um ser mágico com longevidade e habilidades superiores. Destreza + 2"
    override val bonusStats = mapOf("Destreza" to 2)
}
