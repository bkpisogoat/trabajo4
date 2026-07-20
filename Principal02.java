public class Principal02 {
    public static void main(String[] args) {
        // 1. Creamos el objeto a partir de la clase PersonaAuxiliar
        PersonaAuxiliar objeto1 = new PersonaAuxiliar();
        
        // Asignamos una edad inicial de 15
        objeto1.edad = 15;
        
        // Imprime el valor antes de llamar al método
        System.out.println("Edad (antes): " + objeto1.edad);
        
        // 2. Pasamos el objeto completo como argumento al método estático
        Acciones02.imprimeCambioDeEdad(objeto1);
        
        // Imprime el valor después (verás que sí cambió a 25)
        System.out.println("Edad (después): " + objeto1.edad);
        
    } // Fin del método main
} // Fin de la clase Principal02


// --- CLASE AUXILIAR QUE RECIBE LA REFERENCIA DEL OBJETO ---
class Acciones02 {
    
    // Método estático que recibe un objeto de tipo PersonaAuxiliar
    public static void imprimeCambioDeEdad(PersonaAuxiliar objeto) {
        // Modifica la edad directamente en el objeto original incrementando en 10
        objeto.edad = objeto.edad + 10;
        System.out.println("Edad: " + objeto.edad);
    }
}


// --- CLASE PERSONA ADAPTADA PARA ESTE EJERCICIO ---
class PersonaAuxiliar {
    // Atributo público para que pueda ser modificado directamente
    public int edad;
}