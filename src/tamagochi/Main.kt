package tamagochi

import tamagochi.models.Tamagochi



fun main () {
    println("Bem vindo ao Tamagochi!")
    println("Insira o nome de seu pet!")
    val petName = readln()
    val rakan = Tamagochi("Matheus")

    while (true) {
        println("\nEscolha uma ação:")
        println("1. Alimentar $petName")
        println("2. Brincar com $petName")
        println("3. Status do $petName")
        println("4. Colocar $petName pra dormir")
        println("5. Sair")
        
        val action = readln().toInt()
        
        when(action) {
            1 -> rakan.eat()
            2 -> rakan.joke()
            3 -> rakan.status()
            4 -> rakan.rest()
            5 -> {
                println("Encerrando tamagochi...")

                return
            }

        }
        rakan.pastTime()
        if(!rakan.isAlive()){
            println("Infelizmente $petName não resistiu...")
            return
        }
    }
}