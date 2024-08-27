package personagem

import Personagem.IRaca

class Dwarf : IRaca {
    override val name = "Dwarf"
    override val description = "Um anão com grande habilidade de constituição. Constituição + 2"
    override val bonusStats = mapOf("Constituição" to 2)
}
