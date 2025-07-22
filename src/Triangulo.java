import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;

        boolean validatorA = false;
        do {
            System.out.print("Ingrese la longitud del primer lado: ");
            if (entrada.hasNextInt()) {
                a = entrada.nextInt();
                validatorA = true;
            } else {
                System.out.println("Entrada inválida. Ingrese un número.");
            }
        } while (!validatorA);

        boolean validatorB = false;
        do {
            System.out.print("Ingrese la longitud del segundo lado: ");
            if (entrada.hasNextInt()) {
                b = entrada.nextInt();
                validatorB = true;
            } else {
                System.out.print("Entrada Inválida. Ingrese un número.");
            }
        } while (!validatorB);

        boolean validatorC = false;
        do {
            System.out.print("Ingrese la longitud del tercer lado");
            if (entrada.hasNextInt()) {
                c = entrada.nextInt();
                validatorC = true;
            } else {
                System.out.println("Entrada inválida. Ingrese un número.");
            }
        } while (!validatorC);

        if (a + b > c && a + c > b && b + c > a) {
            System.out.printf("Sí, con los números %d, %d y %d se puede formar un triángulo.\n", a, b, c);
        } else {
            System.out.printf("No, con los números %d, %d y %d no se puede formar un triángulo.\n", a, b, c);
        }
    }
}
