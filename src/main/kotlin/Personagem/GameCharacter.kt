class GameCharacter {
    var name: String = ""
    var forca: Int = 8
    var destreza: Int = 8
    var constituicao: Int = 8
    var inteligencia: Int = 8
    var sabedoria: Int = 8
    var carisma: Int = 8
    var pontosDeVida: Int = calcularPontosDeVida()

    fun calcularPontosDeVida(): Int {
        return 10 + (constituicao - 10) / 2
    }

    fun atualizarPontosDeVida() {
        pontosDeVida = calcularPontosDeVida()
    }
}
