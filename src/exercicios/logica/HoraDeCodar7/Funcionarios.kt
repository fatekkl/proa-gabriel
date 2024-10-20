package exercicios.logica.HoraDeCodar7.Funcionarios


data class Employer(val name: String, val registration: Int, val salary: Int)

val employees = mutableListOf<Employer>()

fun main () {
    register("teste", 2000)
    register("teste", 1500)
}

fun register (name: String, salary: Int) {
    val employer = Employer(name, employees.size,salary)

    employees.add(employer)
}

fun searchByRegistration(n: Int) {
    employees.forEach {
        when(it.registration){
            n -> println("O funcionario ${it.name} foi encontrado!!")
        }
    }
}

fun searchMinorSalary() {
    val pobres = mutableListOf<Employer>()

    employees.forEach {
        when {
            it.salary < 1000 -> pobres.add(it)
        }
    }

    println(pobres)
}

fun searchEqualSalary() {
    val CLT = mutableListOf<Employer>()

    employees.forEach {
        when {
            it.salary == 1000 -> CLT.add(it)
        }
    }

    println(CLT)
}