package personagem

import Interfaces.IRaca

class ForestElf(override val nome: String) : IRaca {
    override val name = "Forest Elf"
    override val description = "Sabedoria + 1"
    override val bonusStats = mapOf("Sabedoria" to 1)
}
