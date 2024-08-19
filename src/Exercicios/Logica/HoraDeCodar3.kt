package exercicios.logica

fun main () {

    fun primeiro()  {
        println("Insira um valor: ")
        val num = readln().toInt()
        var num2 = 0

        println("Agora insira outro valor, maior que zero: ")
        while (num2 <= 0){
            println("MAIOR QUE ZERO!")
            num2 = readln().toInt()
        }


        println("a divisão deu: ${num / num2}")
    }

    fun segundo() {
        var counter = 30

        while (counter != 0){
            println("Faltam $counter segundos")
            counter--
            Thread.sleep(900)
        }

        println("💥💥EXPLOSÃO💥💥")
    }

    fun terceiro() {
        for (i in 10 downTo 1) {
            println(i)
        }
    }

    fun quarto() {
        var soma = 0

        for (i in 15..100){
            soma += i
        }

        val m = soma.toDouble()/86.0

        println(m)
    }

    fun quinto() {
        var soma = 0

        println("Insira o menor numero: ")
        val num = readln().toInt()
        println("Insira o maior numero: ")
        val num2 = readln().toInt()

        for (i in num..num2) {
            soma += i
        }

        val contador = num2 - num + 1

        val m = soma.toDouble()/contador.toDouble()

        println("A media è $m")
    }

    fun sexto(oldcount: Int = 0) {

        var count = oldcount

        println("Informe sua primeira nota: ")
        val nota1 = readln().toDouble()

        println("Insira sua segunda nota: ")
        val nota2 = readln().toDouble()

        if ((nota1 + nota2) / 2 >= 9.5) {
            println("Foi aprovado!!!")
            count++
        } else {
            println("Foi reprovado ☹")
        }

        println("Calcular a média de outro aluno Y/N?")
        if (readln() == "Y") {
            sexto(count)
        } else {
            println("$count alunos foram aprovados")
        }
    }

    fun setimo () {
        var soma = 0

        for (i in 1..6) {
            println("Informe uma nota de 0 a 10: ")
            val num = readln().toInt()
            if (num in 0..10) {
                soma += num
            }
        }
        val result = soma/6

        println("A media è $result")
    }

    fun oitavo() {
        println("Informe um numero: ")
        val n = readln().toInt()

        for (i in 1..n) {
            println(i)
        }
    }

    fun nono() {
        var i = 0
        while(i != 10) {
            i++
            println(100 + i)
        }
    }

    fun decimo() {
        println("Informe um numero: ")
        val n = readln().toInt()

        for (i in 1..n){
            println("Tabuada do $i")
            for (j in 1..10) {
                println("$i * $j = ${i*j}")
            }
        }
    }

    fun decimo_primeiro() {
        val inside =  mutableListOf<Int>()
        val outside = mutableListOf<Int>()

        for (i in 1..10) {
            println("Insira um numero: ")
            val num = readln().toInt()

            if (num in 24..42) {
                inside.add(num)
            } else {
                outside.add(num)
            }
        }

        println("${inside.size} numeros estão entre 24 e 42")
        println("${outside.size} numeros estão fora 24 e 42")
    }

}