package exercicios.logica.HoraDeCodar7.NomeAltura


data class Person(val name: String, val height: Double)

val persons = mutableListOf<Person>()

fun main () {

}

fun register(name: String, height: Double) {
    val person = Person(name,height)

    persons.add(person)
    println("Adicionado!")
}

fun showMinor() {
    persons.forEach {
        when {
            it.height <= 1.5 -> println("O ${it.name} tem ${it.height} de altura!")
        }
    }
}

fun showBigger() {
    persons.forEach {
        when {
            it.height > 1.5 -> println("O ${it.name} tem ${it.height} de altura!")
        }
    }
}

fun showMinor2() {
    persons.forEach {
        when {
            it.height > 1.5 && it.height < 2 -> println("O ${it.name} tem ${it.height} de altura!")
        }
    }
}

fun showMedia() {
    var count = 0
    var heights = 0.0
    persons.forEach {
        count++
        heights += it.height
    }
    println("${heights / count}")
}