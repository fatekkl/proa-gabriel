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
            2 -> getExtrato()
            3 -> withdraw()
            4 -> println("Você selecionou ${green}Deposito${reset}")
            5 -> transfer()
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

    if (checkPassword()) {
        println("Seu saldo è: ${green}$balance${reset}")
    } else {
        println("Senha invalida")
    }


}

fun checkPassword(): Boolean {
    println("Insira sua senha: ")
    val reqPassword = readln()

    return reqPassword == password
}

fun withdraw() {

    if (checkPassword()) {
        println("Digite a quantidade de saldo que você deseja sacar.")

        val toWithdraw = readln().toDouble()

        if (toWithdraw > balance) {
            println("Transacão não autorizada!")
            return
        }

        if (toWithdraw <= 0) {
            println("Transacão não autorizada!")
            return
        }

        balance -= toWithdraw

        println("Você sacou ${green}$toWithdraw${reset}. Saldo atual: ${green}$balance${reset}")
        return
    }
    println("Credenciais Incorretas!")
    return
}

fun getExtrato() {
    val compras = listOf("Compra1", "Compra2", "Compra3")


    if (checkPassword()) {
        println(
            "Compras recentes: \n" +
                    "${green}$compras${reset}"
        )

        return
    }

    println("Credenciais Invalidas!")
    return
}

fun transfer() {
    if (checkPassword()){
        println("Informe o numero da conta que deseja enviar: ")
        var accountNum = readln().toIntOrNull()
        while (accountNum == null) {
            println("Informe um numero valido: ")
            accountNum = readln().toIntOrNull()
        }

        println("Informe o valor a ser transferido. Saldo Atual: ${green}$balance${reset}")
        var toTransfer = readln().toIntOrNull()
        while (toTransfer == null) {
            println("Informe um valor que seja valido: ")
            toTransfer = readln().toIntOrNull()
        }

        if (toTransfer <= balance) {
            balance -= toTransfer

            println("Transferencia efetuada!")
            println("Seu saldo atual è: $green$balance$reset")
        } else {
            println("Operacao não autorizada!")
        }
    }
}