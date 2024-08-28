package hotel.src

class Hotel(
    private val hotelName: String = "Therabithia",
    private var guestName: String? = null,
    private val rooms: MutableMap<Int, Boolean> = mutableMapOf(
        1 to false,
        2 to true,
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
    private val daily: Double = 150.0
    private var passReceived: String? = null

    fun start() {
        println("Bem vindo ao hotel $hotelName")
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
        println("Informe a quantidade dias que pretende se hospedar, sendo no maximo 30 dias: ")

        var days = readln().toInt()

        while (days > 30 || days <= 0){
            println("Informe um valor vàlido: ")
            days = readln().toInt()
        }

        val total = days * daily

        println("Escolha um quarto | 1-20")
        var roomNumber = readln().toInt()

        while(rooms[roomNumber] == true) {
            println("Quarto ja ocupado, escolha outro: ")
            roomNumber = readln().toInt()
        }

        println("Você confirma a reserva? Y/N")
        val response = readln()
        if (response == "Y" || response == "y") {
            rooms[roomNumber] = true
            println("Você reservou o quarto $roomNumber, os $days dias custarão $total reais")
            println(rooms)
        } else {
            start()
        }
    }
}