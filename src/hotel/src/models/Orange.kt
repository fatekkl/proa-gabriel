package hotel.src.models

class Orange: Auditorium(150, 70) {

    override fun reserve(visitants: Int) {
        println("O Auditorio Laranja pode ser reservado, você vai precisar de ${visitants - chairs} cadeiras adicionais")
    }
}