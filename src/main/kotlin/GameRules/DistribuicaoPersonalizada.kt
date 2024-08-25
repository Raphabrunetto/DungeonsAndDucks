import personagem.CharacterClass
import personagem.Race
import java.util.logging.ConsoleHandler
import java.util.logging.Level
import java.util.logging.Logger
import java.util.logging.SimpleFormatter

class DistribuicaoPersonalizada {
    private val logger: Logger = Logger.getLogger(DistribuicaoPersonalizada::class.java.name)
    private var pontosRestantes = 27

    init {
        val consoleHandler = ConsoleHandler()
        consoleHandler.level = Level.ALL
        consoleHandler.formatter = SimpleFormatter()
        logger.addHandler(consoleHandler)
        logger.useParentHandlers = false
    }

    fun distribuirAtributos(personagem: GameCharacter, raça: Race, classe: CharacterClass) {
        logger.info("Você tem $pontosRestantes pontos para distribuir entre os seguintes atributos. Força, Destreza, Constituição, Inteligência, Sabedoria, Carisma.")

        aplicarBonusDeRaça(personagem, raça)
        aplicarBonusDeClasse(personagem, classe)

        // Distribuir pontos restantes e atualizar atributos
        personagem.forca = definirAtributo("Força", personagem.forca)
        personagem.destreza = definirAtributo("Destreza", personagem.destreza)
        personagem.constituicao = definirAtributo("Constituição", personagem.constituicao)
        personagem.inteligencia = definirAtributo("Inteligência", personagem.inteligencia)
        personagem.sabedoria = definirAtributo("Sabedoria", personagem.sabedoria)
        personagem.carisma = definirAtributo("Carisma", personagem.carisma)

        personagem.atualizarPontosDeVida()
    }

    private fun aplicarBonusDeRaça(personagem: GameCharacter, raça: Race) {
        raça.bonusStats.forEach { (atributo, bonus) ->
            when (atributo.toLowerCase()) {
                "força" -> personagem.forca += bonus
                "destreza" -> personagem.destreza += bonus
                "constituição" -> personagem.constituicao += bonus
                "inteligência" -> personagem.inteligencia += bonus
                "sabedoria" -> personagem.sabedoria += bonus
                "carisma" -> personagem.carisma += bonus
            }
        }
    }

    private fun aplicarBonusDeClasse(personagem: GameCharacter, classe: CharacterClass) {
        classe.bonusStats.forEach { (atributo, bonus) ->
            when (atributo.toLowerCase()) {
                "força" -> personagem.forca += bonus
                "destreza" -> personagem.destreza += bonus
                "constituição" -> personagem.constituicao += bonus
                "inteligência" -> personagem.inteligencia += bonus
                "sabedoria" -> personagem.sabedoria += bonus
                "carisma" -> personagem.carisma += bonus
            }
        }
    }

    private fun definirAtributo(nomeAtributo: String, valorInicial: Int): Int {
        val limitePontos = 16
        var novoValor = valorInicial
        var entradaValida = false

        while (!entradaValida) {
            println("Preencha a $nomeAtributo (valor inicial: $valorInicial): ")
            val entrada = readLine()

            val pontosAdicionados = entrada?.toIntOrNull()
            if (pontosAdicionados == null) {
                println("Entrada inválida. Digite um número inteiro.")
                continue
            }

            val valorFinal = valorInicial + pontosAdicionados

            if (pontosAdicionados <= pontosRestantes && valorFinal in 8..limitePontos) {
                novoValor = valorFinal
                pontosRestantes -= pontosAdicionados

                println("$novoValor pontos de $nomeAtributo")
                println("$pontosRestantes pontos restantes")
                println("Deseja manter os pontos ou alterar?")
                println("1 - Manter")
                println("2 - Alterar")

                val escolha = readLine()?.toIntOrNull()
                if (escolha == 1) {
                    entradaValida = true
                } else if (escolha == 2) {
                    pontosRestantes += pontosAdicionados
                    novoValor = valorInicial
                    println("Os pontos de $nomeAtributo foram resetados para $valorInicial.")
                } else {
                    println("Escolha inválida. Por favor, escolha 1 ou 2.")
                }
            } else {
                println("Pontos inválidos. Você tem $pontosRestantes pontos restantes e o valor final de $nomeAtributo deve ser entre 8 e $limitePontos.")
            }
        }
        return novoValor
    }
}
