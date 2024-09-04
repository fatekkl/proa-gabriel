package hotel.src.models

abstract class Auditorium(val chairs: Int, val additional: Int) {

    abstract fun reserve(visitants: Int)
}