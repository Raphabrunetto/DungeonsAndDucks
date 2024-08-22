package personagem

data class Race(
    val name: String,
    val description: String,
    val bonusStats: Map<String, Int>
)
