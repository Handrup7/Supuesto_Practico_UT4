import java.util.Scanner;

public class Maina {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int a, b;
        boolean ep;
        System.out.print("Introduzca primer numero: ");
        a = t.nextInt();
        System.out.print("Introduzca segundo numero: ");
        b = t.nextInt();
        int ma, me;
        if (a > b) {
            ma = a;
            me = b;
        } else {
            ma = b;
            me = a;
        }
        for (int i = me; i <= ma; i++) {
            ep = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    ep = false;
                }
            }
            if (ep) {
                System.out.println(i + " ");
            }
        }
    }
}