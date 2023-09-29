import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("El numero %d es par", numero);
        } else {
            System.out.printf("El numero %d es impar", numero);
        }
    }
}
