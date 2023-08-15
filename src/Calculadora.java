import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        // Lectura del valor de 2 variables enteras por consola:
        System.out.println("Ingrese el número 1");
        int numero1 = lector.nextInt();
        System.out.println("Ingrese el número 2");
        int numero2 = lector.nextInt();
        System.out.println("Ingrese la operación (+, -, *, /, %, ^)");
        char operacion = lector.next().charAt(0);

        switch (operacion) {
            case '+':
                // Operación suma:
                int suma = numero1 + numero2;
                System.out.println("La suma es " + suma);
                break;
            case '-':
                // Operación resta:
                int resta = numero1 - numero2;
                System.out.println("La resta es " + resta);
                break;
            case '*':
                // Operación multiplicación:
                int multiplicacion = numero1 * numero2;
                System.out.println("La multiplicación es " + multiplicacion);
                break;
            case '/':
                // Operación división:
                double division = (double) numero1 / numero2;
                System.out.println("La división es " + division);
            case '%':
                // Operación modulo:
                int modulo = numero1 % numero2;
                System.out.println("El módulo es " + modulo);

            case '^':
                // Operación potencia:
                double potencia = Math.pow(numero1, numero2);
                System.out.println("La potencia es " + potencia);

                break;

            default:

                System.out.println("operación invalida");
        }
    }
}