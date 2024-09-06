package hotel.src.models

import kotlin.math.ceil

abstract class Auditorium(
    val chairs: Int,
    val additional: Int,
    val week: List<String> = listOf(
        "segunda",
        "terca",
        "quarta",
        "quinta",
        "sexta",
        "sabado",
        "domingo"
    ),
) {


    abstract fun reserve(visitants: Int)

    protected fun schedule() {
        println("Agora vamos ver a agenda do evento \n")

        println("Qual o dia do seu evento?")

        val response = readln().lowercase()

        if (week.indexOf(response) <= 3) {
            println("Qual a hora do seu evento?")
            val hour = readln().toInt()

            if (hour in 7..23) {
                println("Qual o nome da sua empresa?")
                val businessName = readln()

                println("Auditorio reservado para a empresa $businessName. $response as ${hour}hs")
            } else {
                println("Auditorio indisponivel")
            }
        }
    }

    protected fun waiters(visitants: Int) {
        val waiters = ceil((visitants / 12).toDouble()).toInt()
        println("Serão necessarios $waiters garcons \n")

        println("Qual a duracão do evento em horas? \n")
        val hours = readln().toInt()

        val waitersPrice = waiters * hours * 10.50

        println("O Custo dos garcons sera $waitersPrice")
    }

    protected fun buffet(visitants: Int) {
        val coffe = visitants * 0.2
        val water = visitants * 0.5
        val savory = visitants * 7

        println(
            "o evento precisara de $coffe litros de cafe para $visitants convidados \n" +
                    "$water litros de agua para $visitants convidados \n" +
                    "$savory salgados para $visitants convidados \n"
        )

        println("Os precos serão: \n" +
                "Cafe: ${ceil(coffe * 0.80)} reais \n" +
                "Agua: ${ceil(water * 0.40)} reais \n" +
                "Salgados: ${ceil(savory * 0.34)} reais")

    }
}