package Joel.ITB_12B_Colleccions_II

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val casosDePrueba = scan.nextInt()
    repeat(casosDePrueba) {
        val diccionario = mutableMapOf<String, String>()
        val numPalabras = scan.nextInt()
        scan.nextLine()
        for (i in 1 until numPalabras) {
            val palabras = scan.nextLine()
            val pais = palabras.split("-")[0]
            val capital = palabras.split("-")[1]
            diccionario[capital] = pais
        }
        val valorBuscado = scan.next()
        val palabraBuscada = diccionario.filterValues { it == valorBuscado }.keys
        if (palabraBuscada.isNotEmpty()) {
            println(palabraBuscada.joinToString(" "))
        } else println("NO HO SE")
    }
}