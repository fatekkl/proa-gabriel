package hotel.src

fun verifyPass(passReceived: String?): Boolean {

    return when (passReceived){
        "2678" -> true
        else -> false
    }
}

fun mistake() {

}