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
        ejercicio10();
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
        int pos;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero (pos):");
            pos = Integer.valueOf(entrada.readLine());
            if (arrenteros[pos]!=0){
                int posInicial= encontrarInicioSecuencia(arrenteros, pos);
                int posFinal = encontrarFinSecuencia(arrenteros,pos);
                System.out.println("la posicion inicial de la secuencia es "+ posInicial + " y la posicion final es "+ posFinal);
            }else {
                System.out.println("La posicion requerida no tiene una secuencia");
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static int encontrarInicioSecuencia(int[] arr, int pos) {
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

    public static int encontrarFinSecuencia(int[] arr, int pos){
        int pos2 = 0;
        if (pos >= 0 && pos < arr.length) {
            for (int i = pos; i <MAX; i++) {
                if (arr[i] == 0) {
                    pos2 = i - 1;
                    break;
                }
            }
        }
        return pos2;
    }


}