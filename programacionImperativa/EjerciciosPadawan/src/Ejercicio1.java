public class Ejercicio1
{
    public static void main(final String[] args) {
        final int numero = 3;
        int contador = numero;
        contador *= 21;
        System.out.println(contador);
        //Se utiliza el operador de multiplicacion acumulativa para no usar la asignacion contador = contador * 21
        //la razon de porque 21 es para que al numero actual le sume 20 veces su valor y coincidir con el numero final
    }
}