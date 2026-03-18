open class Empleado(val nombre: String, val salario: Double) {
    open fun saludar(): String {
        return "Hola, mi nombre es $nombre y mi salario es de $salario dolares mensuales."
    }
}

class Programador(nombre: String, salario: Double, val lenguaje: String): Empleado(nombre, salario) {
    override fun saludar(): String {
        return super.saludar() + " Soy programador, y uso el lenguaje $lenguaje"
    }
}

fun main() {
    val programador = Programador("Elías", 2500.0, "C#")
    println(programador.saludar())
}