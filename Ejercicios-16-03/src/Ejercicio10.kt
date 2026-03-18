class Libro(
    val titulo: String,
    val autor: String,
    val añoPublicacion: Int
) {
    fun mostrarInformacion() {
        println("Título: $titulo")
        println("Autor: $autor")
        println("Año: $añoPublicacion")
        println("------------------------")
    }
}

fun main() {
    val libro1 = Libro("Clean Code", "Robert C. Martin", 2008)
    val libro2 = Libro("The Pragmatic Programmer", "Andrew Hunt", 1999)
    val libro3 = Libro("Introduction to Algorithms", "Thomas H. Cormen", 2009)
    val libro4 = Libro("Design Patterns", "Erich Gamma", 1994)

    libro1.mostrarInformacion()
    libro2.mostrarInformacion()
    libro3.mostrarInformacion()
    libro4.mostrarInformacion()
}