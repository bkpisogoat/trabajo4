public class PruebaPersona03 {
    public static void main(String[] args) {
        // 1. Creamos un objeto de nuestra clase PersonaDetallada
        PersonaDetallada personal = new PersonaDetallada();
        
        // 2. Asignamos los datos utilizando los métodos setters
        personal.setNombre("Alberto");
        personal.setApellidoPaterno("Arenas");
        personal.setApellidoMaterno("Aguirre");
        
        // 3. Imprimimos todos los campos estructurados en la terminal
        personal.imprimirCampos();
        
    } // Fin del método main
} // Fin de la clase PruebaPersona03


// --- CLASE AUXILIAR QUE DEFINE LOS ATRIBUTOS Y MÉTODOS DE LA PERSONA ---
class PersonaDetallada {
    // Atributos privados para proteger los datos
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

    // Métodos Setters para asignar los valores de forma segura
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    // Método para imprimir la información con la estructura exacta del libro
    public void imprimirCampos() {
        System.out.println("Persona:");
        System.out.println("    nombre = " + this.nombre);
        System.out.println("    apellidoPaterno = " + this.apellidoPaterno);
        System.out.println("    apellidoMaterno = " + this.apellidoMaterno);
    }
}