class GameCharacter {
    var forca: Int = 8
    var destreza: Int = 8
    var constituicao: Int = 8
    var inteligencia: Int = 8
    var sabedoria: Int = 8
    var carisma: Int = 8
    var pontosDeVida: Int = calcularPontosDeVida()

    fun calcularPontosDeVida(): Int {
        return constituicao
    }

    fun atualizarPontosDeVida() {
        pontosDeVida = calcularPontosDeVida()
    }
}
