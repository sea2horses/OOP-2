class Estudiante
    (val nombre: String, val carnet: String,
     val carrera: String, val anio: Int) {
    fun mostrarDatos() {
        println("Hola, mi nombre es $nombre, con cif $carnet. " +
                "Estudio la carrera de $carrera e ingresé en el año $anio")
    }
}

fun main() {
    val estudiantes = arrayOf(
        Estudiante("Steven Mejia", "23020567",
            "Diseño y Comunicación Visual", 2024),
        Estudiante("Nydia Morales", "22010121",
            "Marketing y Relaciones Públicas",2023),
        Estudiante("Johaneris Ávalos", "24010652",
            "Ingeniería en Sistemas de Información", 2025)
    )

    for (estudiante in estudiantes) {
        estudiante.mostrarDatos()
    }
}