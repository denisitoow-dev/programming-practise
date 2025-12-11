package Joel.ITB_12a_Colleccions_I

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val casosDePrueba = scan.nextInt()
    repeat(casosDePrueba) {
        val tamanyoFila = scan.nextInt()
        val lista = mutableListOf<Int>()
        for (i in 0 until tamanyoFila) {
            val numero = scan.nextInt()
            lista.add(numero)
        }
        val donde = scan.next()
        if (donde == "L") {
            for (i in 1 until lista.size) {
                if (lista[i] == lista[i - 1]) {
                    lista[i - 1] = lista[i] * 2
                    lista[i] = 0
                }
            }
        } else if (donde == "R") {
            for (i in lista.size - 1 downTo 1) {
                if (lista[i] == lista[i - 1]) {
                    lista[i] = lista[i] * 2
                    lista[i - 1] = 0
                }
            }
        }
        lista.removeAll { it == 0 }
        while (lista.size < tamanyoFila) {
            when (donde) {
                "L" -> lista.add(0)
                "R" -> lista.add(0, 0)
            }
        }
        println(lista.joinToString(" "))
    }
}
