package hotel.src.models

class Orange: Auditorium(150, 70) {

    override fun reserve(visitants: Int) {
        println("O Auditorio Laranja pode ser reservado, você vai precisar de ${visitants - chairs} cadeiras adicionais")
        println("Agora vamos ver a agenda do evento \n")

        println("Qual o dia do seu evento?")

        val response = readln().lowercase()

        if (super.week.indexOf(response) <= 3){
            println("o indice de $response è ${super.week.indexOf(response)}")
        }

    }
}