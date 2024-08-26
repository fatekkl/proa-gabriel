fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5, 6)



    list.forEach {
        if (it <= 5) {
            list.remove(it)
        }
    }

    print(list)


}