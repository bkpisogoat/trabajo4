public class PruebaClaseB {
    public static void main(String[] args) {
        // 1. Creamos dos objetos de la clase ClaseB
        ClaseB obj1 = new ClaseB();
        ClaseB obj2 = new ClaseB();
        
        // 2. Comprobamos los valores iniciales por defecto (imprime 0 en todos)
        System.out.println("obj1: " + obj1.campoStatic);
        System.out.println("obj2: " + obj2.campoStatic);
        System.out.println("ClaseB: " + ClaseB.campoStatic + "\n");
        
        // 3. Modificamos el valor usando el primer objeto 'obj1'
        obj1.campoStatic = 10;
        System.out.println("obj1: " + obj1.campoStatic);
        System.out.println("obj2: " + obj2.campoStatic);
        System.out.println("ClaseB: " + ClaseB.campoStatic + "\n");
        
        // 4. Modificamos el valor usando el segundo objeto 'obj2'
        obj2.campoStatic = 200;
        System.out.println("obj1: " + obj1.campoStatic);
        System.out.println("obj2: " + obj2.campoStatic);
        System.out.println("ClaseB: " + ClaseB.campoStatic + "\n");
        
        // 5. Modificamos el valor directamente usando la Clase
        ClaseB.campoStatic = 3000;
        System.out.println("obj1: " + obj1.campoStatic);
        System.out.println("obj2: " + obj2.campoStatic);
        System.out.println("ClaseB: " + ClaseB.campoStatic);
        
    } // Fin del método main
} // Fin de la clase PruebaClaseB


// --- ESTA ES LA CLASE AUXILIAR CON EL CAMPO ESTÁTICO COMPARTIDO ---
class ClaseB {
    // Variable compartida para todas las instancias y la clase misma
    public static int campoStatic;
}