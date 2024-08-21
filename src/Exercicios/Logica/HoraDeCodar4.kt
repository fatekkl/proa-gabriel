package exercicios.logica

fun main() {

    fun primeiro(list: MutableList<String> = mutableListOf()) {

        println("Qual o nome do/da estudante? caso queira parar digite PARE")
        val read = readln()

        if (read != "PARE") {
            list.add(read)
            println("$read foi adicionado(a) a lista!")
            primeiro(list)
        } else {
            println("Existem ${list.size} estudantes, sendo eles $list")
        }


    }

    primeiro()
}