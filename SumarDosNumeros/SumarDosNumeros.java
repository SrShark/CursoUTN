// Importo la libreria de Scanner para poder instanciarla luego.
import java.util.Scanner;

public class SumarDosNumeros {
	public static void main(String[] args) {
		//Estoy creando un objeto de la clase Scanner, que me permite obtener las teclas presionadas del teclado.
		// Scanner es la clase con la cual utilizo mi variable lector para referenciarla y crear un nuevo objeto en base a esa clase.
		Scanner lector = new Scanner(System.in);

		// System.out.println > sirve para imprimir por consola
		System.out.println("ingrese el primer numero:");

		// El metodo netxInt me permite capturar el proximo numero entero que ingrese el usuario con el teclado.
		int numero1 = lector.nextInt();

		System.out.println("ingrese el segundo numero:");

		// int > me permite definir una variable de tipo entero de 4 bytes.
		int numero2 = lector.nextInt();

		int suma = numero1 + numero2;

		System.out.println("la suma es " + suma);

		//printf sirve para imprimir con formato
		// %d sirve para dar formato a variables primitivas de enteros.
		// %n sirve para hacer un salto de linea al imprimir en consola
		System.out.printf("la suma de %d y %d es %d %n", numero1, numero2, suma);
	}
}
