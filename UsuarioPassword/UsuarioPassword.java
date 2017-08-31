import java.util.Scanner;

public class UsuarioPassword {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);

        //db
        String usuarioDB = "guido";
        String passwordDB = "123";

        System.out.println("Ingrese su usuario:");
        String usuario = teclado.next();

        System.out.println("Ingrese su password:");
        String password = teclado.next();

        if (usuario.equals(usuarioDB) && password.equals(passwordDB)) {
            System.out.println("Ingresaste correctamente!");
        } else {
            System.out.println("usuario y password incorrectas");
        }

        // Valido que campo se ingreso incorrecto

        // if (!usuario.equals(usuarioDB)) {
        //     System.out.println("Usuario Incorrecto");
        // }
        // else if (!password.equals(passwordDB)) {
        //     System.out.println("Password Incorrecto");
        // }
        // else {
        //     System.out.println("Ingresaste correctamente!");
        // }
    }
}
