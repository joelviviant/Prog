import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Clase6 {
    public static void main(String[] args) {
//        ejercicio1();
//        ejercicio2();
//        ejercicio3();
//        ejercicio4();
//        ejercicio5();
//        ejercicio6();
//        ejercicio7();
//        ejercicio8();
//        ejercicio9();
//        ejercicio10();
//        ejercicio11();

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

    public static void ejercicio5() {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            char caracter;
            System.out.println("Ingrese un carácter (mayuscula para salir): ");
            String input = entrada.readLine();
            if (input.length() > 0) {
                caracter = input.charAt(0);
                while (caracter >= '0' && caracter <= '9' || caracter >= 'a' && caracter <= 'z') {
                    definirCaracter(caracter);
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

    public static void definirCaracter(char caracter) {
        if (Character.isDigit(caracter)) {
            System.out.println("El caracter " + caracter + " es un digito");
        } else if (caracter >= 'A' && caracter <= 'Z') {
            if (esVocal(caracter)) {
                System.out.println("el caracter " + caracter + " es una vocal y esta en MAYUSCULA");
            } else {
                System.out.println("el caracter " + caracter + " es una consonante y esta en MAYUSCULA");
            }
        } else if (caracter >= 'a' && caracter <= 'z') {
            if (esVocal(caracter)) {
                System.out.println("el caracter " + caracter + " es una vocal y esta en minuscula");
            } else {
                System.out.println("el caracter " + caracter + " es una consonante y esta en minuscula");
            }
        } else {
            System.out.println("el caracter no es una letra ni un digito");
        }
    }

    public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'||c == 'U';
    }

    public static void ejercicio6() {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            int numero;
            System.out.println("Ingrese un numero entero (0 para salir)");
            numero = Integer.valueOf(entrada.readLine());
            while (numero != 0) {
                if (numero >= 1 && numero <= 200) {
                    int resultado = sumarNumero(numero);
                    System.out.println("El resultado de la suma de 1 + " + numero + " es de " + resultado);
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

    public static int sumarNumero(int numero){
        int resultado = 1 + numero;
        return resultado;
    }

    public static void ejercicio7() {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            int numero;
            System.out.println("Ingrese un numero entero (0 para salir)");
            numero = Integer.valueOf(entrada.readLine());
            while (numero != 0) {
                if (numero >= 1 && numero <= 12) {
                    calcularDias(numero);
                    System.out.println("Ingrese un numero entero (0 para salir)");
                    numero = Integer.valueOf(entrada.readLine());
                } else {
                    System.out.println("el numero ingresado no corresponde a un mes");
                    System.out.println("Ingrese un numero entero (0 para salir)");
                    numero = Integer.valueOf(entrada.readLine());
                }
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void calcularDias(int numero){
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
    }

    public static void ejercicio8() {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            char caracter;
            System.out.println("Ingrese un carácter (mayuscula o numero para salir): ");
            String input = entrada.readLine();
            if (input.length() > 0) {
                caracter = input.charAt(0);
                while (caracter >= 'a' && caracter <= 'z') {
                    System.out.println("Ingrese un numero");
                    int numero = Integer.parseInt(entrada.readLine());
                    if (numero >= 1 && numero <= 5) {
                       mostrarTabla(numero);
                    } else {
                        System.out.println("su numero no puede ser calculado");
                    }
                    System.out.println("Ingrese un carácter (mayuscula o numero para salir): ");
                    input = entrada.readLine();
                    if (input.length() > 0) {
                        caracter = input.charAt(0);
                    }
                }
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void mostrarTabla(int numero){
        final int MAXMULTIPLICADOR = 10;
        for (int multiplicador = 1; multiplicador <= MAXMULTIPLICADOR; multiplicador++) {
            System.out.println(multiplicador + " * " + numero + " = " + (multiplicador * numero));
        }
    }

    public static void ejercicio9() {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            char caracter;
            System.out.println("Ingrese un carácter (mayuscula o numero para salir): ");
            String input = entrada.readLine();
            if (input.length() > 0) {
                caracter = input.charAt(0);
                while (caracter >= 'a' && caracter <= 'z') {
                    System.out.println("Ingrese un numero");
                    int numero = Integer.parseInt(entrada.readLine());
                    System.out.println("Ingrese el segundo numero");
                    int numero2 = Integer.parseInt(entrada.readLine());
                    imprimirOperacion(caracter, numero, numero2);
                    System.out.println("Ingrese un carácter (mayuscula o numero para salir): ");
                    input = entrada.readLine();
                    if (input.length() > 0) {
                        caracter = input.charAt(0);
                    }
                }
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void imprimirOperacion(char caracter, int numero, int numero2){
        int resultado = 0;
        char operador = 0;
        switch (caracter){
            case 'a':
                operador = '+';
                resultado = numero + numero2;
                break;
            case 'b':
                operador = '-';
                resultado = numero - numero2;
                break;
            case 'c':
                operador = '*';
                resultado = numero * numero2;
                break;
            case 'd':
                operador = '/';
                resultado = numero / numero2;
                break;
            default:
                System.out.println("Su caracter no corresponde a ninguna operación");
        }
        System.out.println("El resultado de " + numero + operador + numero2 + " = " + resultado );
    }


    public static void ejercicio10() {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            int numero;
            System.out.println("Ingrese un numero entre el 1 y el 10 ");
            numero = Integer.valueOf(entrada.readLine());
                while (numero > 1 && numero < 10) {
                    char caracter;
                    System.out.println("Ingrese un carácter");
                    String input = entrada.readLine();
                    if (input.length() > 0) {
                        caracter = input.charAt(0);
                        definirCaracter(caracter);
                    }
                    System.out.println("Ingrese un numero entre el 1 y el 10 ");
                    numero = Integer.valueOf(entrada.readLine());
                }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void ejercicio11() {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            int numero;
            System.out.println("Ingrese un numero entre el 1 y el 10 ");
            numero = Integer.valueOf(entrada.readLine());
            while (numero > 1 && numero < 10) {
                if (numero % 3 == 0){
                    char caracter;
                    System.out.println("Ingrese un carácter");
                    String input = entrada.readLine();
                    if (input.length() > 0) {
                        caracter = input.charAt(0);
                        definirCaracter(caracter);
                    }
                } else if (numero % 5 == 0) {
                    imprimirTabla(numero);
                }else {
                    System.out.println("el numero ingresado no es multiplo de 3 ni de 5");
                }
                System.out.println("Ingrese un numero entre el 1 y el 10 ");
                numero = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
    public static void ejercicio12() {
        int dia, mes, anio;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un día :");
            dia = Integer.parseInt(entrada.readLine());
            System.out.println("Ingrese un mes :");
            mes = Integer.parseInt(entrada.readLine());
            System.out.println("Ingrese un año :");
            anio = Integer.parseInt(entrada.readLine());
            int numeroAureo = calcularNumeroAureo(anio);
            System.out.println("el numero aureo es "+numeroAureo);
            int epacta = calcularEpacta(numeroAureo);
            System.out.println("la epacta es "+epacta);
            int edadLunar = calculadEdadLunar(epacta,mes,dia);
            System.out.println("la edad lunar es "+edadLunar);
            String faseLunar = calcularFaseLunar(edadLunar);
            System.out.println("La fase lunar para el dia " + dia + " es " + faseLunar);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    public static int calcularNumeroAureo(int anio){
        return (anio + 1) % 19;

    }

    public static int calcularEpacta(int numeroAureo){
        return ((numeroAureo-1)*11)%30;
    }

    public static int calculadEdadLunar(int epacta, int mes, int dia){
        if (mes==1 || mes==2){
            mes = mes +10;
        }else if (mes == 3){
            mes = 0;
        }else {
            mes = mes -2;
        }
        int edadLunar = epacta + mes + dia;
        int diasEdadLunar;
        if (edadLunar>29){
            diasEdadLunar = edadLunar % 30;
        }else {
            diasEdadLunar = edadLunar;
        }
        return diasEdadLunar;
    }

    public static String calcularFaseLunar(int edadLunar) {
        if (edadLunar >= 0 && edadLunar <= 7) {
            return "Luna Nueva";
        } else if (edadLunar >= 8 && edadLunar <= 14) {
            return "Luna Creciente";
        } else if (edadLunar == 15) {
            return "Luna Llena";
        } else if (edadLunar >= 16 && edadLunar <= 29) {
            return "Luna Menguante";
        } else {
            return "Edad lunar fuera de rango";
        }
    }

}



