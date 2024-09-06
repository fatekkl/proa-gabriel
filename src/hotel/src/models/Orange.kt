package hotel.src.models

class Orange : Auditorium(150, 70) {

    override fun reserve(visitants: Int) {

        if (visitants > chairs) {
            println("O Auditorio Laranja pode ser reservado, você vai precisar de ${visitants - chairs} cadeiras adicionais \n")
        } else {
            println("O Auditorio Laranja pode ser reservado \n")
        }
        schedule()
        waiters(visitants)
        buffet(visitants)
    }


}