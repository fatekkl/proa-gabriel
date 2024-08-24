package caixa_eletronico


const val green = "\u001B[32m"
const val reset = "\u001B[0m"
var balance: Double = 150.0
var username: String = ""
var password = "12345"

fun main() {


    fun menu(selected: Int?) {
        when (selected) {
            1 -> getBalance()
            2 -> println("Você selecionou ${green}Extrato${reset}")
            3 -> println("Você selecionou ${green}Saque!${reset}")
            4 -> println("Você selecionou ${green}Deposito${reset}")
            5 -> println("Você selecionou ${green}Transferencia${reset}")
            6 -> println("Você selecionou ${green}Sair${reset}")
            else -> println("Opcão invalida!")
        }
    }

    fun start() {

        try {
            println("Ola, informe seu nome: ")
            username = readln()
            println("Ola $username è um prazer ter você por aqui!")
            println(
                "Selecione uma opcão do menu: \n" +
                        "1. Saldo \n" +
                        "2. Extrato \n" +
                        "3. Saque \n" +
                        "4. Deposito \n" +
                        "5. Transferencia \n" +
                        "6. Sair"
            )

            val selected = readln().toIntOrNull()

            menu(selected)
        } catch (e: Error) {
            println(e.message)
        }
    }


    start()
}

fun getBalance() {
    println("Você selecionou ${green}Saldo${reset} \n")

    println("Insira sua senha: ")
    val reqPassword = readln()

    if (reqPassword == password) {
        println("Seu saldo è: ${green}$balance${reset}")
    } else {
        println("Senha invalida")
    }


}
