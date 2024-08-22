package GameRules

class Points(private val pontosDisponiveis: Int) {
    private val custos = mapOf(
        8 to 0,
        9 to 1,
        10 to 2,
        11 to 3,
        12 to 4,
        13 to 5,
        14 to 7,
        15 to 9,
        16 to 11,
        17 to 13,
        18 to 15
    )

    fun getCusto(valor: Int): Int {
        return custos[valor] ?: 0
    }

    fun calcularCustoTotal(atributos: Map<String, Int>): Int {
        return atributos.values.sumOf { getCusto(it) }
    }

    fun distribuirPontos(atributos: Map<String, Int>): Boolean {
        val custoTotal = calcularCustoTotal(atributos)
        return custoTotal <= pontosDisponiveis
    }
}
