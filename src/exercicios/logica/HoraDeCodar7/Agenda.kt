package exercicios.logica.HoraDeCodar7

val registers = mutableListOf<Record>()

data class Record(val name: String, val address: String, val phone: String)

fun main() {
    println("Iniciando...")
    menu()
}

fun printRegisters() {
    println("A Lista de registros é: $registers")
    menu()
}

fun orderRegisters() {

    registers.sortBy {it.name}
    println("A Lista foi ordenada!!")
    menu()
}

fun searchRegister() {
    println("Qual o nome registrado?")
    val name = readln()
    val searched = registers.find{ it.name == name }
    if (searched != null) {
        println("O ${searched.name} foi encontrado!")
    } else {
        println("Nada foi encontrado :(")
        menu()
    }
}

fun register() {
    println("Qual seu endereço?")
    val address = readln()
    println("Qual seu nome?")
    val name = readln()
    println("Qual seu telefone? ex: '12 123456789'")
    val phone = readln()

    val record = Record(name, address, phone)
    registers.add(record)
    menu()
}

fun menu() {
    println(
        "Selecione a sua opção: \n" +
                "1 -> Registrar \n" +
                "2 -> Procurar Registro \n" +
                "3 -> Ordenar pelo nome \n" +
                "4 -> Mostrar todos os registros"
    )
    val option = readln().toInt()

    when (option) {
        1 -> register()
        2 -> searchRegister()
        3 -> orderRegisters()
        4 -> printRegisters()
        else -> menu()
    }
}


