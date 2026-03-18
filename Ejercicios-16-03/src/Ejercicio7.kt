interface Vehiculo {
    fun mover()
}

class Camion : Vehiculo {
    override fun mover() {
        println("El camión se está moviendo")
    }
}

class Motocicleta : Vehiculo {
    override fun mover() {
        println("La motocicleta se está moviendo")
    }
}

fun main() {
    val camion = Camion()
    val moto = Motocicleta()

    camion.mover()
    moto.mover()
}