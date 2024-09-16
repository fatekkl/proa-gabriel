package exercicios.logica.horadecodar6

import kotlin.system.exitProcess


val records = mutableListOf<Person>()

fun main() {


    println(
        "Menu: \n" +
                "1 -> Cadastrar \n" +
                "2 -> Pesquisar \n" +
                "3 -> Listar em ordem alfabetica \n" +
                "4 -> Listar por ordem de registro \n" +
                "5 -> Sair"
    )
    val option = readln().toInt()

    when(option) {
        1 -> register()
//        2 -> search()
//        3 -> showOrdered()
//        4 -> show()
        5 -> exitProcess(400)
    }
}

fun register() {
    println("Qual seu nome? \n")

    val name = readln()

    println("Qual seu endereco? \n")
    val address = readln()


    println("Qual seu numero de telefone? ")
    var phone = readln()

    while(!validatePhone(phone)){
        println("Insira um telefone valido!")
        phone = readln()
    }

    val register = Person(name,address,phone)

    records.add(register)
    println(records)
}

fun validatePhone(phone: String): Boolean {
    val regex = Regex("^\\\\d{11}\\\$")
    return regex.matches(phone)
}

data class Person(val name: String, val address: String, val phone: String)