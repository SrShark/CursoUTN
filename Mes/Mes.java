import java.util.Scanner;

public class Mes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [] numeroMeses = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        System.out.println("ingrese el numero del mes:");
        int mes = teclado.nextInt();

        for (int i = 0; i < numeroMeses.length ;i++) {
            if (mes == numeroMeses[i]) {
                mes = numeroMeses[i] - 1;
                System.out.println(meses[mes]);
            }
        }
    }
}
