package personagem

data class CharacterClass(
    val name: String,
    val description: String,
    val bonusStats: Map<String, Int>
)
