package hotel.src

class Hotel(
    private val hotelName: String = "Therabithia",
    private var guestName: String? = null,
    private val rooms: List<Quarto> = listOf(
        Quarto(1),
        Quarto(2),
        Quarto(3),
        Quarto(4),
        Quarto(5),
        Quarto(6),
        Quarto(7),
        Quarto(8),
        Quarto(9),
        Quarto(10),
        Quarto(11),
        Quarto(12),
        Quarto(13),
        Quarto(14),
        Quarto(15),
        Quarto(16),
        Quarto(17),
        Quarto(18),
        Quarto(19),
        Quarto(20)
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
            2 -> registerGuest()
//            3 -> gasStation()
//            4 -> leave()
            else -> mistake()

        }
    }

    private fun registerGuest() {
        var gratuidades = 0
        var meias = 0
        var total = 0.0
        var checker = false
        while (!checker) {
            println("Insira o nome do hòspede: ")
            val resposta = readln()
            println("Insira a idade do hòspede, ou digite PARE")
            val idade = readln()

            if (resposta != "PARE" || idade != "PARE") {
                when {
                    idade.toInt() < 6 -> {
                        println("$resposta possui gratuidade")
                        gratuidades++
                    }

                    idade.toInt() > 60 -> {
                        println("$resposta paga meia")
                        meias++
                        total += daily / 2
                    }
                }
            } else {
                checker = true
            }

        }

        println(
            "Gratuidades: $gratuidades \n" +
                    "Meias: $meias \n" +
                    "Total: $total"
        )
    }

    private fun registerRoom() {
        println("Informe a quantidade dias que pretende se hospedar, sendo no maximo 30 dias: ")

        var days = readln().toInt()

        while (days > 30 || days <= 0) {
            println("Informe um valor vàlido: ")
            days = readln().toInt()
        }

        val total = days * daily

        println("Escolha um quarto | 1-20")
        var roomNumber = readln().toInt() - 1

        while (rooms[roomNumber].ocupado) {
            println("Quarto ja ocupado, escolha outro: ")
            roomNumber = readln().toInt() - 1
        }

        println("Você confirma a reserva? Y/N")
        val response = readln()
        if (response == "Y" || response == "y") {
            rooms[roomNumber].ocupado = true
            println("Você reservou o quarto $roomNumber, os $days dias custarão $total reais")
            println(rooms)
        } else {
            start()
        }
    }
}
