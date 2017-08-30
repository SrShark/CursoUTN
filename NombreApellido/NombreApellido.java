import java.util.Scanner;

public class NombreApellido {
    public static void main(String[] args) {

        // Instancio en un objeto la clase scanner.
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese su nombre:");

        String nombre = teclado.nextLine();

        System.out.println("Ingrese su apellido:");

        // El metodo nextLine me permite capturar la cadena de texto que ingrese el usuario y asignarla a la variable.
        String apellido = teclado.nextLine();

        // El metodo String.format me permite dar formato a una cadena de texto.
        // Tambien me permite utilizar cualquier tipo de dato primitivo, %s %d %2f...
        String mensaje = String.format("El nombre completo de la persona es %s %s.", nombre, apellido);

        System.out.println(mensaje);
    }
}
