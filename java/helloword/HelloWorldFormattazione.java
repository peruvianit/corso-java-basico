import java.util.Locale;

public class HelloWorldFormattazione {
    public static void main(String[] args) {

        /*
         * Formattazione String
         */
        System.out.printf("Hello %s!%n", "World");
        // %n -> salto di linea
        System.out.printf("Hello %n%s!%n", "World");
        
        System.out.printf("'%20s' %n", "Hello World!");
        // allineare il testo a sinistra
        System.out.printf("'%-20s' %n", "Hello World!");

        System.out.printf("'%s' %n", "Hello World!");
        System.out.printf("'%S' %n", "Hello World!");

        /*
         * Formattazione Boolean
         */

        System.out.printf("%b%n", null);
        System.out.printf("%B%n", true);
        System.out.printf("%B%n", 3.1);
        System.out.printf("%b%n", "hello world");

        /*
         * Formattazione Char
         */

        System.out.printf("%c%n", 'h');
        System.out.printf("%C%n", 'h');

        /*
         * Formattazione Numerica
         */

         System.out.printf("numero intero: %d%n", 2000);
         System.out.printf(Locale.US, "%,d %n", 10000);
         System.out.printf(Locale.ITALY, "%,d %n", 10000);

        /*
         * Formattazione Numero flotante
         */

         System.out.printf("%f%n", 4.127);
         System.out.printf("'%5.2f'%n", 4.127);
         // notazione scientifica 
         System.out.printf("'%5.2e'%n", 4.127);

        
    }
}