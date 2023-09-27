import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        final double DOLAR = 1.4;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de libras a cambiar");
        double libras = input.nextDouble();
        double resultado = libras*DOLAR;
        System.out.printf("El resultado de la conversion es %f dolares", resultado);
    }
}
