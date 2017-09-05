public class PasaAlBoliche {

    public static void main(String[] args) {

        // boolean b1= true;
        // boolean b2=false;
        // //AND OR NOT
        // System.out.printf("AND ciclo corto && es: %b%n", (b1 && b2));
        // System.out.printf("AND ciclo largo & es: %b%n", (b1 & b2));
        // System.out.printf("OR ciclo corto || es: %b%n", (b1 || b2));
        // System.out.printf("OR ciclo largo | es: %b%n", (b1 | b2));
        // System.out.printf("NOT ! de b1 es: %b%n", !b1);
        // System.out.printf("NOT ! de b2 es: %b%n", !b2);

        boolean mayorDeEdad=true;
        boolean tieneElDni=false;

        if(mayorDeEdad && tieneElDni){
            System.out.println("Pasa al boliche");
        }else{
            System.out.println("No pasa al boliche");
        }
        //Operador ternario
        String mensaje= (mayorDeEdad && tieneElDni)?"Pasa al boliche":"No pasa";
        System.out.println(mensaje);
        System.out.println((mayorDeEdad && tieneElDni)?"Pasa al boliche":"No pasa");
    }
}
