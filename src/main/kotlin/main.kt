fun main(args: Array<String>) {
    println(
        """
        "============================"
        "GAME SUIT TERMINAL VERSION"
        "============================"
    """.trimIndent()
    )
    val choice = arrayOf("GUNTING", "BATU", "KERTAS")
    val inputOne = Player1(choice)
    val inputTwo = Player2(choice)

    println("Hasil Pemenangnya Adalah : ")

    val controller = GameRule(output)
    controller.rules(inputOne!!.toUpperCase(), inputTwo!!.toUpperCase())
}

fun Player1(optionsParam: Array<String>): String {
    var isValidChoice = false
    var playerOneChoice = ""
    while (!isValidChoice) {
        for (item in optionsParam) ("$item")
        println("1. Masukan Pemain 1 :")
        val inputPlayerOne = readLine()?.toUpperCase()

        when {
            inputPlayerOne != null && inputPlayerOne in optionsParam -> {
                isValidChoice = true
                playerOneChoice = inputPlayerOne
            }
        }
        if (!isValidChoice!!) println("Masukan pilihan yang ada : GUNTING,BATU,KERTAS")
    }
    return playerOneChoice
}

fun Player2(optionsParam: Array<String>): String {
    var isValidChoice = false
    var playerTwoChoice = ""
    while (!isValidChoice) {
        for (item in optionsParam) ("$item")
        println("2. Masukan Pemain 2 :")
        val inputPlayerTwo = readLine()?.toUpperCase()

        when {
            inputPlayerTwo != null && inputPlayerTwo in optionsParam -> {
                isValidChoice = true
                playerTwoChoice = inputPlayerTwo
            }
        }
        if (!isValidChoice!!) println("Masukan pilihan yang ada : GUNTING,BATU,KERTAS")
    }
    return playerTwoChoice
}

val output = object : outputGame {
    override fun result(msg: String) {
        println(msg)
    }
}
