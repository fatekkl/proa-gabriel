package tamagochi.models

class Tamagochi(val name: String, private var hunger: Int = 30, private var happiness: Int = 50, private var fatigue: Int = 0, private var age: Int = 0, private var alive: Boolean = true) {


    fun eat() {
        hunger -= 5
        println("Minha fome diminuiu um pouco!!!")
    }

    fun joke() {
        happiness += 10
        fatigue += 20
        println("Me sinto mais feliz.")
    }

    fun rest() {
        println("Vou descansar um pouco")
        fatigue -= 30
    }

    fun status() {
        println(
            "$name \n" +
                    "Fome: $hunger \n" +
                    "Felicidade: $happiness \n" +
                    "Cansaço: $fatigue \n" +
                    "Idade: $age"
        )
    }

    fun pastTime() {
        hunger += 3
        fatigue -= 2
        happiness -= 3
        age += 1
        println("O tempo passa e eu sinto um pouco mais de fome...")
    }

    fun isAlive(): Boolean {
        when {
            hunger < 0 -> hunger = 0
            hunger >= 100 -> alive = false
            happiness <= 0 -> alive = false
            happiness > 100 -> happiness = 100
            fatigue <= 0 -> fatigue = 0
            fatigue >= 100 -> alive = false
        }

        return alive

    }
}