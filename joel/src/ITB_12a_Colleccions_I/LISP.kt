package Joel.ITB_12a_Colleccions_I

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val casosDePrueba = scan.nextInt()
    scan.nextLine()
    val pila = Stack<Char>()
    repeat(casosDePrueba) {
        val caso = scan.nextLine()
        for (algo in caso) {
            if (algo == '(') {
                pila.push(algo)
            }
            else if (algo == ')' && pila.isEmpty()) {
                pila.push(algo)
            }
            else if (algo == ')' && pila.isNotEmpty() && pila.peek() == '(') {
                pila.pop()
            }
        }
        if (pila.isEmpty()) {
            println("si")
        } else {
            println("no")
        }
        pila.clear()
    }
}