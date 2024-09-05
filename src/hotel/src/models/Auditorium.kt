package hotel.src.models

abstract class Auditorium(
    val chairs: Int,
    val additional: Int,
    val week: List<String> = listOf(
        "segunda",
        "terca",
        "quarta",
        "quinta",
        "sexta",
        "sabado",
        "domingo"
    )
) {


    abstract fun reserve(visitants: Int)
}