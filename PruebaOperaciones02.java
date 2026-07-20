class PruebaOperaciones02 {
    public static void main(String[] args) {
        // Se crea el objeto a partir de la clase definida abajo
        Operaciones02 operaciones = new Operaciones02();
        
        // Llamadas a las 4 variantes distintas del método 'mostrarDatos'
        operaciones.mostrarDatos(99);
        operaciones.mostrarDatos("Hola");
        operaciones.mostrarDatos(99, "Hola");
        operaciones.mostrarDatos("Hola", 99);
        
    } // Fin del método main
} // Fin de la Clase PruebaOperaciones02


// --- ESTA ES LA CLASE CON LOS MÉTODOS SOBRECARGADOS ---
class Operaciones02 {

    // Variante 1: Recibe un número entero
    public void mostrarDatos(int numero) {
        System.out.println("Parámetros: int");
    }

    // Variante 2: Recibe una cadena de texto
    public void mostrarDatos(String texto) {
        System.out.println("Parámetros: String");
    }

    // Variante 3: Recibe primero un entero y luego un texto
    public void mostrarDatos(int numero, String texto) {
        System.out.println("Parámetros: int, String");
    }

    // Variante 4: Recibe primero un texto y luego un entero
    public void mostrarDatos(String texto, int numero) {
        System.out.println("Parámetros: String, int");
    }
}