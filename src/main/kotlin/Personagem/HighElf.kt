package personagem

import Interfaces.IRaca

class HighElf(override val nome: String) : IRaca {
    override val name = "High Elf"
    override val description = "Inteligência + 1"
    override val bonusStats = mapOf("Inteligência" to 1)
}
