import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Clase5 {
    public static void main (String [] args) {
        //iteracionWhile();
        //iteracioWhileBuffer();
        //iteracionDoWhile();
        //iteracionFor();
        //iteracionAnidada();
        //iteracionAnidada2();
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        ejercicio5();
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

    public static void iteracionAnidada(){
        final int MAXMULTIPLICADOR = 10;
        final int MAX = 3;
        final int MIN = 1;
        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un numero entero entre "+MIN+" y "+MAX+", otro numero para salir:");
            numero = Integer.valueOf(entrada.readLine());
            while ((MIN <= numero)&&(numero <= MAX)){
                System.out.println("Tabla de multiplicar de: " + numero);
                for (int multiplicador = 1; multiplicador <= MAXMULTIPLICADOR; multiplicador++) {
                    System.out.println(multiplicador +" * "+numero+" = "+(multiplicador*numero));
                }
                System.out.println("Ingrese un numero entero entre "+MIN+" y "+MAX+", otro numero para salir:");
                numero = Integer.valueOf(entrada.readLine());
            }
        }
        catch (Exception exc){
            System.out.println(exc);
        }
    }

    public static void iteracionAnidada2(){
        final int MIN = 0;
        final int MAX = 1000;
        int numero;
        int menor = MAX;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un numero entero entre "+MIN+" y "+MAX+", con otro valor sale del ciclo");
            numero = Integer.valueOf(entrada.readLine());
            while ((MIN < numero)&&(numero < MAX)){
                if (numero<menor){
                    menor=numero;
                }
                System.out.println("Ingrese un numero entero entre "+MIN+" y "+MAX+", con otro valor sale del ciclo");
                numero = Integer.valueOf(entrada.readLine());
            }
        }
        catch (Exception exc){
            System.out.println(exc);
        }
        if (menor != MAX) {
            System.out.println("El menor numero ingresado es: " + menor);
        }
    }

    //Practico Clase 5
    public static void ejercicio1() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int MIN = 1;
        int MAX = 10;
        int numero;
        try {
            System.out.println("Ingrese un numero entero entre " + MIN + " y " + MAX + ", con otro valor sale del ciclo");
            numero = Integer.valueOf(entrada.readLine());
            while ((MIN < numero)&&(numero < MAX)){
                if (numero % 2 == 0 && numero % 3 == 0 ) {
                    System.out.println("el " + numero + " es multiplo de 2 y 3");
                } else {
                    System.out.println("el numero ingresado es " + numero);
                }
                System.out.println("Ingrese un numero entero entre " + MIN + " y " + MAX + ", con otro valor sale del ciclo");
                numero = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void ejercicio2() {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            int numero;
            final int MIN = 0;
            System.out.println("Ingrese un numero positivo");
            numero = Integer.valueOf(entrada.readLine());
            while (numero > 0) {
                for ( int restador = numero ; restador>=0 ; restador-- ){
                    System.out.println(restador);
                }
                System.out.println("Ingrese un numero positivo");
                numero = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void ejercicio3() {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            char caracter;
            do {
                System.out.println("Ingrese un carácter (* para salir): ");
                String input = entrada.readLine();
                if (input.length() > 0) {
                    caracter = input.charAt(0);
                    if (Character.isDigit(caracter)) {
                        System.out.println("Es un dígito.");
                    } else if (caracter >= 'a' && caracter <= 'z' && esVocal(caracter)) {
                        System.out.println("Es una vocal minúscula.");
                    } else {
                        System.out.println("No es ni un dígito ni una vocal minúscula.");
                    }
                } else {
                    System.out.println("Ingrese al menos un carácter.");
                    caracter = '\0';
                }
            } while (caracter != '*');
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void ejercicio4(){
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            int numero;
            int numeroAImprimir;
            System.out.println("Ingrese un numero entero (0 para salir)");
            numero = Integer.valueOf(entrada.readLine());
            while (numero != 0) {
                System.out.println("Ingrese un numero para imprimir");
                numeroAImprimir = Integer.valueOf(entrada.readLine());
                System.out.println("el numero elegido fue " + numeroAImprimir);
                System.out.println("Ingrese un numero entero (0 para salir)");
                numero = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void ejercicio5() {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            char caracter;
            System.out.println("Ingrese un carácter (mayuscula para salir): ");
            String input = entrada.readLine();
            if (input.length() > 0) {
                caracter = input.charAt(0);
                while (caracter>= '0' && caracter <= '9'  || caracter >= 'a' && caracter <= 'z') {
                    if (Character.isDigit(caracter)) {
                        System.out.println("El cararcter " + caracter + " es un digito ");
                    } else {
                        if (esVocal(caracter)) {
                            System.out.println("El caracter " + caracter + " es una vocal minuscula");
                        } else {
                            System.out.println("El caracter " + caracter + " es una consonante minuscula");
                        }
                    }
                    System.out.println("Ingrese un carácter (mayúscula para salir): ");
                    input = entrada.readLine();
                    if (input.length() > 0) {
                        caracter = input.charAt(0);
                    } else {
                        System.out.println("Ingrese al menos un carácter.");
                    }
                }
            }else{
                System.out.println("ingrese al menos un caracter");
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}

