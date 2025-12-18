package itb_12C_Colleccions_III

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val casosDePrueba = scan.nextInt()
    repeat(casosDePrueba){
        val lineas= scan.nextInt()
        scan.nextLine()
        val mapa = mutableMapOf<String, Int>()
        for (i in 0 until lineas){
            val linea = scan.nextLine()
            if (mapa.containsKey(linea)){
                mapa[linea] = mapa[linea]!! + 1
            }
            else{
                mapa[linea] = 1
            }
        }
        val maximo = mapa.maxBy { it.value }.key
        println(maximo)
    }
}