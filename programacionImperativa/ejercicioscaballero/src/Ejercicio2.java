import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        final double DOLAR = 20;
        double aConvertir;
        double resultado;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese los dolares a cambiar");
        aConvertir = input.nextDouble();
        resultado = DOLAR*aConvertir;

        System.out.printf("El resultado de la conversion es %f pesos", resultado);





    }
}
