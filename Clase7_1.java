import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Clase7_1 {
    public static final int MAX = 20;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_letra = 0.4;
    public static final double probabilidad_numero = 0.4;
    public static void main(String[] args) {
        char [] arrchar;
        int [] arrint;
        arrchar = new char[MAX];
        arrint = new int[MAX];
//        cargar_arreglo_aleatorio_secuencias_char(arrchar);
//        imprimir_arreglo_secuencias_char(arrchar);
//        cargar_arreglo_aleatorio_secuencias_int(arrint);
//        imprimir_arreglo_secuencias_int(arrint);
//        precargarArreglo();
//        ejercicio10();
//        ejercicio11();
//        ejercicio12();
//        ejercicio13();
//        ejercicio14();
//        ejercicio15();
        ejercicio16();
    }
    public static void cargar_arreglo_aleatorio_secuencias_char(char[] arr){
        Random r = new Random();
        arr[0] = ' ';
        arr[MAX-1] = ' ';
        for (int pos = 1; pos < MAX-1; pos++){
            if (r.nextDouble()>probabilidad_letra){
                arr[pos]=(char)(r.nextInt(26) + 'a');
            }
            else{
                arr[pos]=' ';
            }
        }
    }

    public static void imprimir_arreglo_secuencias_char(char [] arr){
        System.out.print("Arreglo de secuencias char\n|");
        for (int pos = 0; pos < MAX; pos++){
            System.out.print(arr[pos]+"|");
        }
        System.out.print("\n");
    }
    public static void cargar_arreglo_aleatorio_secuencias_int(int []
                                                                       arr){
        Random r = new Random();
        arr[0] = 0;
        arr[MAX-1] = 0;
        for (int pos = 1; pos < MAX-1; pos++){
            if (r.nextDouble()>probabilidad_numero){
                arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
            }
            else{
                arr[pos]=0;
            }
        }
    }
    public static void imprimir_arreglo_secuencias_int(int [] arr){
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++){
            System.out.print(arr[pos]+"|");
        }
        System.out.print("\n");
    }



    public static void ejercicio10() {
        int [] arrenteros;
        arrenteros = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arrenteros);
        imprimir_arreglo_secuencias_int(arrenteros);
        imprimir_suma_cada_secuencia(arrenteros);
        int pos;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero (pos):");
            pos = Integer.valueOf(entrada.readLine());
            if (arrenteros[pos]!=0){
                int posInicial= encontrarInicioSecuenciaEspecifico(arrenteros, pos);
                int posFinal = encontrarFinSecuencia(arrenteros,pos);
                System.out.println("la posicion inicial de la secuencia es "+ posInicial + " y la posicion final es "+ posFinal);
            }else {
                System.out.println("La posicion requerida no tiene una secuencia");
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    public static int encontrarInicioSecuencia(int[] arr, int pos){
        for (int i = pos; i < MAX; i++) {
            if (arr[i] != 0) {
                return i ;
            }
        }
        return -1;
    }
    public static int encontrarInicioSecuenciaReversa(int [] arr, int pos){
        int pos1 = 0;
            for (int i = pos; i >= 0; i--) {
                if (arr[i] == 0) {
                    pos1 = i + 1;
                    break;
                }
            }
        return pos1;
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
        for (int i = pos; i < MAX; i++) {
            if (arr[i] == 0) {
                pos2 = i - 1;
                break;
            }
        }
        return pos2;
    }

    public static int encontrarFinSecuenciaReversa(int[] arr, int pos){
        for (int i = pos; i > 0; i--) {
            if (arr[i] != 0) {
                return i ;
            }
        }
        return -1;
    }

    public static void imprimir_suma_cada_secuencia(int[] arr){
        int inicio,fin,suma;
        inicio = 0;
        fin = -1;
        while ((inicio < MAX)){
            inicio = encontrarInicioSecuenciaEspecifico(arr,fin+1); //REUTILIZAMOS
            if (inicio < MAX){
                fin = encontrarFinSecuencia(arr,inicio); //REUTILIZAMOS
                suma = obtener_suma_secuencia(arr,inicio,fin);
                System.out.println("La suma de la secuencia de "+inicio+" a "+fin+" es "+suma);
            }
        }
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
        int inicio,fin,suma, sumaTemp , inicioTemp, finTemp;
        inicio = 0;
        fin = -1;
        sumaTemp=0;
        suma=0;
        inicioTemp= 0;
        finTemp= 0;
        while ((inicio < MAX)){
            inicio = encontrarInicioSecuenciaEspecifico(arr,fin+1); //REUTILIZAMOS
            if (inicio < MAX){
                fin = encontrarFinSecuencia(arr,inicio); //REUTILIZAMOS
                suma = obtener_suma_secuencia(arr,inicio,fin);
            }
            if (sumaTemp<suma){
                inicioTemp= inicio;
                finTemp = fin;
                sumaTemp= suma;
            }
        }
        System.out.println("La suma mayor de las secuencias es "+ sumaTemp+" de la posicion "+inicioTemp+" a "+finTemp);

    }


    public static void ejercicio11() {
        int [] arrenteros;
        arrenteros = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arrenteros);
        imprimir_arreglo_secuencias_int(arrenteros);
        imprimir_suma_Mayor(arrenteros);
    }

    public static void ejercicio12(){
        int [] arrenteros;
        arrenteros = new int[MAX];
        int secuencias=0;
        int fin =0;
        int inicio=MAX;
        cargar_arreglo_aleatorio_secuencias_int(arrenteros);
        imprimir_arreglo_secuencias_int(arrenteros);
        while (secuencias < 2) {
           fin = encontrarFinSecuenciaReversa(arrenteros, inicio - 1);
           inicio = encontrarInicioSecuenciaReversa(arrenteros, fin);
            secuencias++;
        }
        System.out.println("la anteultima secuencia inicia en "+ inicio+ " y finaliza en " + fin);
    }

    public static void ejercicio13(){
        int [] arrenteros;
        arrenteros = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arrenteros);
        imprimir_arreglo_secuencias_int(arrenteros);
        int longitud;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese una longitud:");
            longitud = Integer.valueOf(entrada.readLine());
            int comienzo = 0;
            while (comienzo < arrenteros.length) {
                int c = encontrarInicioSecuencia(arrenteros, comienzo);
                if (c == -1) {
                    break;
                }
                int f = encontrarFinSecuencia(arrenteros, c);
                int tamanio = f - c + 1;
                if (tamanio == longitud) {
                    for (int i = c; i <= f; i++) {
                        corrimientoIzquierda(arrenteros, c);
                    }
                }
                comienzo = f + 1;
            }
            imprimir_arreglo_secuencias_int(arrenteros);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void corrimientoIzquierda(int[] arreglo, int posicion) {

        for (int i = posicion; i < arreglo.length - 1; i++) {
            arreglo[i] = arreglo[i + 1];
        }
        arreglo[arreglo.length - 1] = 0;
    }


    public static void ejercicio14(){
        int [] arrenteros;
        arrenteros = new int[MAX];
        int [] nuevoArreglo;
        nuevoArreglo = new int [MAX];
        cargar_arreglo_aleatorio_secuencias_int(arrenteros);
        imprimir_arreglo_secuencias_int(arrenteros);
        imprimir_arreglo_secuencias_int(nuevoArreglo);
        int longitud;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese una longitud:");
            longitud = Integer.valueOf(entrada.readLine());
            int comienzo = 0;
            int nuevoArregloPos = 1;
            while (comienzo < arrenteros.length) {
                int c = encontrarInicioSecuencia(arrenteros, comienzo);
                if (c == -1) {
                    break;
                }
                int f = encontrarFinSecuencia(arrenteros, c);
                int tamanio = f - c + 1;
                if (tamanio == longitud) {
                    if (nuevoArregloPos > 1) {
                        nuevoArreglo[nuevoArregloPos] = 0;
                        nuevoArregloPos++;
                    }
                    for (int i = c; i <= f; i++) {
                        nuevoArreglo[nuevoArregloPos] = arrenteros[i];
                        nuevoArregloPos++;
                    }
                }
                comienzo = f + 1;
            }
            imprimir_arreglo_secuencias_int(arrenteros);
            System.out.println("el nuevo arreglo es");
            imprimir_arreglo_secuencias_int(nuevoArreglo);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    public static void ejercicio15(){
        int [] arrenteros;
        arrenteros = new int[MAX];
        int [] nuevoArreglo;
        nuevoArreglo = new int [MAX];
        cargar_arreglo_aleatorio_secuencias_int(arrenteros);
        imprimir_arreglo_secuencias_int(arrenteros);
        int int1;
        int int2;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese el primer digito del patron");
            int1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el segundo digito del patron");
            int2 = Integer.valueOf(entrada.readLine());
            int comienzo = 0;
            nuevoArreglo[1]=int1;
            nuevoArreglo[2]=int2;
            System.out.println("el nuevo arreglo es");
            imprimir_arreglo_secuencias_int(nuevoArreglo);
            while (comienzo < arrenteros.length) {
                int c = encontrarInicioSecuencia(arrenteros, comienzo);
                if (c == -1) {
                    break;
                }
                int f = encontrarFinSecuencia(arrenteros, c);

                if (arrenteros[c] == nuevoArreglo[1] && arrenteros[f] == nuevoArreglo [2]) {
                    for (int i = c; i <= f; i++) {
                       corrimientoIzquierda(arrenteros,c);
                    }
                }
                comienzo = f + 1;
            }
            imprimir_arreglo_secuencias_int(arrenteros);

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void ejercicio16(){
        int [] arrenteros;
        arrenteros = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arrenteros);
        imprimir_arreglo_secuencias_int(arrenteros);
            int comienzo = 0;
            while (comienzo < arrenteros.length) {
                int c = encontrarInicioSecuencia(arrenteros, comienzo);
                if (c == -1) {
                    break;
                }
                int f = encontrarFinSecuencia(arrenteros, c);
                if (c < f) {
                    for (int i = c; i <= f; i++){
                        corrimientoIzquierda(arrenteros, c);
                }
            }
                comienzo = f + 1;
            }
            imprimir_arreglo_secuencias_int(arrenteros);
    }
}