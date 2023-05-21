
public class CondizionaleSwitch {
    public static void main(String[] args) {
        int scelta = 2;

        switch (scelta) {
            case 1:
                System.out.println("Hai scelto l'opzione 1.");
                break;
            case 2:
                System.out.println("Hai scelto l'opzione 2.");
                break;
            case 3:
                System.out.println("Hai scelto l'opzione 3.");
                break;
            default:
                System.out.println("Scelta non valida.");
                break;
        }

        // Operatori logici
        
        /*
         * l'utilizzo di un booleano diretto come espressione nell'istruzione switch 
         * non è supportato fino a Java 14.
        **/

        /*
        int eta = 25;
        boolean haPatente = true;

        boolean puoGuidare = (eta >= 18) && haPatente;

        switch (puoGuidare) {
            case true:
                System.out.println("Puoi guidare un'auto.");
                break;
            case false:
                System.out.println("Non puoi guidare un'auto.");
                break;
            default:
                System.out.println("Scelta non valida.");
                break;
        }
        */

        /* A partire da Java 14, è stato introdotto l'enhanced switch, che consente l'utilizzo di un booleano 
         *  come espressione nella dichiarazione switch. 
        **/
        /* 
        int eta = 25;
        boolean haPatente = true;

        switch (eta >= 18 && haPatente) {
            case true -> System.out.println("Puoi guidare un'auto.");
            case false -> System.out.println("Non puoi guidare un'auto.");
            default -> System.out.println("Scelta non valida.");
        }
        */
    }
}
