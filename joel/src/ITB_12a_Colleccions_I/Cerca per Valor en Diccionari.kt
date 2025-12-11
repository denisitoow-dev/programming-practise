package Joel.ITB_12a_Colleccions_I

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val casosDePrueba = scan.nextInt()
    repeat(casosDePrueba) {
        val diccionario = mutableMapOf<String, String>()
        val numPalabras = scan.nextInt()
        scan.nextLine()
        for (i in 0 until numPalabras - 1) {
            val palabras = scan.nextLine()
            val palabra = palabras.split("-")[0]
            val valor = palabras.split("-")[1]
            diccionario[palabra] = valor
        }
        val valorBuscado = scan.next()
        val palabraBuscada = diccionario.filterValues { it == valorBuscado }.keys
        val dic = diccionario.toSortedMap()
        println(dic)
        if (palabraBuscada.isEmpty()) {
            println("NO EXISTE")
        } else {
            println(palabraBuscada.joinToString(" "))
        }
    }
}