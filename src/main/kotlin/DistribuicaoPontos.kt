package personagem

import Interfaces.IRaca
import Interfaces.IClass

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
}
