import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Clase5 {
    public static void main (String [] args) {
        //iteracionWhile();
        //iteracioWhileBuffer();
        //iteracionDoWhile();
        //iteracionFor();
    }

    public static void iteracionWhile() {
        final int MAX = 4;
        int numero = 1;
        while (numero <= MAX) {
            System.out.println("El numero es: " + numero);
            numero++;
        }
    }

    public static void iteracioWhileBuffer() {
        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero entero (0 para salir): ");
            numero = Integer.valueOf(entrada.readLine());
            while (numero != 0) {
                System.out.println("El valor es: " + numero);
                System.out.println("Ingrese un numero entero (0 para salir): ");
                numero = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void iteracionDoWhile() {
        final int MAX = 5;
        int numero = 1;
        do {
            if (numero % 2 == 0) {
                System.out.println(numero + " es par");
            }
            numero++;
        } while (numero <= MAX);
    }

    public static void iteracionFor() {
        final int MAX = 5;
        for (int numero = 1; numero <= MAX; numero++) {
            if (numero % 2 == 0) {
                System.out.println(numero + " es par");
            }
            System.out.println("El numero es: " + numero);
        }
    }


}
