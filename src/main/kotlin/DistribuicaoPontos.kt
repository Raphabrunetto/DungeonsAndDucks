package personagem

import Interfaces.IRaca
import Interfaces.IClass
import kotlin.system.exitProcess

class DistribuicaoPontos {
    fun distribuirAtributos(personagem: GameCharacter, raca: IRaca, classe: IClass) {
        // Aplica os bônus da raça
        raca.bonusStats.forEach { (atributo, valor) ->
            when (atributo.lowercase()) {
                "força" -> personagem.forca += valor
                "destreza" -> personagem.destreza += valor
                "constituição" -> personagem.constituicao += valor
                "inteligência" -> personagem.inteligencia += valor
                "sabedoria" -> personagem.sabedoria += valor
                "carisma" -> personagem.carisma += valor
            }
        }

        // Aplica os bônus da classe
        classe.bonusStats.forEach { (atributo, valor) ->
            when (atributo.lowercase()) {
                "força" -> personagem.forca += valor
                "destreza" -> personagem.destreza += valor
                "constituição" -> personagem.constituicao += valor
                "inteligência" -> personagem.inteligencia += valor
                "sabedoria" -> personagem.sabedoria += valor
                "carisma" -> personagem.carisma += valor
            }
        }
    }

    fun distribuirPontosJogador(personagem: GameCharacter) {
        var pontosRestantes = 27

        fun alocarPontos(atributo: String): Int {
            while (true) {
                println("Você tem $pontosRestantes pontos restantes. Quantos pontos deseja alocar para $atributo? (mínimo 8, máximo 15)")
                val pontos = readLine()?.toIntOrNull() ?: 0
                if (pontos in 8..15 && (pontosRestantes - (pontos - 8)) >= 0) {
                    pontosRestantes -= (pontos - 8)
                    return pontos
                } else {
                    println("Entrada inválida. Tente novamente.")
                }
            }
        }

        personagem.forca = alocarPontos("Força")
        personagem.destreza = alocarPontos("Destreza")
        personagem.constituicao = alocarPontos("Constituição")
        personagem.inteligencia = alocarPontos("Inteligência")
        personagem.sabedoria = alocarPontos("Sabedoria")
        personagem.carisma = alocarPontos("Carisma")

        println("Distribuição de pontos finalizada. Atributos definidos:")
        println("Força: ${personagem.forca}, Destreza: ${personagem.destreza}, Constituição: ${personagem.constituicao}")
        println("Inteligência: ${personagem.inteligencia}, Sabedoria: ${personagem.sabedoria}, Carisma: ${personagem.carisma}")
    }
}
