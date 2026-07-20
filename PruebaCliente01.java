public class PruebaCliente01 {
    public static void main(String[] args) {
        // 1. Creamos un objeto de nuestra clase ClienteDetallado
        ClienteDetallado cliente1 = new ClienteDetallado();
        
        // 2. Asignamos los datos heredados y propios usando setters
        cliente1.setNombre("Alberto");
        cliente1.setApellidoPaterno("Arenas");
        cliente1.setApellidoMaterno("Aguirre");
        cliente1.setNumeroDeCliente(1001);
        
        // 3. Imprimimos toda la información estructurada en la terminal
        cliente1.imprimirCampos();
        
    } // Fin del método main
} // Fin de la clase PruebaCliente01


// --- CLASE AUXILIAR QUE HEREDA O REPRESENTA LAS PROPIEDADES BASE ---
class ClienteDetallado {
    // Atributos privados
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

    // Método para imprimir los campos exactamente como lo pide el libro
    public void imprimirCampos() {
        System.out.println("Cliente:");
        System.out.println("nombre = " + this.nombre);
        System.out.println("apellidoPaterno = " + this.apellidoPaterno);
        System.out.println("apellidoMaterno = " + this.apellidoMaterno);
        System.out.println("numeroDeCliente = " + this.numeroDeCliente);
    }
}