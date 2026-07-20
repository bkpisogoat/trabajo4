public class PruebaOperaciones03 {
    public static void main(String[] args) {
        // 1. Creamos un objeto de la clase Operaciones03
        Operaciones03 obj1 = new Operaciones03();
        
        // 2. Llamadas al método 'sumar' (desde el objeto y directamente desde la Clase)
        System.out.println(obj1.sumar(10, 20));
        System.out.println(Operaciones03.sumar(10, 20));
        
        // 3. Llamadas al método 'restar' (desde el objeto y directamente desde la Clase)
        System.out.println(obj1.restar(30, 20));
        System.out.println(Operaciones03.restar(30, 20));
        
    } // Fin del método main
} // Fin de la clase PruebaOperaciones03


// --- CLASE AUXILIAR CON MÉTODOS ESTÁTICOS CAMBIADA A 03 ---
class Operaciones03 {
    
    // Método estático para sumar dos enteros
    public static int sumar(int a, int b) {
        return a + b;
    }
    
    // Método estático para restar dos enteros
    public static int restar(int a, int b) {
        return a - b;
    }
}