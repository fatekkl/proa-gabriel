package exercicios.logica

import java.util.*

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

    fun segundo() {
        val planets = arrayOf("TERRA", "MARTE", "PLUTÃO", "VÊNUS", "JUPITER", "SATURNO")

        println("Insira o nome de um planeta: ")
        val read = readln().uppercase(Locale.getDefault())

        for (element in planets) {
            if (element == read) {
                println("O planeta $read esta na lista")
                break
            }
            println("$read não esta na lista")
            break
        }
    }

    fun terceiro() {
        val fruits = mutableListOf("Banana", "Manga", "Melancia")

        for (element in fruits) {
            println(element)
        }

        while (fruits.isNotEmpty()) {
            println("Digite uma fruta para ser retirada: ")
            val toDelete = readln()

            if (fruits.remove(toDelete)) {
                println("$toDelete foi removido")
            } else {
                println("$toDelete não foi encontrado!")

            }

        }

        println("Lista de compras finalizada!")
    }

}