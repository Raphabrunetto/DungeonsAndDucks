package personagem

import Interfaces.IClass
import Interfaces.IRaca

class GameCharacter(
    var nome: String = "",
    var classe: IClass? = null,
    var raca: IRaca? = null,
    var forca: Int = 8,
    var destreza: Int = 8,
    var constituicao: Int = 8, // Certifique-se de que isso esteja correto
    var inteligencia: Int = 8,
    var sabedoria: Int = 8,
    var carisma: Int = 8,
    var pontosDeVida: Int = 8 // HP inicial padrão
) {
    fun atualizarPontosDeVida() {
        pontosDeVida = 10 + (constituicao -10) / 2
    }

    override fun toString(): String {
        return "Nome: $nome, Classe: ${classe?.name}, Raça: ${raca?.name}, " +
                "Força: $forca, Destreza: $destreza, Constituição: $constituicao, " + // Corrigido para 'constituicao'
                "Inteligência: $inteligencia, Sabedoria: $sabedoria, Carisma: $carisma, " +
                "Pontos de Vida: $pontosDeVida"
    }
}
