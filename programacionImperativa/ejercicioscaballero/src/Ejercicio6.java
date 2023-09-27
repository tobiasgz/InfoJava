import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        final int dolar = 50000;
        Scanner input = new Scanner(System.in);
        double btc = input.nextDouble();
        double resultado = dolar*btc;
        System.out.printf("El resultado de conversion es de %f dolares", resultado);
    }
}
