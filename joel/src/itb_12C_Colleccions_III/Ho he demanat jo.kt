package itb_12C_Colleccions_III

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val casosDePrueba = scan.nextInt()
    repeat(casosDePrueba) {
        val robo = scan.nextInt()
        scan.nextLine()
        val aperitivos = mutableListOf<String>()
        val linea = scan.nextLine().split(" ")
        for (i in 0 until linea.size) {
            if ((i + 1) % robo != 0) {
                aperitivos.add(linea[i])
            }
        }
        println(aperitivos.joinToString(" "))
    }
}
