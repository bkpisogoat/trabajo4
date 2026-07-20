// 1. El Molde de la Persona (Ahora es la clase principal)
public class Persona {
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    int edad;
    int peso;

    public void imprimirCampos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Ap. Paterno: " + apellidoPaterno);
        System.out.println("Ap. Materno: " + apellidoMaterno);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
    }

    // 2. El botón de Play (main) ahora está aquí adentro
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();

        persona1.nombre = "Alex";
        persona1.apellidoPaterno = "Torres";
        persona1.apellidoMaterno = "Flores";
        persona1.edad = 21;
        persona1.peso = 56;

        persona2.nombre = "Beto";
        persona2.apellidoPaterno = "Aguirre";
        persona2.apellidoMaterno = "Cruz";
        persona2.edad = 20;
        persona2.peso = 61;

        persona3.nombre = "Carla";
        persona3.apellidoPaterno = "Reyes";
        persona3.apellidoMaterno = "Uscanga";
        persona3.edad = 19;
        persona3.peso = 58;

        persona1.imprimirCampos();
        System.out.println();
        persona2.imprimirCampos();
        System.out.println();
        persona3.imprimirCampos();
    }
}