package personagem

import Interfaces.IRaca
import Interfaces.IClass
import kotlin.system.exitProcess

class DistribuicaoPontos {

    fun distribuirAtributosIniciais(personagem: GameCharacter, raca: IRaca, classe: IClass) {

        personagem.forca = 8
        personagem.destreza = 8
        personagem.constituicao = 8
        personagem.inteligencia = 8
        personagem.sabedoria = 8
        personagem.carisma = 8

        aplicarBonus(raca.bonusStats, personagem)

        aplicarBonus(classe.bonusStats, personagem)
    }

    private fun aplicarBonus(bonusStats: Map<String, Int>, personagem: GameCharacter) {
        bonusStats.forEach { (atributo, valor) ->
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

    fun ajustarAtributo(atributo: String, personagem: GameCharacter, aumento: Boolean): Boolean {
        val valorAtual = when (atributo.lowercase()) {
            "força" -> personagem.forca
            "destreza" -> personagem.destreza
            "constituição" -> personagem.constituicao
            "inteligência" -> personagem.inteligencia
            "sabedoria" -> personagem.sabedoria
            "carisma" -> personagem.carisma
            else -> return false
        }

        if (aumento && valorAtual < 15) {
            when (atributo.lowercase()) {
                "força" -> personagem.forca += 1
                "destreza" -> personagem.destreza += 1
                "constituição" -> personagem.constituicao += 1
                "inteligência" -> personagem.inteligencia += 1
                "sabedoria" -> personagem.sabedoria += 1
                "carisma" -> personagem.carisma += 1
            }
            return true
        } else if (!aumento && valorAtual > 8) {
            when (atributo.lowercase()) {
                "força" -> personagem.forca -= 1
                "destreza" -> personagem.destreza -= 1
                "constituição" -> personagem.constituicao -= 1
                "inteligência" -> personagem.inteligencia -= 1
                "sabedoria" -> personagem.sabedoria -= 1
                "carisma" -> personagem.carisma -= 1
            }
            return true
        }

        return false
    }

    // Exemplo de raças e classes
    data class Raca(override val bonusStats: Map<String, Int>) : IRaca
    data class Classe(override val bonusStats: Map<String, Int>) : IClass

    fun obterRacaEscolhida(racaEscolhida: String): IRaca {
        return when (racaEscolhida) {
            "Humano" -> Raca(mapOf("força" to 1))
            "Elfo" -> Raca(mapOf("destreza" to 2))
            // Adicione mais raças conforme necessário
            else -> Raca(emptyMap())
        }
    }

    fun obterClasseEscolhida(classeEscolhida: String): IClass {
        return when (classeEscolhida) {
            "Guerreiro" -> Classe(mapOf("força" to 2))
            "Mago" -> Classe(mapOf("inteligência" to 3))
            // Adicione mais classes conforme necessário
            else -> Classe(emptyMap())
        }
    }

}
