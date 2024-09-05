package hotel.src.models

class Purple: Auditorium(350, 0) {

    override fun reserve(visitants: Int) {
        println("O auditorio colorado foi reservado, nesse auditorio não são necessarias cadeiras adicionais")
        println("Agora vamos ver a agenda do evento \n")

        println("Qual o dia do seu evento?")

        val response = readln().lowercase()

        if (super.week.indexOf(response) > 3){
            println("Qual a hora do seu evento?")
            val hour = readln().toInt()

            if (hour in 7..15) {
                println("Qual o nome da sua empresa?")
                val businessName = readln()

                println("Auditorio reservado para a empresa $businessName. Dia $response as ${hour}hs")
            } else {
                println("Auditorio indisponivel")
            }
        }

    }
}