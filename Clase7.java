import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Clase7 {
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;

    public static void main(String[] args) {
        char[] arrchar;
        int[] arrint;
        double[] arrdouble;
        arrchar = new char[MAX];
        arrint = new int[MAX];
        arrdouble = new double[MAX];
//        cargar_arreglo_aleatorio_char(arrchar);
//        cargar_arreglo_aleatorio_int(arrint);
//        cargar_arreglo_aleatorio_double(arrdouble);
//        imprimir_arreglo_char(arrchar);
//        imprimir_arreglo_int(arrint);
//        imprimir_arreglo_double(arrdouble);
//        ejemplo4();
//        ejemplo5();
        ejercicio1();
    }

    //carga de arreglo de char con valores de 'a' a la 'z'
    public static void cargar_arreglo_aleatorio_char(char[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (char) (r.nextInt(26) + 'a');
        }
    }

    //carga de arreglo de int con valores de MINVALOR a MAXVALOR
    public static void cargar_arreglo_aleatorio_int(int[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
        }
    }

    //carga de arreglo de double con valores de MINVALOR a MAXVALOR
    public static void cargar_arreglo_aleatorio_double(double[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = ((MAXVALOR - MINVALOR + 1) * r.nextDouble() + MINVALOR * 1.0);
        }
    }

    //impresion de arreglo de char
    public static void imprimir_arreglo_char(char[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
        }
    }

    //impresion de arreglo de int
    public static void imprimir_arreglo_int(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
        }
    }

    //impresion de arreglo de double
    public static void imprimir_arreglo_double(double[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
        }
    }

    public static void ejemplo4() {
        int[] arrenteros = new int[MAX];
        int pos, numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            cargar_arreglo_aleatorio_int(arrenteros);
            imprimir_arreglo_int(arrenteros);
            System.out.println("Ingrese un numero entero :");
            numero = Integer.valueOf(entrada.readLine());
            pos = obtener_pos_arreglo(arrenteros, numero);
            if (pos < MAX) {

                System.out.println(numero + " esta en " + pos);

            } else {

                System.out.println("No existe " + numero);

            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static int obtener_pos_arreglo(int[] arr, int numero) {
        int posicion = 0;
        while ((posicion < MAX) && (arr[posicion] != numero)) {
            posicion++;
        }
        return posicion;
    }

    public static void ejemplo5() {
        int[] arrenteros;
        arrenteros = new int[MAX];
        int pos;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            cargar_arreglo_aleatorio_int(arrenteros);
            imprimir_arreglo_int(arrenteros);
            System.out.println("Ingrese un numero entero pos:");
            pos = Integer.valueOf(entrada.readLine());
            corrimiento_der(arrenteros, pos);
            imprimir_arreglo_int(arrenteros);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void corrimiento_der(int[] arrenteros, int pos) {
        int indice = MAX - 1;
        while (indice > pos) {
            arrenteros[indice] = arrenteros[indice - 1];
            indice--;
        }
    }

    //TP Parte 1

    public static void ejercicio1() {
        int[] arrenteros;
        arrenteros = new int[MAX];
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            cargar_arreglo_aleatorio_int(arrenteros);
            imprimir_arreglo_int(arrenteros);
            invertir_pos(arrenteros);
            System.out.println("El arreglo con los valores cambiados es");
            imprimir_arreglo_int(arrenteros);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void invertir_pos(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temporal = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temporal;
        }
    }

}



