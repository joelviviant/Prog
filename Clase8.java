import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Clase8 {
    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 5;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static final double probabilidad_letra = 0.4;
    public static final double probabilidad_numero = 0.4;
    public static void main(String[] args) {
        char[][] matchar;
        int[][] matint;
        double[][] matdouble;
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
//        ejercicio6();
//        ejercicio7();
//        ejercicio8();
//        ejercicio9();
//        ejercicio10();
//        ejercicio11();
//        ejercicio12();
        ejercicio13();

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
        if (pos < 0 || pos >= arrenteros.length) {
            return;
        }
        for (int indice = pos; indice < arrenteros.length - 1; indice++) {
            arrenteros[indice] = arrenteros[indice + 1];
        }
        arrenteros[arrenteros.length - 1] = 0;
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



    public static void ejercicio7() {
        int[][] matint;
        int numero, fila;
        matint = new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz_aleatorio_int(matint);
        for (int c = 0; c < MAXCOLUMNA; c++) {
            ordenar_matriz_columna_seleccion(matint, c);
        }
        for (int f = 0; f < MAXFILA; f++) {
            ordenar_arreglo_seleccion(matint[f]);
        }
        imprimir_matriz_int(matint);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero :");
            numero = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese una fila :");
            fila = Integer.valueOf(entrada.readLine());
            insertarOrdenado(matint[fila], numero);
            imprimir_matriz_int(matint);
    }catch (Exception exc) {
            System.out.println(exc);
        }
    }


    public static void ordenar_matriz_columna_seleccion(int[][] mat, int columna) {
        for (int i = 0; i < MAXFILA - 1; i++) {
            int pos_menor = i;
            for (int j = i + 1; j < MAXFILA; j++) {
                if (mat[j][columna] < mat[pos_menor][columna]) {
                    pos_menor = j;
                }
            }
            if (pos_menor != i) {
                int tmp = mat[i][columna];
                mat[i][columna] = mat[pos_menor][columna];
                mat[pos_menor][columna] = tmp;
            }
        }
    }

    public static void ordenar_arreglo_seleccion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int pos_menor = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[pos_menor]) {
                    pos_menor = j;
                }
            }
            if (pos_menor != i) {
                int tmp = arr[i];
                arr[i] = arr[pos_menor];
                arr[pos_menor] = tmp;
            }
        }
    }
    public static void insertarOrdenado(int[] arr, int numero) {
        int i;
        for (i = arr.length - 1; i > 0 && arr[i - 1] > numero; i--) {
            arr[i] = arr[i - 1];
        }
        arr[i] = numero;
    }

    public static void ejercicio8() {
        int[][] matint;
        int[] resultado = new int[2];
        int numero, fila, columna;
        matint = new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz_aleatorio_int(matint);
        for (int c = 0; c < MAXCOLUMNA; c++) {
            ordenar_matriz_columna_seleccion(matint, c);
        }
        for (int f = 0; f < MAXFILA; f++) {
            ordenar_arreglo_seleccion(matint[f]);
        }
        imprimir_matriz_int(matint);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero :");
            numero = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese una fila :");
            fila = Integer.valueOf(entrada.readLine());
            resultado = encontrar_coincidencia(matint,numero);
            fila = resultado[0];
            columna = resultado[1];
            corrimiento_izq_fila_columna(matint[fila], columna);
            imprimir_matriz_int(matint);
        }catch (Exception exc) {
            System.out.println(exc);
        }
    }


    public static void ejercicio9() {
        int[][] matint;
        int[] resultado = new int[2];
        int numero,numero2, fila, columna;
        matint = new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz_aleatorio_int(matint);
        imprimir_matriz_int(matint);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero :");
            numero = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese otro numero :");
            numero2 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese una fila :");
            fila = Integer.valueOf(entrada.readLine());
            ordenar_fila_entre_columnas(matint[fila],numero,numero2);
            imprimir_matriz_int(matint);
        }catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void ordenar_fila_entre_columnas(int []arr,int numero, int numero2){
        for (int i =numero; i<=numero2;i++){
            int pos_menor = i;
            for (int j = i + 1; j <= numero2; j++) {
                if (arr[j] < arr[pos_menor]) {
                    pos_menor = j;
                }
            }
            if (pos_menor != i) {
                int tmp = arr[i];
                arr[i] = arr[pos_menor];
                arr[pos_menor] = tmp;
            }
        }
    }
    public static void cargar_matriz_aleatorio_secuencias_int(int [][] mat){
        for (int fila = 0; fila < MAXCOLUMNA; fila++){
            cargar_arreglo_aleatorio_secuencias_int(mat[fila]);
        }
        System.out.println("");
    }
    public static void cargar_matriz_aleatorio_secuencias_char(char
                                                                       [][] mat){
        for (int fila = 0; fila < MAXCOLUMNA; fila++){
            cargar_arreglo_aleatorio_secuencias_char(mat[fila]);
        }
        System.out.println("");
    }
    public static void cargar_arreglo_aleatorio_secuencias_char(char[] arr){
        Random r = new Random();
        arr[0] = ' ';
        arr[MAXCOLUMNA-1] = ' ';
        for (int pos = 1; pos < MAXCOLUMNA-1; pos++){
            if (r.nextDouble()>probabilidad_letra){
                arr[pos]=(char)(r.nextInt(26) + 'a');
            }
            else{
                arr[pos]=' ';
            }
        }
    }
    public static void cargar_arreglo_aleatorio_secuencias_int(int [] arr){
        Random r = new Random();
        arr[0] = 0;
        arr[MAXCOLUMNA-1] = 0;
        for (int pos = 1; pos < MAXCOLUMNA-1; pos++){
            if (r.nextDouble()>probabilidad_numero){
                arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
            }
            else{
                arr[pos]=0;
            }
        }
    }

    public static void ejercicio10(){
        int[][] matint;
       int  fin= 0;
        int inicio = 0;
        int numero, fila;
        matint = new int[MAXFILA][MAXCOLUMNA];
        for (int f = 0; f < MAXFILA; f++){
            cargar_arreglo_aleatorio_secuencias_int(matint[f]);
        }
        imprimir_matriz_int(matint);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero :");
            numero = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese una fila :");
            fila = Integer.valueOf(entrada.readLine());
            if (matint[fila][numero]!=0){
            int posInicial = encontrarInicioSecuenciaEspecifico(matint[fila], numero);
            int posFinal = encontrarFinSecuencia(matint[fila],posInicial);
                System.out.println("la posicion inicial de la secuencia es "+ posInicial + " y la posicion final es "+ posFinal);
            }else {
                System.out.println("La posicion requerida no tiene una secuencia");
            }

        }catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static int encontrarInicioSecuenciaEspecifico(int[] arr, int pos) {
        int pos1 = 0;
        if (pos >= 0 && pos < arr.length) {
            for (int i = pos; i >= 0; i--) {
                if (arr[i] == 0) {
                    pos1 = i + 1;
                    break;
                }
            }
        }
        return pos1;
    }

    public static int encontrarFinSecuencia(int[] arr, int pos) {
        int pos2 = 0;
        for (int i = pos; i < arr.length; i++) { // Utiliza la longitud del array arr en lugar de MAXFILA
            if (arr[i] == 0) {
                pos2 = i - 1;
                break;
            }
        }
        return pos2;
    }

    public static void imprimir_suma_cada_secuencia(int[] arr){
        int inicio,fin,suma;
        inicio = 0;
        fin = -1;
        while ((inicio < MAXCOLUMNA)){
            inicio = encontrarInicioSecuencia(arr,fin+1);
            if (inicio < MAXCOLUMNA){
                fin = encontrarFinSecuencia(arr,inicio);
                suma = obtener_suma_secuencia(arr,inicio,fin);
                System.out.println("La suma de la secuencia de "+inicio+" a "+fin+" es "+suma);
            }
        }
    }

    public static int encontrarInicioSecuencia(int[] arr, int pos){
        for (int i = pos; i < MAXCOLUMNA; i++) {
            if (arr[i] != 0) {
                return i ;
            }
        }
        return -1;
    }

    public static int obtener_suma_secuencia(int[] arr, int inicio, int fin){
        int suma = 0;
        while (inicio <= fin){
            suma+=arr[inicio];
            inicio++;
        }
        return suma;
    }

    public static void imprimir_suma_Mayor(int[] arr){
        int inicio, fin, suma, sumaTemp, inicioTemp, finTemp;
        inicio = 0;
        fin = -1;
        sumaTemp = 0;
        suma = 0;
        inicioTemp = 0;
        finTemp = 0;
        while (inicio < MAXCOLUMNA) {
            inicio = encontrarInicioSecuencia(arr, fin + 1);
            if (inicio == -1) {
                break; // Salir del bucle si encontrarInicioSecuencia devuelve -1
            }
            fin = encontrarFinSecuencia(arr, inicio);
            if (fin == -1) {
                break; // Salir del bucle si encontrarFinSecuencia devuelve -1
            }
            suma = obtener_suma_secuencia(arr, inicio, fin);
            if (sumaTemp < suma) {
                inicioTemp = inicio;
                finTemp = fin;
                sumaTemp = suma;
            }
        }
        System.out.println("La suma mayor de las secuencias es " + sumaTemp + " de la posicion " + inicioTemp + " a " + finTemp);
    }

    public static void ejercicio11() {
        int[][] matint;
        matint = new int[MAXFILA][MAXCOLUMNA];
        for (int f = 0; f < MAXFILA; f++) {
            cargar_arreglo_aleatorio_secuencias_int(matint[f]);
        }
        imprimir_matriz_int(matint);
        for (int f = 0; f < MAXFILA; f++) {
            imprimir_suma_Mayor(matint[f]);
        }
   }

    public static void ejercicio12() {
        int[][] matint;
        matint = new int[MAXFILA][MAXCOLUMNA];
        for (int f = 0; f < MAXFILA; f++) {
            cargar_arreglo_aleatorio_secuencias_int(matint[f]);
        }
        imprimir_matriz_int(matint);
        for (int f = 0; f < MAXFILA; f++) {
            int inicio = MAXCOLUMNA - 1; // Reinicializar inicio para cada fila
            int fin = 0;
            int secuencias = 0;
            while (secuencias < 2 ) {
                fin = encontrarFinSecuenciaReversa(matint[f], inicio - 1);
                inicio = encontrarInicioSecuenciaReversa(matint[f], fin);
                if (inicio == -1){
                    break;
                }
                secuencias++;
            }
            if (secuencias == 1) {
                System.out.println("En la fila " + f + " solo existe una secuencia.");
            }
            if(secuencias == 2){
                System.out.println("La anteúltima secuencia de la fila " + f + " inicia en " + inicio + " y finaliza en " + fin);
            }
        }
    }
    public static int encontrarFinSecuenciaReversa(int[] arr, int pos){
        for (int i = pos; i > 0; i--) {
            if (arr[i] != 0) {
                return i ;
            }
        }
        return -1;
    }    public static int encontrarInicioSecuenciaReversa(int [] arr, int pos){
        int pos1 = -1;
        for (int i = pos; i >= 0; i--) {
            if (arr[i] == 0) {
                pos1 = i + 1;
                break;
            }
        }
        return pos1;
    }

    public static void ejercicio13(){
        int[][] matint;
        matint = new int[MAXFILA][MAXCOLUMNA];
        for (int f = 0; f < MAXFILA; f++) {
            cargar_arreglo_aleatorio_secuencias_int(matint[f]);
        }
        imprimir_matriz_int(matint);
        int longitud;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese una longitud:");
            longitud = Integer.valueOf(entrada.readLine());
            int comienzo = 0;
            for (int fila = 0; fila < MAXFILA; fila++) {
                while (comienzo < MAXCOLUMNA) {
                    int c = encontrarInicioSecuencia(matint[fila], comienzo);
                    if (c == -1) {
                        break;
                    }
                    int f = encontrarFinSecuencia(matint[fila], c);
                    int tamanio = f - c + 1;
                    if (tamanio == longitud) {
                        for (int i = c; i <= f; i++) {
                            corrimiento_izq_fila_columna(matint[fila], c);
                        }
                    }
                    comienzo = f + 1;
                }
                comienzo=0;
            }
            imprimir_matriz_int(matint);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}



