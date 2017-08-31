// Importo la libreria de Scanner para poder instanciarla luego.
import java.util.Scanner;

public class BancosAlumnos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("ingrese la cantidad de bancos:");

        int bancos = lector.nextInt();

        System.out.println("ingrese la cantidad de alumnos");
        
        int alumnos = lector.nextInt();

        // Condición
        // si bancos es mayor que alumnos entonces ejecuto el bloque de código
        if (bancos >= alumnos) {
            System.out.println("los bancos son sufiecientes");
        }
        //si no, ejecuto el siguiente bloque de código.
        else{
            int bancosFaltantes = alumnos - bancos;
            System.out.printf("faltan %d bancos %n", bancosFaltantes);
        }
    }
}
