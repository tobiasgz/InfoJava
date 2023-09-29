import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String amigo;
        int flag = 1;

        do {
            System.out.println("Ingrese el nombre de tu amigo");
            amigo = input.nextLine();
            System.out.printf("El nombre de tu amigo es %s \n", amigo);
            System.out.println("Desea volver a ingresar un nombre?");
            System.out.println("1-Si");
            System.out.println("2-No");
            flag = input.nextInt();
            input.nextLine();
        } while (flag == 1);

    }
}
