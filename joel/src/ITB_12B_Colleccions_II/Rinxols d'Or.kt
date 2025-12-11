package Joel.ITB_12B_Colleccions_II

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val casosDePrueba = scan.nextInt()
    repeat(casosDePrueba) {
        val planetas = scan.nextInt()
        scan.nextLine()
        var mitad = planetas / 2
        var disMitad = 0.0
        var pesMitad = 0.0
        val distancias = mutableMapOf<String, Double>()
        val pesos = mutableMapOf<String, Double>()
        for (i in 0 until planetas) {
            val todo = scan.nextLine().split(" ")
            val nombre = todo[0]
            val distancia = todo[1].toDouble()
            distancias[nombre] = distancia
            val peso = todo[2].toDouble()
            pesos[nombre] = peso
        }
        //ordenamos por el double y no por el nombre de los planetas
        val distanciasOrdenadas = distancias.toList().sortedBy { it.second }.toMap()
        disMitad = distanciasOrdenadas.values.elementAt(mitad)
        val planetasCercanos = distanciasOrdenadas.filterValues { it == disMitad }.keys
        if (planetasCercanos.size == 1) {
            println(planetasCercanos.joinToString(" "))
        }
        else {
            for (planeta in planetasCercanos) {
                if (!pesos.contains(planeta)) {
                    pesos.remove(planeta)
                }
            }
            val pesosOrdenados = pesos.toList().sortedBy { it.second }.toMap()
            mitad = pesosOrdenados.size / 2
            pesMitad = pesosOrdenados.values.elementAt(mitad)
            val planetaMasPesado = pesosOrdenados.filterValues { it == pesMitad }.keys
            println(planetaMasPesado.joinToString(" "))
        }
    }
}