package Joel.ITB_11_Registres_I

import java.util.*

//Creamos una data class del alumno
data class Notas (
    var nombre: String,
    var notaPrimerParcial: Float,
    var notaSegundoParcial: Float,
    var notaFinal: Float
)

fun main (){
    val scan = Scanner(System.`in`)
    //Leemos el numero de alumnos
    val alumnos = scan.nextInt()
    scan.nextLine()//Leemos el resto de la lina
    //Hacemos una lista con los alumnos
    val listaDeAlumnos = mutableListOf<Notas>()
    //Leemos todos los alumnos
    for (i in 1..alumnos){
        //leemos la linea y la separamos
        val linea = scan.nextLine().split(" ")
        val nombre = linea[0]
        val notaPrimerParcial = linea[1].toFloat()
        val notaSegundoParcial = linea[2].toFloat()
        //hacemos su nota final
        val notaFinal = (notaPrimerParcial * 0.4 + notaSegundoParcial * 0.6).toFloat()
        //Añadimos el alumno a la lista
        listaDeAlumnos.add(Notas(nombre, notaPrimerParcial, notaSegundoParcial, notaFinal))
    }
    //ordenamos la lista por sus notas del segundo parcial de manera descendente
    listaDeAlumnos.sortByDescending {it.notaSegundoParcial}
    //Leemos las 2 posiciones que buscamos
    val posicionSegonParcial = scan.nextInt() - 1
    val posicionNotaFinal = scan.nextInt() - 1
    //Imprimimos el alumno con sus notas en la posicion que nos dan
    println("${listaDeAlumnos[posicionSegonParcial].component1()} ${listaDeAlumnos[posicionSegonParcial].component2()} ${listaDeAlumnos[posicionSegonParcial].component3()} ${String.format(
        Locale.UK,"%.2f",listaDeAlumnos[posicionSegonParcial].component4())}")
    //Ordenamos la lista por la nota final descendiente
    listaDeAlumnos.sortByDescending {it.notaFinal}
    //Imrpimimos el alumno con la nota final en la posicion que nos dicen
    println("${listaDeAlumnos[posicionNotaFinal].component1()} ${listaDeAlumnos[posicionNotaFinal].component2()} ${listaDeAlumnos[posicionNotaFinal].component3()} ${String.format(Locale.UK,"%.2f",listaDeAlumnos[posicionNotaFinal].component4())}")
}