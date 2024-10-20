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