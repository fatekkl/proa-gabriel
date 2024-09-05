package hotel.src.models

class Orange: Auditorium(150, 70) {

    override fun reserve(visitants: Int) {

        if (visitants > chairs) {
            println("O Auditorio Laranja pode ser reservado, você vai precisar de ${visitants - chairs} cadeiras adicionais")
        } else {
            println("O Auditorio Laranja pode ser reservado \n")
        }

        println("Agora vamos ver a agenda do evento \n")

        println("Qual o dia do seu evento?")

        val response = readln().lowercase()

        if (super.week.indexOf(response) <= 3){
            println("Qual a hora do seu evento?")
            val hour = readln().toInt()

            if (hour in 7..23) {
                println("Qual o nome da sua empresa?")
                val businessName = readln()

                println("Auditorio reservado para a empresa $businessName. Dia$response as ${hour}hs")
            } else {
                println("Auditorio indisponivel")
            }
        }

    }
}