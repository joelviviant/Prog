import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Clase6 {
    public static void main(String[] args) {
//        ejercicio1();
//        ejercicio2();
//        ejercicio3();
//        ejercicio4();
    }

    public static void ejercicio1(){
        //definir variable de numero entero
        //obtener el numero ingresado
        //mientras el numero sea != de 0
            //defino variable del segundo numero entero
            //obtengo el segundo numero ingresado
            //imprimo el numero ingresado
            //vuelvo a pedir un numero entero != 0 para continuar o = 0 para salir
    }

    public static void ejercicio2(){
        //definir variable de caracter
        //obtener el caracter ingresado
        //quedarme con el caracter en la posicion 0
        //mientras el caracter sea digito o letra minuscula
            //imprimo el caracter
            //si el caracter es vocal
                //imprimo el caracter es vocal
            //si no es vocal
                //imprimo el caracter es consonante
        //vuelvo a pedir un caracter  para continuar o mayuscula para salir
    }

    public static void ejercicio3() {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            char caracter;
            System.out.println("Ingrese un carácter (mayuscula para salir): ");
            String input = entrada.readLine();
            if (input.length() > 0) {
                caracter = input.charAt(0);
                while (caracter >= 'a' && caracter <= 'z') {
                    imprimirTabla(9);
                    System.out.println("Ingrese un carácter (mayuscula para salir): ");
                    input = entrada.readLine();
                    if (input.length() > 0) {
                        caracter = input.charAt(0);
                    }
                }
            } else {
                System.out.println("No se ha ingresado ningun caracter");
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void imprimirTabla(int numero) {
        final int MAXMULTIPLICADOR = 10;
        for (int multiplicador = 1; multiplicador <= MAXMULTIPLICADOR; multiplicador++) {
            System.out.println(multiplicador + " * " + numero + " = " + (multiplicador * numero));
        }
    }

    public static void ejercicio4() {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            int numero;
            System.out.println("Ingrese un numero entero (0 para salir)");
            numero = Integer.valueOf(entrada.readLine());
            while (numero != 0) {
                if (numero >= 1 && numero <= 200) {
                    sumarNaturales(numero);
                    System.out.println("Ingrese un numero entero (0 para salir)");
                    numero = Integer.valueOf(entrada.readLine());
                } else {
                    System.out.println("el numero ingresado debe estar entre el 1 y el 200");
                    System.out.println("Ingrese un numero entero (0 para salir)");
                    numero = Integer.valueOf(entrada.readLine());
                }
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void sumarNaturales(int numero) {
        int resultado = 0;
        for (int sumador = 1; sumador <= numero; sumador++) {
            resultado += sumador;
        }
        System.out.println("El resultado de la suma de los primeros " + numero + " es de " + resultado);
    }
}



