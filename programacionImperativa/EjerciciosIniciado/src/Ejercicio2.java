public class Ejercicio2 {
    public static void main(String[] args) {
        int numero1 = 30;
        int numero2 = 34;
        int resultado = numero1 + numero2;
        String paridad;

        paridad = (resultado%2 == 0) ? "Par" : "Impar";

        System.out.printf("El resultado es: %d y su paridad es %s", resultado, paridad);
    }
}
