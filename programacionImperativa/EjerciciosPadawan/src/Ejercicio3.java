public class Ejercicio3 {
    public static void main(String[] args) {
        char t = '\u0054';
        char o = '\u006F';
        char b = '\u0062';
        char i = '\u00ED';
        char a = '\u0061';
        char s = '\u0073';
        System.out.printf("Mi nombre es: \t %c%c%c%c%c%c", t, o, b, i, a, s);
        //La razon se debe a que las comillas dobles java lo interpreta como si fuese una
        //cadena de caracter, es decir que es algo reservado para la clase String
        //Unicode es un lenguaje el cual permite mostrar texto por pantalla en diferentes entornos
        //por ejemplo juegos, webs o incluso sistemas operativos
    }
}
