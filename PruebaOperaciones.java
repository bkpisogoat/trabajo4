class PruebaOperaciones {
    public static void main(String[] args) {
        // Se crea el objeto 'operaciones' a partir de la clase de abajo
        Operaciones operaciones = new Operaciones();
        
        // Llamadas a los métodos que definen las acciones
        operaciones.concatenarTexto("Primero", "Segundo");
        operaciones.concatenarTexto("Tercero", "Cuarto");
        
        operaciones.imprimirSuma(10, 20);
        operaciones.imprimirSuma(30, 40);
        
    } // Fin del método main
} // Fin de la Clase PruebaOperaciones


// --- ESTA ES LA CLASE AUXILIAR QUE COMPLETA TU CÓDIGO ---
class Operaciones {

    // Método para juntar dos textos con un espacio
    public void concatenarTexto(String texto1, String texto2) {
        System.out.println(texto1 + " " + texto2);
    }

    // Método para sumar dos números enteros
    public void imprimirSuma(int a, int b) {
        System.out.println("Suma: " + (a + b));
    }
}