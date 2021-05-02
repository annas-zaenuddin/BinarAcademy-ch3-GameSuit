data class GameRule (private val output: outputGame) {
    fun rules(playerOne: String, playerTwo: String) {
        when {
            playerOne == playerTwo -> {
                output.result("DRAW")
            }
            playerOne == "GUNTING" && playerTwo == "KERTAS" ||
                    playerOne == "BATU" && playerTwo == "GUNTING" ||
                    playerOne == "KERTAS" && playerTwo == "BATU" -> {
                output.result("Pemain 1 Menang!")
            }
            else -> {
                output.result("Pemain 2 Menang!")
            }
        }
    }
}
