package personagem

import Interfaces.IRaca

class MountainDwarf(override val nome: String) : IRaca {
    override val name = "Mountain Dwarf"
    override val description = "Raça de anões que criaram sua civilização nas montanhas, são mais fortes que os normais. Força + 2"
    override val bonusStats = mapOf("Força" to 2)
}
