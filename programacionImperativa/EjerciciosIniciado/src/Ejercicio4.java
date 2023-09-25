public class Ejercicio4 {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 20;
        int resultado = numero1 + numero2;
        String divisible;

        divisible = (resultado % numero2 == 0) ? "es divisble" : "no es divisble";

        System.out.printf("La suma da como resultado: %d y como el segundo numero es %d este resultado %s por el segundo numero", resultado, numero2, divisible);

    }
}
