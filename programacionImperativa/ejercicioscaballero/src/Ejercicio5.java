import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        final int EUROS = 20;
        Scanner input = new Scanner(System.in);
        int pesos = input.nextInt();
        double resultado = pesos/EUROS;

        System.out.printf("El resultado de conversion es de %f euros", resultado);

    }
}
