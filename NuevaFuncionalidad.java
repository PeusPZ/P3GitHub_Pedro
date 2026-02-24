import java.util.Scanner;

public class NuevaFuncionalidad {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        int num = entrada.nextInt();

        if (num % 2 == 0 ) {
            System.out.println(num + " NO es primo.");

        } else {
            System.out.println(num + " es primo.");
        }

        entrada.close();
    }
    
}
