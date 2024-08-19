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

}