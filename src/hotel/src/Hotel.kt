package hotel.src

class Hotel(
    private val hotelName: String = "Therabithia",
    private var guestName: String? = null,
    private val rooms: Map<Int, Boolean> = mapOf(
        1 to false,
        2 to false,
        3 to false,
        4 to false,
        5 to false,
        6 to false,
        7 to false,
        8 to false,
        9 to false,
        10 to false,
        11 to false,
        12 to false,
        13 to false,
        14 to false,
        15 to false,
        16 to false,
        17 to false,
        18 to false,
        19 to false,
        20 to false
    )
) {

    private var passReceived: String? = null

    fun start() {
        println("Bem vindo ao $hotelName")
        println("Qual seu nome? ")
        guestName = readln()

        println("Insira a senha: ")
        passReceived = readln()

        if (verifyPass(passReceived)) {
            println(
                "Bem vindo ao Hotel $hotelName, $guestName." +
                        "È um prazer ter você aqui!"
            )

            println(
                "Selecione sua opcão:  \n" +
                        "1 -> Selecionar um quarto  \n" +
                        "2 -> Cadastre-se como um hòspede  \n" +
                        "3 -> Informacões sobre reabastecimento  \n" +
                        "4 -> Sair do hotel  \n"
            )

            val selected = readln().toInt()
            menu(selected)
        }
    }

    private fun menu(option: Int) {
        when (option) {
            1 -> registerRoom()
//            2 -> registerGuest()
//            3 -> gasStation()
//            4 -> leave()
            else -> mistake()

        }
    }

    private fun registerRoom() {
        println(rooms)
    }
}