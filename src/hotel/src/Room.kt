package hotel.src

data class Room(val number: Int, var occupied: Boolean = false, val guests: List<Guest> = listOf()) {
}