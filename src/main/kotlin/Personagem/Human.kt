package personagem

import Personagem.IRaca

class Human : IRaca {
    override val name = "Human"
    override val description = "Um guerreiro com estatísticas medianas. Força, Destreza, Constituição, Inteligência, Sabedoria, Carisma + 1"
    override val bonusStats = mapOf(
        "Força" to 1,
        "Destreza" to 1,
        "Constituição" to 1,
        "Inteligência" to 1,
        "Sabedoria" to 1,
        "Carisma" to 1
    )
}
