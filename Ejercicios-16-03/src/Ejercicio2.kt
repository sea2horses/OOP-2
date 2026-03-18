data class Producto(val nombre: String, val precio: Double, val cantidad: Int)

fun main() {
    val productos = arrayOf(
        Producto("Arroz", 25.50, 10),
        Producto("Frijoles", 32.40, 20),
        Producto("Azúcar", 15.00, 15),
        Producto("Aceite", 12.99, 20),
        Producto("Jabón", 20.33, 15)
    )

    println("|\tNombre\tPrecio\tCantidad\t|")
    for(producto in productos) {
        println("|\t${producto.nombre}\t${producto.precio}C$\t${producto.cantidad}\t|")
    }
}