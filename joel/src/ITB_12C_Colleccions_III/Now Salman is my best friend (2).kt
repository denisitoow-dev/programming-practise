package Joel.ITB_12C_Colleccions_III

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val casosDePrueba = scan.nextInt()
    repeat(casosDePrueba) {
        val lineas = scan.nextInt()
        scan.nextLine()
        val mapa = mutableMapOf<String,String>()
        repeat(lineas - 1) {
            val amistad = scan.nextLine().split(" ")
            val nombre1 = amistad[0]
            val nombre2 = amistad[1]
            if (mapa.containsValue(nombre2)) {
                mapa[nombre2] = nombre1
            }
            else{
                mapa[nombre1] = nombre2
            }
        }
        val nombre = scan.next()
        var mejorAmigo = ""
        for (i in mapa.entries) {
            if (i.key == nombre) {
                mejorAmigo = i.value
            }
            else if (i.value == nombre) {
                mejorAmigo = i.key
            }
        }
        println(mejorAmigo)
    }
}