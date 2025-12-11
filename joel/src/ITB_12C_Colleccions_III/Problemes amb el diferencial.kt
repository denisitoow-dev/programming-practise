package Joel.ITB_12C_Colleccions_III

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val lineas = scan.nextInt()
    scan.nextLine()
    val mapa = mutableMapOf<String, Boolean>()
    val espatllador = scan.nextLine()
    repeat(lineas - 1) {
        val linea = scan.nextLine()
        if (linea == espatllador) {
            for (i in mapa.entries) {
                mapa[i.key] = false
            }
        } else {
            if (mapa.containsKey(linea)) {
                if (mapa[linea] == true) {
                    mapa[linea] = false
                } else mapa[linea] = true
            } else {
                mapa[linea] = true
            }
        }
    }
    var trues = 0
    var falsos = 0
    for (i in mapa.entries) {
        if (i.value) {
            trues++
        } else falsos++
    }

    println("$trues $falsos")
}