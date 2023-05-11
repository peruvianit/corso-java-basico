public class ClassiWrapper {
    public static void main(String[] args) {
        
        // Dichiarazione di una variabile Integer
        Integer numeroIntero = new Integer(10);
        
        // Dichiarazione di una variabile Double
        Double numeroDecimale = new Double(3.14);
        
        // Dichiarazione di una variabile Boolean
        Boolean condizione = new Boolean(true);
        
        // Dichiarazione di una variabile Character
        Character carattere = new Character('A');
        
        // Stampa a console dei valori delle variabili
        System.out.println("Il valore della variabile 'numeroIntero' è: " + numeroIntero);
        System.out.println("Il valore della variabile 'numeroDecimale' è: " + numeroDecimale);
        System.out.println("Il valore della variabile 'condizione' è: " + condizione);
        System.out.println("Il valore della variabile 'carattere' è: " + carattere);
        
        // Conversione di una stringa in un numero intero
        String numeroStringa = "100";
        int numeroConvertito = Integer.parseInt(numeroStringa);
        System.out.println("Il valore della variabile 'numeroConvertito' è: " + numeroConvertito);
        
        // Conversione di un numero intero in una stringa
        int numero = 200;
        String numeroStringa2 = Integer.toString(numero);
        System.out.println("Il valore della variabile 'numeroStringa2' è: " + numeroStringa2);
    }
}
