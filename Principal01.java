public class Principal01 {
    public static void main(String[] args) {
        // 1. Definimos la variable local e inicializamos con 50
        int variable1 = 50;
        
        // Imprime el valor antes de llamar al método
        System.out.println("Variable (antes): " + variable1);
        
        // 2. Pasamos la variable al método estático de la otra clase
        Acciones01.imprimeIncremento(variable1);
        
        // Imprime el valor después de llamar al método (sigue siendo 50)
        System.out.println("Variable (después): " + variable1);
        
    } // Fin del método main
} // Fin de la clase Principal01


// --- CLASE AUXILIAR QUE APLICA EL INCREMENTO EN UNA COPIA ---
class Acciones01 {
    
    // Método estático que recibe una copia del valor
    public static void imprimeIncremento(int valor) {
        // Incrementa la copia local en 10
        valor = valor + 10;
        System.out.println("Valor: " + valor);
    }
}