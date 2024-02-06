import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Clase8 {
    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 5;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String[] args) {
        char [][] matchar;
        int [][] matint;
        double [][] matdouble;
        matchar = new char[MAXFILA][MAXCOLUMNA];
        matint = new int[MAXFILA][MAXCOLUMNA];
        matdouble = new double[MAXFILA][MAXCOLUMNA];
//        cargar_matriz_int(matint);
//        imprimir_matriz_int(matint);
//        cargar_matriz_aleatorio_char(matchar);
//        cargar_matriz_aleatorio_int(matint);
//        cargar_matriz_aleatorio_double(matdouble);
//        imprimir_matriz_char(matchar);
//        imprimir_matriz_int(matint);
//        imprimir_matriz_double(matdouble);
        ejemplo2();

    }

    public static void cargar_matriz_int(int [][] mat){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            for (int fila = 0; fila < MAXFILA; fila++){
                for (int columna = 0; columna < MAXCOLUMNA; columna++){
                    System.out.println("Ingrese un entero para la posicion ["+fila+"]["+columna+"]");
                    mat[fila][columna] = Integer.valueOf(entrada.readLine());
                }
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }

    public static void cargar_matriz_aleatorio_char(char [][] mat){
        Random r = new Random();
        for (int fila = 0; fila < MAXFILA; fila++){
            for (int columna = 0; columna < MAXCOLUMNA; columna++){
                mat[fila][columna]=(char)(r.nextInt(26) + 'a');
            }
        }
    }

    public static void cargar_matriz_aleatorio_int(int[][] mat) {
        Random r = new Random();
        for (int fila = 0; fila < MAXFILA; fila++) {
            for (int columna = 0; columna < MAXCOLUMNA; columna++) {
                mat[fila][columna] = (r.nextInt(MAXVALOR + MINVALOR - 1) + MINVALOR);
            }
        }
    }

    public static void cargar_matriz_aleatorio_double(double[][] mat) {
        Random r = new Random();
        for (int fila = 0; fila < MAXFILA; fila++) {
            for (int columna = 0; columna < MAXCOLUMNA; columna++) {
                mat[fila][columna] = ((MAXVALOR - MINVALOR - 1) * r.nextDouble() + MINVALOR * 1.0);
            }
        }
    }

    public static void imprimir_matriz_char(char[][] mat) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            System.out.print("|");
            for (int columna = 0; columna < MAXCOLUMNA; columna++) {
                System.out.print(mat[fila][columna] + "|");
            }
            System.out.println("");
        }
    }

    public static void imprimir_matriz_int(int[][] mat) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            System.out.print("|");
            for (int columna = 0; columna < MAXCOLUMNA; columna++) {
                System.out.print(mat[fila][columna] + "|");
            }
            System.out.println("");
        }
    }

    public static void imprimir_matriz_double(double[][] mat) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            System.out.print("|");
            for (int columna = 0; columna < MAXCOLUMNA; columna++) {
                System.out.print(mat[fila][columna] + "|");
            }
            System.out.println("");
        }
    }

    public static void ejemplo2() {
        int[][] matint;
        matint = new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz_aleatorio_int(matint);
        imprimir_matriz_int(matint);
        imprimir_promedios_filas(matint);
    }

    public static void imprimir_promedios_filas(int[][] mat) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            System.out.println("Promedio de la fila " + fila + " es " + promedio_fila(mat, fila));
        }
    }

    public static int promedio_fila(int[][] mat, int fila) {
        int promedio;
        int suma = 0;
        for (int columna = 0; columna < MAXCOLUMNA; columna++) {
            suma += mat[fila][columna];
        }
        promedio = suma / MAXCOLUMNA;
        return promedio;
    }

    public static void ejemplo5() {
        int numero;
        int[][] matint;
        matint = new int[MAXFILA][MAXCOLUMNA];
        //cargar_matriz_aleatorio_int(matint);
        //imprimir_matriz_int(matint);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("ingrese un numero entero: ");
            numero = Integer.valueOf(entrada.readLine());
            imprimir_fila_columna_matriz(matint, numero);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void imprimir_fila_columna_matriz(int[][] mat, int numero) {
        int fila = 0;
        int columna = MAXCOLUMNA;
        while ((fila < MAXFILA) && (columna == MAXCOLUMNA)) {
            columna = obtener_pos_arreglo(mat[fila], numero);
            if (columna == MAXCOLUMNA) {
                fila++;
            }
        }
        if ((fila < MAXFILA) && (columna < MAXCOLUMNA)) {
            System.out.println(numero + " se encuentra en " + fila + " y " + columna);
        } else {
            System.out.println(numero + " no se encuentra en la matriz");
        }
    }

    public static int obtener_pos_arreglo(int[] arr, int numero) {
        int posicion = 0;
        while ((posicion < MAXCOLUMNA) && (arr[posicion] != numero)) {
            posicion++;
        }
        return posicion;
    }

    public static void ejemplo6(){
        int [][] matint;
        int fila, columna;
        matint = new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz_aleatorio_int(matint);
        imprimir_matriz_int(matint);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese una fila :");
            fila = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese una columna :");
            columna = Integer.valueOf(entrada.readLine());
            if ((0<=fila)&&(fila < MAXFILA)&&(0<=columna)&&(columna < MAXCOLUMNA)){
                corrimiento_der_fila_columna(matint[fila],columna);
                imprimir_matriz_int(matint);
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
    public static void corrimiento_der_fila_columna(int [] arrenteros, int pos){
        int indice = MAXCOLUMNA-1;
        while (indice > pos){
            arrenteros[indice] = arrenteros[indice-1];
            indice--;
        }
    }

}
