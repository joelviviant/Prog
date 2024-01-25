import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Clase5 {
    public static void main(String[] args) {
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
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        ejercicio10();
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

    public static void iteracionAnidada() {
        final int MAXMULTIPLICADOR = 10;
        final int MAX = 3;
        final int MIN = 1;
        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero entero entre " + MIN + " y " + MAX + ", otro numero para salir:");
            numero = Integer.valueOf(entrada.readLine());
            while ((MIN <= numero) && (numero <= MAX)) {
                System.out.println("Tabla de multiplicar de: " + numero);
                for (int multiplicador = 1; multiplicador <= MAXMULTIPLICADOR; multiplicador++) {
                    System.out.println(multiplicador + " * " + numero + " = " + (multiplicador * numero));
                }
                System.out.println("Ingrese un numero entero entre " + MIN + " y " + MAX + ", otro numero para salir:");
                numero = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void iteracionAnidada2() {
        final int MIN = 0;
        final int MAX = 1000;
        int numero;
        int menor = MAX;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero entero entre " + MIN + " y " + MAX + ", con otro valor sale del ciclo");
            numero = Integer.valueOf(entrada.readLine());
            while ((MIN < numero) && (numero < MAX)) {
                if (numero < menor) {
                    menor = numero;
                }
                System.out.println("Ingrese un numero entero entre " + MIN + " y " + MAX + ", con otro valor sale del ciclo");
                numero = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc) {
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
            while ((MIN < numero) && (numero < MAX)) {
                if (numero % 2 == 0 && numero % 3 == 0) {
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
                for (int restador = numero; restador >= 0; restador--) {
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

    public static void ejercicio4() {
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
                while (caracter >= '0' && caracter <= '9' || caracter >= 'a' && caracter <= 'z') {
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
            } else {
                System.out.println("ingrese al menos un caracter");
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void ejercicio6() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int MIN = 1;
        int MAX = 10;
        int numero;
        int suma = 0;
        try {
            System.out.println("Ingrese un numero entero entre " + MIN + " y " + MAX + ", para sumar, con numero fuera del rango se termina.");
            numero = Integer.valueOf(entrada.readLine());
            while ((MIN <= numero) && (numero <= MAX)) {
                suma += numero;
                System.out.println("Ingrese un numero entero entre " + MIN + " y " + MAX + ", para sumar, con numero fuera del rango se termina.");
                numero = Integer.valueOf(entrada.readLine());
            }
            System.out.println(suma);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void ejercicio7() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int MIN = 1;
        int MAX = 10;
        int numero;
        int suma = 0;
        int cantidadSumas = -1;
        try {
            System.out.println("Ingrese un número entero entre " + MIN + " y " + MAX + ". Para terminar, ingrese un número fuera del rango.");
            numero = Integer.valueOf(entrada.readLine());
            while (MIN <= numero && numero <= MAX) {
                suma += numero;
                cantidadSumas++;
                System.out.println("Ingrese un número entero entre " + MIN + " y " + MAX + ". Para terminar, ingrese un número fuera del rango.");
                numero = Integer.valueOf(entrada.readLine());
            }
            if (cantidadSumas > 0) {
                double promedio = (double) suma / cantidadSumas;
                System.out.println("La suma total es: " + suma);
                System.out.println("La cantidad de sumas realizadas es: " + cantidadSumas);
                System.out.println("El promedio de los números ingresados es: " + promedio);
            } else {
                System.out.println("No se ingresaron números en el rango especificado.");
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void ejercicio8() {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            char caracter;
            int vocal = 0;
            System.out.println("Ingrese un carácter (mayuscula o numero para salir): ");
            String input = entrada.readLine();
            if (input.length() > 0) {
                caracter = input.charAt(0);
                while (caracter >= 'a' && caracter <= 'z') {
                    if (esVocal(caracter)) {
                        vocal++;
                        System.out.println("Ingrese un carácter (mayuscula o numero para salir): ");
                        input = entrada.readLine();
                        if (input.length() > 0) {
                            caracter = input.charAt(0);
                        }
                    } else {
                        System.out.println("Ingrese un carácter (mayuscula o numero para salir): ");
                        input = entrada.readLine();
                        if (input.length() > 0) {
                            caracter = input.charAt(0);
                        }
                    }
                }
                System.out.println("La cantidad de vocales ingresadas es de " + vocal);
            } else {
                System.out.println("No se ha ingresado ningun caracter");
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void ejercicio9() {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            char caracter;
            char menor = 'z';
            char mayor = 'a';
            System.out.println("Ingrese un carácter (mayuscula o numero para salir): ");
            String input = entrada.readLine();
            if (input.length() > 0) {
                caracter = input.charAt(0);
                while (caracter >= 'a' && caracter <= 'z') {
                    if (caracter < menor) {
                        menor = caracter;
                    }
                    if (caracter > mayor) {
                        mayor = caracter;
                    }
                    System.out.println("Ingrese un carácter (mayuscula o numero para salir): ");
                    input = entrada.readLine();
                    if (input.length() > 0) {
                        caracter = input.charAt(0);
                    }
                }
                System.out.println("La menor letra ingresado es " + menor);
                System.out.println("La mayor letra ingresado es " + mayor);
            } else {
                System.out.println("no se ha ingresado ningun caracter");
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void ejercicio10() {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            int numero;
            do {
                System.out.println("Ingrese un número entero (0 para salir): ");
                numero = Integer.valueOf(entrada.readLine());
                if (numero >= 1 && numero <= 12) {
                    switch (numero) {
                        case 1, 3, 5, 7, 8, 10, 12:
                            System.out.println("El mes tiene 31 días.");
                            break;
                        case 2:
                            System.out.println("El mes tiene 28 días.");
                            break;
                        case 4, 6, 9, 11:
                            System.out.println("El mes tiene 30 días.");
                            break;
                        default:
                            System.out.println("Ese número no corresponde a un mes.");
                    }
                } else if (numero != 0) {
                    System.out.println("Ese número no corresponde a ningún mes.");
                }
            } while (numero != 0);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}