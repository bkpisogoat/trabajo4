public class PruebaCliente02 {
    public static void main(String[] args) {
        // 1. Creamos un objeto de nuestra clase ClienteEstructurado
        ClienteEstructurado cliente1 = new ClienteEstructurado();
        
        // 2. Asignamos los datos exactos que muestra la salida del libro
        cliente1.setNombre("Carlos");
        cliente1.setApellidoPaterno("Cadena");
        cliente1.setApellidoMaterno("Castillo");
        cliente1.setNumeroDeCliente(2001);
        
        // 3. Imprimimos toda la información estructurada en la terminal
        cliente1.imprimirCampos();
        
    } // Fin del método main
} // Fin de la clase PruebaCliente02


// --- CLASE AUXILIAR QUE DEFINE LAS PROPIEDADES Y MÉTODOS DEL CLIENTE ---
class ClienteEstructurado {
    // Atributos privados para mantener la seguridad de los datos
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int numeroDeCliente;

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

    public void setNumeroDeCliente(int numeroDeCliente) {
        this.numeroDeCliente = numeroDeCliente;
    }

    // Método para imprimir la información respetando la sangría y formato del libro
    public void imprimirCampos() {
        System.out.println("Cliente:");
        System.out.println("  nombre = " + this.nombre);
        System.out.println("  apellidoPaterno = " + this.apellidoPaterno);
        System.out.println("  apellidoMaterno = " + this.apellidoMaterno);
        System.out.println("  numeroDeCliente = " + this.numeroDeCliente);
    }
}