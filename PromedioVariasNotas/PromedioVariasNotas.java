import java.util.Scanner;

public class PromedioVariasNotas {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    boolean termino = true;
    double contador = 0;
    double notas = 0;

    while (termino == true) {
        System.out.println("ingrese la nota");
        double nota = teclado.nextInt();

        notas = notas + nota ;
        contador += 1;

        System.out.println("para finalizar ingrese fin. Presione cualquier tecla para continuar");
        String fin = teclado.next();

        if (fin.equals("fin")) {
            termino = false;
        }
    }

    double promedio = notas / contador;

    System.out.println("el promedio es es: " + promedio);
  }
}
