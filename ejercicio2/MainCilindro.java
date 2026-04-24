package ejercicio2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase principal que crea varios objetos {@link Cilindro},
 * los muestra por pantalla y los ordena según su Volumen total.
 */
public class MainCilindro {

    static Scanner tec = new Scanner(System.in);

    /**
     * Método principal del programa.
     *
     * @param args argumentos de línea de comandos (no usados)
     */
    public static void main(String[] args){

        ArrayList<Cilindro> listaCilindro = new ArrayList<>();

        System.out.println("Introduce el radio del clindro1");
        int radio = leerEnteroPositivo();
        System.out.println("Introduce el radio del clindro2");
        int radio2 = leerEnteroPositivo();
        System.out.println("Introduce el radio del clindro3");
        int radio3 = leerEnteroPositivo();
        System.out.println("Introduce la altura del clindro1");
        int altura = leerEnteroPositivo();
        System.out.println("Introduce la altura del clindro2");
        int altura2 = leerEnteroPositivo();
        System.out.println("Introduce la altura del clindro3");
        int altura3 = leerEnteroPositivo();


        Cilindro cilindro1 = new Cilindro(radio,altura);
        Cilindro cilindro2 = new Cilindro(radio2,altura2);
        Cilindro cilindro3 = new Cilindro(radio3,altura3);

        JOptionPane.showMessageDialog(null, "Creado el objeto ejercicio2.Cilindro 1 con: " +
                "\nVolumen: " + cilindro1.calcularVolumenCilindro() +
                "\nArea: " + cilindro1.calcularAreaCilindro());

        JOptionPane.showMessageDialog(null, "Creado el objeto ejercicio2.Cilindro 1 con: " +
                "\nVolumen: " + cilindro2.calcularVolumenCilindro() +
                "\nArea: " + cilindro2.calcularAreaCilindro());

        JOptionPane.showMessageDialog(null, "Creado el objeto ejercicio2.Cilindro 3 con: " +
                "\nVolumen: " + cilindro3.calcularVolumenCilindro() +
                "\nArea: " + cilindro3.calcularAreaCilindro());

        listaCilindro.add(cilindro1);
        listaCilindro.add(cilindro2);
        listaCilindro.add(cilindro3);

        listaCilindro.sort(Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        sb.append("Ordenados de mayor a menor por volumen:\n");
        for (Cilindro p : listaCilindro) {
            sb.append(p.toString()).append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }

    /**
     * Lee un número entero >= 0 desde teclado con validación.
     * Repite la lectura mientras el usuario introduzca valores inválidos.
     *
     * @return número entero >= 0 validado.
     */
    public static int leerEnteroPositivo() {
        boolean valido = false;
        int num = 0;

        do {
            try {
                num = tec.nextInt();
                tec.nextLine();

                if (num < 0) {
                    System.out.println("Por favor, introduce un número entero mayor o igual a 0: ");
                } else {
                    valido = true;
                }
            } catch (InputMismatchException e) {
                System.err.print("Por favor, introduce solo números enteros: ");
                tec.nextLine();
            }
        } while (!valido);

        return num;
    }

}
