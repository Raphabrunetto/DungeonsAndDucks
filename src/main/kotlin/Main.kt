import personagem.GameCharacter
import personagem.GameData

fun main() {
    val gameData = GameData()

    val races = gameData.getRaces()
    val classes = gameData.getClasses()

    val selectedRace = chooseRace(races)
    val selectedClass = chooseClass(classes)
    val characterName = chooseCharacterName()

    val character = GameCharacter(
        name = characterName,
        race = selectedRace,
        characterClass = selectedClass
    )

    character.distribuirPontosAtributos(27) // Distribui 27 pontos de atributo
    character.displayCharacterInfo() // Exibe as informações do personagem
}
