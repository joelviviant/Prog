public class Prog_1 {
    public static void main(String[] args) {
        variablesConstantes();
        operadores();
        operadoresIncrementales();
    }
    public static void variablesConstantes(){
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
        res1 = i-j;
        res2 = i/j;
        res3 = i%j;
        res4 = a*b;
        res5 = a/4.0;
        System.out.println("Operador resto: i - j = " + res1);
        System.out.println("Operador division: i / j = " + res2);
        System.out.println("Operador resto: i % j = " + res3);
        System.out.println("Operador multiplicacion: a * b = " + res4);
        System.out.println("Operador division: a / 4.0 = " + res5);
    }
    public static void operadoresIncrementales(){
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

}