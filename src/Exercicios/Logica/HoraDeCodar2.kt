package exercicios.logica

fun main() {
    fun primeiro() {
        println("Insira um número: ")
        var num = readln()

        print("Insira outro número: ")
        val num2 = readln()
        if (num2 > num) {
            num = num2
        }

        println("\nO maior número é: $num")
    }

    fun segundo() {
        println("Informe um valor: ")
        val num = readln().toInt()

        when {
            num > 0 -> println("É positivo") // num is greater than 0
            num < 0 -> println("É negativo") // num is less than 0
            else -> println("É zero")        // num is exactly 0
        }
    }

    fun terceiro() {
        val nums = mutableListOf<Int>()

        println("Insira o primeiro valor: ")
        nums.add(readln().toInt())

        println("Insira o segundo valor: ")
        nums.add(readln().toInt())

        println("Insira o terceiro valor: ")
        nums.add(readln().toInt())

        var maior = nums[0]

        for (i in nums) {
            if (i > maior) {
                maior = i
            }
        }

        // solucao que usa funcao nativa do kotlin
        // val maior = nums.maxOrNull()

        println(maior)
    }

    fun quarto() {
        val list = mutableListOf<Int>()

        println("Informe um valor: ")
        list.add(readln().toInt())

        println("Informe outro valor: ")
        list.add(readln().toInt())

        println("O ultimo valor: ")
        list.add(readln().toInt())

        var minor = list[0]

        for (p in list) {
            if (p < minor) {
                minor = p
            }
        }



//      solucao com funcao nativa do Kotlin
//      val minor = list.minOrNull()
        list.remove(minor)
        println(list[0] + list[1])
    }

    fun quinto() {
        val list = mutableListOf<Int>()

        println("Informe um valor: ")
        list.add(readln().toInt())
        println("Informe um valor: ")
        list.add(readln().toInt())
        println("Informe um valor: ")
        list.add(readln().toInt())
        println("Informe um valor: ")
        list.add(readln().toInt())
        println("Informe um valor: ")
        list.add(readln().toInt())
        println("Informe um valor: ")
        list.add(readln().toInt())

        println(list)

        var media = 0

        for (i in list) {
            media += i
        }

        media /= list.size


        println("A mèdia è: $media")
    }

    fun sexto() {
        val list = mutableListOf<Int>()

        println("Informe um valor: ")
        list.add(readln().toInt())
        println("Informe um valor: ")
        list.add(readln().toInt())
        println("Informe um valor: ")
        list.add(readln().toInt())
        println("Informe um valor: ")
        list.add(readln().toInt())

        println(
            "O primeiro è: ${list[0]}," +
                    "O ultimo è: ${list[list.size - 1]}," +
                    "O maior è: ${list.maxOrNull()}"
        )
    }

    fun setimo() {
        val list = mutableListOf<Int>()

        println("Informe um valor: ")
        list.add(readln().toInt())
        println("Informe um valor: ")
        list.add(readln().toInt())
        println("Informe um valor: ")
        list.add(readln().toInt())
        println("Informe um valor: ")
        list.add(readln().toInt())
        println("Informe um valor: ")
        list.add(readln().toInt())
        println("Informe um valor: ")
        list.add(readln().toInt())

        var soma = 0

        for (i in list) {
            if (i <= 72) {
                soma += i
            }
        }

        println("\n A soma è $soma")

        println(list)
    }

    fun oitavo() {
        val list = mutableListOf<Int>()

        println("Informe um valor: ")
        list.add(readln().toInt())
        println("Informe um valor: ")
        list.add(readln().toInt())
        println("Informe um valor: ")
        list.add(readln().toInt())
        println("Informe um valor: ")
        list.add(readln().toInt())

        for (i in list) {
            if (i < 0 || i > 10) {
                list.remove(i)
            }
        }

        var soma = 0

        for (i in list) {
            soma += i
        }

        val media = soma / list.size

        if (media > 5) {
            println("Você passou no teste")
        } else {
            println("Tente novamente")
        }


    }

    fun nono() {
        println("Qual ano voce nasceu? ")
        val y = readln().toInt()

        if (2024 - y < 16) {
            println("Não pode votar")
        } else {
            println("Pode votar")
        }
    }

    fun decimo() {
        println("Feminino ou Masculino? 1|2")
        val num = readln().toInt()

        println("Insira sua altura: ")
        val h = readln().toDouble()

        var result = 0.0

        when (num) {
            1 -> result = (62.1 * h) - 44.7
            2 -> result = (72.7 * h) - 58
        }

        println(result)
    }

}