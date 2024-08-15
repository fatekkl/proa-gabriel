package Exercicios.Logica

import kotlin.math.pow

fun main() {
    fun primeiro() {
        val nome_do_carro = "Fusca"

        println(nome_do_carro)
    }

    fun segundo() {;
        println("Digite seu nome: ")

        val nome: String = readln()

        println("Ola ${nome}")
    }

    fun terceiro() {
        var nome: String;
        var idade: Int;
        println("Digite seu nome: ")
        nome = readln()
        println("Digite sua idade: ")
        idade = readln().toInt()

        println("Ola ${nome}, sua idade é $idade")
    }

    fun retangulo() {
        println("Insira a base:")
        val base = readln().toInt()
        println("Insira a altura: ")
        val altura = readln().toInt()

        println(base * altura)
    }

    fun quadrado() {
        println("Insira o lado: ")
        val lado: Double = readln().toDouble()

        println(lado.pow(2))
    }

    fun losango() {
        println("Insira a diagonal menor: ")
        val dmenor: Int = readln().toInt()
        println("Insira a diagonal maior: ")
        val dmaior: Int = readln().toInt()

        println((dmaior * dmenor) / 2)
    }

    fun trapezio() {
        println("Insira a base maior: ")
        val bmaior: Int = readln().toInt()

        println("Insira a base menor: ")
        val bmenor: Int = readln().toInt()

        println("Insira a altura: ")
        val altura: Int = readln().toInt()

        println(((bmenor + bmaior) * altura) /2)
    }

    fun paralelograma() {
        println("Insira a base: ")
        val base: Int = readln().toInt()

        println("Insira a altura: ")
        val altura: Int = readln().toInt()

        println(altura*base)
    }

    fun triangulo() {
        println("Insira a base: ")
        val base: Int = readln().toInt()

        println("Insira a altura: ")
        val altura: Int = readln().toInt()

        println((altura*base) /2)
    }

    fun circulo() {
        println("Insira o raio: ")
        val r: Double = readln().toDouble()

        println(3.14*r.pow(2))
    }
}