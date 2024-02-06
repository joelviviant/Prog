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
//        ejemplo2();
//        ejercicio1();
//        ejercicio2();
//        ejercicio3();
//        ejercicio4();
//        ejercicio5();
        ejercicio6();

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

    public static void ejercicio1() {
        int[][] matint;
        int fila, columna;
        fila=0;
        columna=0;
        matint = new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz_aleatorio_int(matint);
        imprimir_matriz_int(matint);
        for (int f = 0; f<MAXFILA; f++) {
            invertir_pos(matint[f]);
        }
        System.out.println("nueva matriz");
        imprimir_matriz_int(matint);
    }
    public static void invertir_pos(int[] arr) {
        int n = arr.length;
            for (int i = 0; i < n / 2; i++) {
                int temporal = arr[i];
                arr[i] = arr[n - 1 - i];
                arr[n - 1 - i] = temporal;
            }

    }

    public static void ejercicio2() {
        int[][] matint;
        int fila, columna;
        fila=0;
        columna=0;
        matint = new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz_aleatorio_int(matint);
        imprimir_matriz_int(matint);
        for (int f = 0; f<MAXFILA; f++) {
            int pares = sumar_pares(matint[f]);
            System.out.println("La fila"+ f +" tiene " + pares + " numeros pares");
        }

    }

    public static int sumar_pares(int[] arr) {
        int pares = 0;
        for (int i = 0; i < MAXFILA; i++) {
            if (arr[i] % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }

    public static void ejercicio3(){
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
                corrimiento_izq_fila_columna(matint[fila],columna);
                imprimir_matriz_int(matint);
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }

    public static void corrimiento_izq_fila_columna(int[] arrenteros, int pos) {
        int indice = pos;
        while (indice < arrenteros.length - 1) {
            arrenteros[indice] = arrenteros[indice + 1];
            indice++;
        }
    }

    public static void ejercicio4(){
        int [][] matint;
        int fila, columna, numero;
        matint = new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz_aleatorio_int(matint);
        imprimir_matriz_int(matint);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un numero :");
            numero = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese una fila :");
            fila = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese una columna :");
            columna = Integer.valueOf(entrada.readLine());
            if ((0<=fila)&&(fila < MAXFILA)&&(0<=columna)&&(columna < MAXCOLUMNA)){
                corrimiento_der_fila_columna_insercion(matint[fila],columna,numero);
                imprimir_matriz_int(matint);
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }


    public static void corrimiento_der_fila_columna_insercion(int[] arrenteros, int pos ,int numero) {
        int indice = MAXCOLUMNA-1;
        while (indice > pos){
            arrenteros[indice] = arrenteros[indice-1];
            indice--;
        }
        arrenteros[pos] = numero;
    }

    /*
    * Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
    precargada, solicite al usuario un numero entero y elimine la primer ocurrencia de numero
    en la matriz (un número igual) si existe. Para ello tendrá que buscar la posición y si está,
    realizar un corrimiento a izquierda y no continuar buscando.
    * */


    public static void ejercicio5(){
            int [][] matint;
            int fila, columna, numero;
            int [] resultado;

            matint = new int[MAXFILA][MAXCOLUMNA];
            cargar_matriz_aleatorio_int(matint);
            imprimir_matriz_int(matint);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.println("Ingrese un numero :");
                numero = Integer.valueOf(entrada.readLine());
                resultado = encontrar_coincidencia(matint,numero);
                fila = resultado[0];
                columna = resultado[1];
                System.out.println(fila);
                System.out.println(columna);
                corrimiento_izq_fila_columna(matint[fila],columna);
                imprimir_matriz_int(matint);

            }catch (Exception exc){
                System.out.println(exc);
            }
    }


    public static int[] encontrar_coincidencia(int[][] mat, int numero) {
        int[] resultado = new int[2];
        resultado[0] = -1; // Inicializamos fila y columna como -1 para indicar que no se encontró ninguna coincidencia
        resultado[1] = -1;
        for (int fila = 0; fila < MAXFILA; fila++) {
            for (int columna = 0; columna < MAXCOLUMNA; columna++) {
                if (mat[fila][columna] == numero) {
                    resultado[0] = fila;
                    resultado[1] = columna;
                    return resultado; // Devolvemos la primera coincidencia encontrada
                }
            }
        }
        return resultado; // Devolvemos -1 si no se encontró ninguna coincidencia
    }



    public static void ejercicio6(){
        int [][] matint;
        int fila, columna, numero;
        int [] resultado;
        resultado = new int[2];
        matint = new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz_aleatorio_int(matint);
        imprimir_matriz_int(matint);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero :");
            numero = Integer.valueOf(entrada.readLine());
            boolean hayCoincidencia = true;
            while (hayCoincidencia) {
                resultado = encontrar_coincidencia(matint, numero);
                if (resultado[0] != -1 && resultado[1] != -1) {
                    fila= resultado[0];
                    columna = resultado[1];
                    corrimiento_izq_fila_columna(matint[fila], columna);
                } else {
                    hayCoincidencia = false;
                    break;
                }
            }
            imprimir_matriz_int(matint);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

}



