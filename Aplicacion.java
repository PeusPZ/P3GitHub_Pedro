
import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " es par.");
        } else {
            System.out.println(num + " es impar.");
        }

        sc.close();
    }
}
