public class Ejercicio7 {
    public static void main(String[] args) {
        double numero1 = 10.5;
        double numero2 = 2.5;
        double resultadoReal = numero1 * numero2;
        int numero3 = 2;
        int numero4 = 3;
        int resultadoEntero = numero3 * numero4;
        double sumaProd = resultadoReal + resultadoEntero;

        System.out.printf("El resultado de los productos entre reales y enteros y luego sumarlos es %f", sumaProd);

        //El numero que da es un real debido a que esta la posibilidad de que el producto de 2 reales de un real
        //el resultado de operaciones con reales sigue perteneciendo al conjunto de los reales, en caso de querer guardar un entero
        //se deberia hacer la conversiòn del resultado

    }
}
