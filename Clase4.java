import java.io.BufferedReader;
import java.io.InputStreamReader;

public  class Clase4 {

    public static void main(String[] args) {
        ejercicio1();
    }
    public static void ejercicio1() {
        char numero1;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter :");
            String linea = entrada.readLine();
            if (linea != null && linea.length() > 0) {
                numero1=linea.charAt(0);
                if (numero1>='0' && numero1 <='9'){
                    System.out.println("El caracter es " + numero1);
                }else{
                    System.out.println("El caracter ingresado no es un digito");
                }
            }else{
                System.out.println("no se ha ingresado ningun digito");
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
