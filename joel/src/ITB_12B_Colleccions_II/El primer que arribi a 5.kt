package Joel.ITB_12B_Colleccions_II

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    var nombre = scan.nextLine()
    var primerode5 = "NO"
    val wins = mutableMapOf<String, Int>()
    while (nombre != "xxx"){
        if (wins.containsKey(nombre)){
            wins[nombre] = wins[nombre]!! + 1
        }
        else {
            wins[nombre] = 1
        }
        if (wins[nombre] == 5 && primerode5 == "NO"){
            primerode5 = nombre
        }
        nombre = scan.nextLine()
    }
    println(primerode5)
}