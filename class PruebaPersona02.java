class PruebaPersona02 {
    public static void main(String[] args) {
        // 1. Crea el objeto persona inicializándolo con "Alex" y 20 años usando el constructor
        Persona01 persona = new Persona01("Alex", 20);
        
        // 2. Muestra los datos iniciales en la terminal
        persona.imprimirCampos();
        
        // 3. Modifica el nombre y la edad usando los métodos setter
        persona.setNombre("Beto");
        persona.setEdad(19);
        
        // 4. Muestra los datos modificados para comprobar el cambio
        persona.imprimirCampos();
        
    } // Fin del método main
} // Fin de la clase PruebaPersona02


// --- ESTA ES LA CLASE AUXILIAR CON EL CONSTRUCTOR Y SETTERS CORREGIDOS ---
class Persona01 {
    // Atributos privados de la clase
    private String nombre;
    private int edad;

    // CONSTRUCTOR: Se llama exactamente igual que la clase (Persona01)
    public Persona01(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para modificar el nombre (Setter)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para modificar la edad (Setter)
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método para imprimir en pantalla los datos actuales
    public void imprimirCampos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }
}