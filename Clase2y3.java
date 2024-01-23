import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Clase2y3 {
    public static void main() {
//        variablesConstantes();
//        operadores();
//        operadoresIncrementales();
//        operadoresCombinados();
//        operadoresRelacion();
//        operadoresLogicos();
//        ejercicio1();
//        ejercicio2();
//        ejercicio3();
//        ejercico4();
    }

    public static void variablesConstantes() {
        int edad;
        float altura, peso;
        String nombre;

        edad = 10;
        altura = 175;
        peso = 65;
        nombre = "Arturo";
        System.out.println(edad + " edad");
        System.out.println(altura + " altura");
        System.out.println(nombre + " nombre");
        System.out.println(peso + " peso");
    }

    public static void operadores() {
        int i, j, res1, res2, res3;
        double a, b, res4, res5;
        i = 7;
        j = 3;
        a = 7.0;
        b = 3.0;
        res1 = i - j;
        res2 = i / j;
        res3 = i % j;
        res4 = a * b;
        res5 = a / 4.0;
        System.out.println("Operador resto: i - j = " + res1);
        System.out.println("Operador division: i / j = " + res2);
        System.out.println("Operador resto: i % j = " + res3);
        System.out.println("Operador multiplicacion: a * b = " + res4);
        System.out.println("Operador division: a / 4.0 = " + res5);
    }

    public static void operadoresIncrementales() {
        int a, b;
        a = 5;
        a++;
        System.out.println("a = " + a);
        a = 5;
        ++a;
        System.out.println("a = " + a);
        a = 5;
        b = a++;
        System.out.println("a = " + a + ", b = " + b);
        a = 5;
        b = ++a;
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void operadoresCombinados() {
        int i, j;
        double a, b;
        i = 7;
        j = 3;
        a = 7.0;
        b = 3.0;
        i += j;
        a /= b;
        System.out.println("Operador combinado suma: i+=j " + i);
        System.out.println("Operador combinado division: a/=b " + a);
    }

    public static void operadoresRelacion() {
        int i, j;
        char c1, c2;
        boolean resultado;
        i = 7;
        j = 3;
        resultado = (i != j);
        c1 = '0';
        c2 = '5';
        System.out.println("Operador relacion: i!=j " + resultado);
        //es igual a
        System.out.println("Operador relacion: i!=j " + (i != j));

        System.out.println("Operador realcion: c1>c2 " + (c1 > c2));
    }

    public static void operadoresLogicos() {
        int i, j, k;
        boolean res;
        i = 7;
        j = 3;
        k = 2;

        //(i==j)||(i==k) primero se resuelven los paréntesis (i==j) y
        //(i==k), y luego ||. Finalmente el resultado queda en res
        res = (i == j) || (i == k);
        System.out.println("Operacion: (i==j)||(i==k) " + res);

        //((i!=j)||(i==k)) primero se resuelven los paréntesis (i!=j) y
        //(i==k), y luego ||
        System.out.println("Operacion: ((i!=j)||(i==k)) " + ((i != j) || (i == k)));

        //((!(i!=j))||(i==k)) primero se resuelven los paréntesis (!(i!=j))
        //(i==k), y luego ||. Para resolver (!(i!=j)) primero se resuelve
        //(i!=j) y luego se le aplica ! (negacion)
        System.out.println("Operacion: ((!(i!=j))||(i==k)) " + ((!(i != j)) || (i == k)));
    }

    //Práctico Clase 3 - Operadores
    public static void ejercicio1() {
        double numero1;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero :");
            numero1 = Double.parseDouble(entrada.readLine());
            System.out.println("Su numero /2: " + numero1 / 2);
            System.out.println("Su numero /3: " + numero1 / 3);
            System.out.println("Su numero /4: " + numero1 / 4);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void ejercicio2() {
        System.out.println("Tabla de verdad para OR:");
        imprimirTablaOr();

        System.out.println("\nTabla de verdad para AND:");
        imprimirTablaAnd();
    }


    private static void imprimirTablaOr() {
        boolean A = false;
        boolean B = false;
        System.out.printf("| %s | %s | %-7s |\n", A, B, A || B);

        B = true;
        System.out.printf("| %s | %s | %-7s |\n", A, B, A || B);

        A = true;
        B = false;
        System.out.printf("| %s | %s | %-7s |\n", A, B, A || B);

        B = true;
        System.out.printf("| %s | %s | %-7s |\n", A, B, A || B);
    }

    private static void imprimirTablaAnd() {

        boolean A = false;
        boolean B = false;
        System.out.printf("| %s | %s | %-8s |\n", A, B, A && B);

        B = true;
        System.out.printf("| %s | %s | %-8s |\n", A, B, A && B);

        A = true;
        B = false;
        System.out.printf("| %s | %s | %-8s |\n", A, B, A && B);

        B = true;
        System.out.printf("| %s | %s | %-8s |\n", A, B, A && B);
    }

    public static void ejercicio3() {
        int numero1, numero2;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero :");
            numero1 = Integer.parseInt(entrada.readLine());
            System.out.println("Ingrese un numero entero :");
            numero2 = Integer.parseInt(entrada.readLine());
            System.out.println(numero1 > numero2 ? "el " + numero1 + " es mayor al " + numero2 : "el " + numero1 + " es menor al " + numero2);
            System.out.println(numero1 % 2 == 0 ? "el " + numero1 + " es multiplo de 2" : "el " + numero1 + " no es multiplo de 2");
            System.out.println(numero2 % 2 == 0 ? "el " + numero2 + " es multiplo de 2" : "el " + numero2 + " no es multiplo de 2");
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void ejercico4() {
        int numero1;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero :");
            numero1 = Integer.parseInt(entrada.readLine());
            System.out.println(numero1 % 6 == 0 && numero1 % 7 == 0 ? "el " + numero1 + " es multiplo de 6 y de 7" :"el " + numero1 +" no es multiplo de 6 y de 7 ") ;
            System.out.println(numero1 + " es mayor a 30 y múltiplo de 2, o es menor igual a 30? "+Boolean.toString((numero1>30 && numero1 % 2 == 0)||numero1<=30));
            System.out.println(numero1 / 5 >10?"el cociente de la división de "+numero1+" con 5, es mayor a 10":"el cociente de la división de "+numero1+" con 5, es menor a 10");
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}