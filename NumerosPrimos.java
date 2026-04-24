import java.util.Scanner;

/**
 * Clase que hace un recorrido entre dos números y muestra los que son primos
 */
public class NumerosPrimos {
    static Scanner t = new Scanner(System.in);

    /**
     * Base del programa principal que ejecuta el programa
     *
     * @param args argumentos vacíos que no se usan
     */
    public static void main(String[] args) {
        int numero1, numero2;
        System.out.print("Introduzca primer numero: ");
        numero1 = t.nextInt();
        System.out.print("Introduzca segundo numero: ");
        numero2 = t.nextInt();
        listaPrimos(numero1, numero2);
    }

    /**
     * Método que devuelva una lista de números primos después de recorrer los 2 números pasados por el usuario
     *
     * @param numero1 primer número que introduce el usuario
     * @param numero2 segundo número que introduce el usuario
     */
    private static void listaPrimos(int numero1, int numero2) {
        boolean primos;
        int mayor, menor;
        if (numero1 > numero2) {
            mayor = numero1;
            menor = numero2;
        } else {
            mayor = numero2;
            menor = numero1;
        }
        for (int i = menor; i <= mayor; i++) {
            primos = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primos = false;
                }
            }
            if (primos) {
                System.out.println(i + " ");
            }
        }
    }
}