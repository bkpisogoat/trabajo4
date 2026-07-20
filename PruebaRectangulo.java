public class PruebaRectangulo {
    public static void main(String[] args) {
        // 1. Crea el primer rectángulo sin parámetros (usará los valores por defecto: 1 y 1)
        Rectangulo rectangulo1 = new Rectangulo();
        
        // 2. Crea el segundo rectángulo con base 7 y altura 11
        Rectangulo rectangulo2 = new Rectangulo(7, 11);
        
        // 3. Crea el tercer rectángulo con base 13 y altura 17
        Rectangulo rectangulo3 = new Rectangulo(13, 17);
        
        // Muestra las dimensiones de cada uno en la terminal
        rectangulo1.imprimirCampos();
        rectangulo2.imprimirCampos();
        rectangulo3.imprimirCampos();
        
    } // Fin del método main
} // Fin de la clase PruebaRectangulo


// --- ESTA ES LA CLASE AUXILIAR CON LOS CONSTRUCTORES SOBRECARGADOS ---
class Rectangulo {
    private int base;
    private int altura;

    // Constructor 1: Sin parámetros (asigna valores por defecto de 1)
    public Rectangulo() {
        this.base = 1;
        this.altura = 1;
    }

    // Constructor 2: Con parámetros para asignar base y altura personalizadas
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para mostrar los valores actuales en la terminal
    public void imprimirCampos() {
        System.out.println("Base: " + this.base);
        System.out.println("Altura: " + this.altura);
    }
}