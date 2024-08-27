package personagem

import Personagem.IRaca

class ForestElf : IRaca {
    override val name = "Forest Elf"
    override val description = "Sabedoria + 1"
    override val bonusStats = mapOf("Sabedoria" to 1)
}
