package Joel.ITB_11_Registres_I

import java.util.Scanner

fun main (){
    val scan = Scanner(System.`in`)
    //Creamos una data class del producto
    data class Producto (
        var nombre: String,
        var precio: Float
    )
    //Leemos el numero de productos
    val productos = scan.nextInt()
    scan.nextLine()//Leemos el resto de la lina
    //Hacemos una lista con los productos
    val listaDeProductos = mutableListOf<Producto>()
    //Leemos todos los productos
    for (i in 1..productos){
        //leemos la linea y lo separamos por un espacio
        val product = scan.nextLine().split(" ")
        val nombre = product[0] //El nombre del producto es lo primero
        val precio = product[1].toFloat() //El precio lo segundo y lo pasamos a float
        //Añadimos ambos a la lista de productos
        listaDeProductos.add(Producto(nombre, precio))
    }
    //ordenamos la lista de forma descendente
    listaDeProductos.sortByDescending {it.precio}
    //Leemos la posicion del producto que buscamos y le restamos 1, ya que esta empieza por 1 y la lista por 0
    val productoABuscar = scan.nextInt()
    //Creamos las 3 variables que buscamos
    val masCaro = listaDeProductos.first()
    val masbarato = listaDeProductos.last()
    val buscado = listaDeProductos[productoABuscar - 1]
    //Imprimimos lo que nos pide por apartados
    println("EL MES CAR: ${masCaro.component1()} ${masCaro.component2()}")
    println("EL MES BARAT: ${masbarato.component1()} ${masbarato.component2()}")
    println("EL BUSCAT: ${buscado.component1()} ${buscado.component2()}")
}