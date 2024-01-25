import java.io.BufferedReader;
import java.io.InputStreamReader;

public  class Clase4 {

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio2_1();
        //ejercicio2_2();
//        ejercicio2_3();
        ejercicio2_4();
    }

    //Parte 1 TP Clase 4 - Selectivas o Condicionales
    public static void ejercicio1() {
        char numero1;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter :");
            String linea = entrada.readLine();
            if (linea != null && linea.length() > 0) {
                numero1 = linea.charAt(0);
                if (numero1 >= '0' && numero1 <= '9') {
                    System.out.println("El caracter es " + numero1);
                } else {
                    System.out.println("El caracter ingresado no es un digito");
                }
            } else {
                System.out.println("no se ha ingresado ningun digito");
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }


    public static void ejercicio2() {
        int numero1, numero2;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero :");
            numero1 = Integer.parseInt(entrada.readLine());
            System.out.println("Ingrese un numero entero :");
            numero2 = Integer.parseInt(entrada.readLine());
            if (numero1 > numero2) {
                System.out.println("A");
            } else if (numero1 % 2 == 0 && numero2 % 2 == 0) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void ejercicio3() {
        int numero1;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero :");
            numero1 = Integer.parseInt(entrada.readLine());
            if (numero1 % 6 == 0 && numero1 % 7 == 0) {
                System.out.println("es multiplo de 6 y 7");
            } else if (numero1 > 30 && numero1 % 2 == 0) {
                System.out.println("es mayor a 30 y multiplo de 2");
            }
            if (numero1 / 5 > 10) {
                System.out.println("el cociente de la división de dicho número con 5 es mayor a 10");
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    //Parte 2 TP Clase 4 - Selectivas o Condicionales

    public static void ejercicio2_1() {
        int numero1;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero :");
            numero1 = Integer.parseInt(entrada.readLine());
            if (numero1 > 0) {
                if (numero1 >= 100) {
                    System.out.println("grande");
                } else {
                    System.out.println("menor");
                }
                System.out.println("El valor es positivo");
            } else {
                if (numero1 % 2 == 0) {
                    System.out.println("Es par");
                } else if (numero1 % 3 == 0) {
                    System.out.println("Es multiplo de 3");
                } else {
                    System.out.println("No es par y no es multiplo de 3");
                }
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }


    public static void ejercicio2_2() {
        char char1;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter :");
            String linea = entrada.readLine();
            if (linea != null && linea.length() > 0) {
                char1 = linea.charAt(0);
                if (char1 >= '0' && char1 <= '9') {
                    System.out.println("Es un digito");
                } else if (char1 >= 'a' && char1 <= 'z') {
                    System.out.println("Es una letra minuscula");
                    if (char1 == 'a' || char1 == 'e' || char1 == 'i' || char1 == 'o' || char1 == 'u') {
                        System.out.println("Es una vocal");
                    } else {
                        System.out.println("Es una consonante");
                    }
                } else {
                    System.out.println("No es un digito y no una letra minuscula");
                }
            } else {
                System.out.println("No se ha ingresado ningun caracter");
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void ejercicio2_3() {
        int numero1;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero :");
            numero1 = Integer.parseInt(entrada.readLine());

            switch (numero1){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12: {
                    System.out.println("El mes tiene 31 dias");
                    break;
                }
                case 2:{
                    BufferedReader anioEntrada = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Ingrese un año :");
                    int anio = Integer.parseInt(anioEntrada.readLine());
                    if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
                        System.out.println("El mes tiene 29");
                    }else {
                        System.out.println("El mes tiene 28");
                    }
                    break;
                }
                case 4: case 6: case 9: case 11:{
                    System.out.println("El mes tiene 30 dias");
                }
                default:
                    System.out.println("ese numero no corresponde a un mes");
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    public static void ejercicio2_4() {
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

    public static String calcularFaseLunar(int edadLunar){
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
