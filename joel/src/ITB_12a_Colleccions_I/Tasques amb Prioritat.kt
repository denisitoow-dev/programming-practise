package Joel.ITB_12a_Colleccions_I

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val casosDePrueba = scan.nextInt()
    repeat(casosDePrueba){
        val cola : Queue<String> = LinkedList<String>()
        val tareas = scan.nextInt()
        val numero = scan.nextInt()
        scan.nextLine()
        for (i in 0 until tareas){
            val tarea = scan.nextLine()
            cola.add(tarea)
        }
        val colaOrdenada = cola.sorted()
        val tareaBuscada = colaOrdenada[numero - 1].split(" ")
        for (i in 0 until tareaBuscada.size){
            if (i != 0 && i != tareaBuscada.size - 1){
                print("${tareaBuscada[i]} ")
            }
        }
        print(tareaBuscada[tareaBuscada.size - 1])
    }
}