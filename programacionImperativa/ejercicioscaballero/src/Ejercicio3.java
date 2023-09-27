import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        final double DOLAR = 1.2;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros a cambiar");
        double euros = input.nextDouble();
        double resultado = euros*DOLAR;

        System.out.printf("El resultado de la conversion solicitada es: %f dolares", resultado);


    }
}
