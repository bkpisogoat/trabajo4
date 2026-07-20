class PruebaOperaciones01 {
    public static void main(String[] args) {
        // Se crea el objeto a partir de la clase definida abajo
        Operaciones01 operaciones = new Operaciones01();
        
        // Caso 1: Guarda el resultado del método en una variable y luego lo imprime
        int resultado = operaciones.sumar(10, 20);
        System.out.println(resultado);
        
        // Caso 2: Pasa directamente lo que devuelve el método al System.out.println
        System.out.println(operaciones.restar(30, 9));
        
        // Caso 3: Imprime directamente el resultado de elevar al cuadrado
        System.out.println(operaciones.cuadrado(11));
        
    } // Fin del método main
} // Fin de la Clase PruebaOperaciones01


// --- CLASE NUEVA CON NOMBRE DISTINTO PARA EVITAR CHOQUES ---
class Operaciones01 {

    // Método que recibe dos números enteros, los suma y DEVUELVE el resultado
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método que recibe dos números enteros, los resta y DEVUELVE el resultado
    public int restar(int a, int b) {
        return a - b;
    }

    // Método que recibe un número entero, calcula su cuadrado y DEVUELVE el resultado
    public int cuadrado(int n) {
        return n * n;
    }
}