import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la longitud del triangulo");
        int tamaño = input.nextInt();
        int contador = 0;
        String imprimir = "*";
        String espacios = "";
        for (int i = 0; i < tamaño; i++){
            espacios = espacios + " ";
        }
        while (contador < tamaño) {
            System.out.println(espacios + imprimir);
            imprimir = imprimir + "**";
            espacios = espacios.substring(0, espacios.length() - 1);
            contador++;
        };

    }
}