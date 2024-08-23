import org.example.DistribuicaoPersonalizada
import org.example.GameCharacter
import personagem.GameData

fun main() {
    val distribuidor = DistribuicaoPersonalizada()
    val gameData = GameData()
    val races = gameData.getRaces()
    val classes = gameData.getClasses()

    // Escolha da raça e da classe
    val selectedRace = chooseRace(races)
    val selectedClass = chooseClass(classes)
    val characterName = chooseCharacterName()

    // Criação do personagem
    val character = GameCharacter()

    // Distribuir atributos
    distribuidor.distribuirAtributos(character, selectedRace, selectedClass)

    // Exibir informações do personagem
    println("Personagem criado: $characterName")
    println("Raça: ${selectedRace.name}")
    println("Classe: ${selectedClass.name}")
    println("Atributos:")
    println("Força: ${character.forca}")
    println("Destreza: ${character.destreza}")
    println("Constituição: ${character.constituicao}")
    println("Inteligência: ${character.inteligencia}")
    println("Sabedoria: ${character.sabedoria}")
    println("Carisma: ${character.carisma}")
}
