data class Pedido(
    val cliente: String,
    val platillo: String,
    val precio: Double
)

fun main() {
    val pedido1 = Pedido("Carlos", "Gallo Pinto con carne asada", 120.0)
    val pedido2 = Pedido("María", "Nacatamal", 90.0)
    val pedido3 = Pedido("Luis", "Quesillo", 45.0)

    println(pedido1)
    println(pedido2)
    println(pedido3)
}