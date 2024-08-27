package personagem

import Personagem.IRaca

class Draconato : IRaca {
    override val name = "Draconato"
    override val description = "Raça vinda dos Dragões que já habitaram este planeta um dia. Força + 2 Carisma + 1"
    override val bonusStats = mapOf("Força" to 2, "Carisma" to 1)
}
