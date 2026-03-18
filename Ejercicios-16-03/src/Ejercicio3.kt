class Bus(val numeroRuta: Int, val capacidad: Int, val conductor: String) {
    fun IniciarRuta() {
        println("Iniciando ruta #$numeroRuta con capacidad de $capacidad pasajero(s). Conductor: $conductor.")
    }
}

fun main() {
    val rutas = arrayOf(
        Bus(117, 40, "Jose María"),
        Bus(101, 45, "Mario Gonzalez")
    )

    for(ruta in rutas) {
        ruta.IniciarRuta()
    }
}