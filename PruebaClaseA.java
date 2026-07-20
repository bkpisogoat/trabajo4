public class PruebaClaseA {
    public static void main(String[] args) {
        // 1. Creamos dos objetos independientes de la misma clase
        ClaseA obj1 = new ClaseA();
        ClaseA obj2 = new ClaseA();
        
        // 2. Modificamos 'campoA' en cada objeto por separado
        obj1.campoA = 10;
        obj2.campoA = 20;
        System.out.println(obj1.campoA + ", " + obj2.campoA); // Imprime: 10, 20
        
        // 3. Modificamos 'campoB' en cada objeto por separado
        obj1.campoB = 100;
        obj2.campoB = 200;
        System.out.println(obj1.campoB + ", " + obj2.campoB); // Imprime: 100, 200
        
        // 4. Modificamos el 'campoCompartido' (que es static)
        obj1.campoCompartido = 1000;
        obj2.campoCompartido = 2000; // Al cambiarlo aquí, cambia para TODOS los objetos
        System.out.println(obj1.campoCompartido + ", " + obj2.campoCompartido); // Imprime: 2000, 2000
        
    } // Fin del método main
} // Fin de la clase PruebaClaseA


// --- ESTA ES LA CLASE AUXILIAR QUE DEFINE LOS ATRIBUTOS ---
class ClaseA {
    // Variables normales: cada objeto tiene su propia copia
    public int campoA;
    public int campoB;
    
    // Variable estática: se comparte el mismo valor global para todos los objetos
    public static int campoCompartido;
}