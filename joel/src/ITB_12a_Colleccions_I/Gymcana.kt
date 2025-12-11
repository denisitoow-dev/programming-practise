package Joel.ITB_12a_Colleccions_I

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val casosDePrueba = scan.nextInt()
    val cola : Queue<Int> = LinkedList<Int>()

    repeat(casosDePrueba){
        var ninos = scan.nextInt()
        for (i in 1..ninos){
            cola.add(i)
        }
        scan.nextLine()
        val secuencia = scan.nextLine()
        for (letra in secuencia){
            when (letra) {
                'S' -> cola.poll()
                'N' -> {
                    val primero = cola.poll()
                    cola.add(primero)
                }
                else -> {
                    ninos += 1
                    cola.add(ninos)
                }
            }
        }
        println(cola.peek())
        cola.clear()
    }
}