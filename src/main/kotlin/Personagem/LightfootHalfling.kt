package personagem

import Interfaces.IRaca

class LightfootHalfling(override val nome: String) : IRaca {
    override val name = "Lightfoot Halfling"
    override val description = "Carisma + 1"
    override val bonusStats = mapOf("Carisma" to 1)
}
