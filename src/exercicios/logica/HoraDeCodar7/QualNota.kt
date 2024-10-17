package exercicios.logica.HoraDeCodar7.QualNota

data class Record(val name: String, val media: Int)
val registers = mutableListOf<Record>()

fun main () {
    register("Teste", 5)
}

fun register(name: String, media: Int) {
    val record = Record(name,media)

    registers.add(record)
}

fun search(name: String) {
    val finded = registers.find { it.name == name }

    if (finded != null) {
        when{
            finded.media < 5 -> println("${finded.name} foi reprovado com a média ${finded.media}")
            else -> println("${finded.name} foi aprovado com a média ${finded.media}")
        }
    }
}

fun showAll() {
    registers.forEach {
        when {
            it.media < 5 -> println("${it.name} foi reprovado com média ${it.media}")
            else -> println("${it.name} foi aprovado com média ${it.media}")

        }
    }
}