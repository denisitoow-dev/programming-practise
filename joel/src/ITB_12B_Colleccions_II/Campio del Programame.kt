package Joel.ITB_12B_Colleccions_II

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val casosDePrueba = scan.nextInt()
    repeat(casosDePrueba){
        val diccionario = mutableMapOf<Int, String>()
        val numPalabras = scan.nextInt()
        scan.nextLine()
        for (i in 1 until numPalabras) {
            val palabras = scan.nextLine()
            val anyo = palabras.split("-")[0]
            val valor = palabras.split("-")[1]
            diccionario[anyo.toInt()] = valor
        }
        val valorBuscado = scan.next()
        val valores = diccionario.filterValues { it == valorBuscado }.keys
        val contador = valores.size
        println(contador)
    }
}