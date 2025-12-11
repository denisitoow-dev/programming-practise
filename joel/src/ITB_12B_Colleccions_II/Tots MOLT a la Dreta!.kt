package Joel.ITB_12B_Colleccions_II

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val casosDePrueba = scan.nextInt()
    repeat(casosDePrueba){
        val tamanyoArray = scan.nextInt()
        val array = mutableListOf<Int>()
        for (i in 0 until tamanyoArray){
            val numero = scan.nextInt()
            array.add(numero)
        }
        val movimiento = scan.nextInt()
        repeat(movimiento){
            val num = array[array.size - 1]
            array.removeAt(array.size - 1)
            array.add(0, num)
        }
        println(array.joinToString(" "))
    }
}