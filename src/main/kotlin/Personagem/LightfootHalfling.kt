package personagem

import Personagem.IRaca

class LightfootHalfling : IRaca {
    override val name = "Lightfoot Halfling"
    override val description = "Carisma + 1"
    override val bonusStats = mapOf("Carisma" to 1)
}
