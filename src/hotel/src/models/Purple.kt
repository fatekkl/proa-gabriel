package hotel.src.models

class Purple: Auditorium(350, 0) {

    override fun reserve(visitants: Int) {
        println("O auditorio colorado foi reservado, nesse auditorio não são necessarias cadeiras adicionais")
        println("Agora vamos ver a agenda do evento")

    }
}