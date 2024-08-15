package exercicios.logica
fun main () {
    fun primeiro () {
        println("Insira um número: ")
        var num = readln()

        print("Insira outro número: ")
        val num2 = readln()
        if (num2 > num) {
            num = num2
        }

        println("\nO maior número é: $num")
    }

    fun segundo () {
        println("Informe um valor: ")
        val num = readln().toInt()

        when {
            num > 0 -> println("É positivo") // num is greater than 0
            num < 0 -> println("É negativo") // num is less than 0
            else -> println("É zero")        // num is exactly 0
        }
    }

    fun terceiro () {
        val nums = mutableListOf<Int>()

        println("Insira o primeiro valor: ")
        nums.add(readln().toInt())

        println("Insira o segundo valor: ")
        nums.add(readln().toInt())

        println("Insira o terceiro valor: ")
        nums.add(readln().toInt())

        val maior = nums.maxOrNull()

        println(maior)
    }
}