public class Ejercicio4 {
    public static void main(String[] args) {
        String persona1 = "Carlos";
        String persona2 = "Juan";
        String persona3 = "Elias";
        String persona4 = "Rosa";
        int edad1 = 30;
        int edad2 = 47;
        int edad3 = 22;
        int edad4 = 19;
        double promedio = (edad1 + edad2 + edad3 + edad4) / 4.0;
        System.out.printf("Su nombre es %s y su edad es de: %d%n", persona1, edad1);
        System.out.printf("Su nombre es %s y su edad es de: %d%n", persona2, edad2);
        System.out.printf("Su nombre es %s y su edad es de: %d%n", persona3, edad3);
        System.out.printf("Su nombre es %s y su edad es de: %d%n", persona4, edad4);
        System.out.printf("Y el promedio de sus edades es: %f", promedio);
    }
}
