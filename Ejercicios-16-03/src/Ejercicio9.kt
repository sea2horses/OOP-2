open class Persona(
    val nombre: String,
    val edad: Int
)

class Docente(
    nombre: String,
    edad: Int,
    val materia: String,
    val salario: Double
) : Persona(nombre, edad)

class Esttudiante(
    nombre: String,
    edad: Int,
    val carrera: String,
    val promedio: Double
) : Persona(nombre, edad)

fun main() {
    val docente = Docente("Ana", 40, "Programación", 15000.0)
    val estudiante = Esttudiante("Carlos", 20, "Ingeniería en Computación", 85.5)

    println("Docente: ${docente.nombre}, Materia: ${docente.materia}, Salario: ${docente.salario}")
    println("Estudiante: ${estudiante.nombre}, Carrera: ${estudiante.carrera}, Promedio: ${estudiante.promedio}")
}