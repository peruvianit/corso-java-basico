public class VariabiliPrimitive {
    public static void main(String[] args) {
        
        // Dichiarazione di una variabile intera
        int numeroInterio = 10;
        
        // Dichiarazione di una variabile decimale
        double numeroDecimale = 3.14;
        
        // Dichiarazione di una variabile booleana
        boolean condizione = true;
        
        // Dichiarazione di una variabile di tipo carattere
        char carattere = 'A';
        
        // Stampa a console dei valori delle variabili
        System.out.println("Il valore della variabile 'numeroInterio' è: " + numeroInterio);
        System.out.println("Il valore della variabile 'numeroDecimale' è: " + numeroDecimale);
        System.out.println("Il valore della variabile 'condizione' è: " + condizione);
        System.out.println("Il valore della variabile 'carattere' è: " + carattere);
        
        // Modifica del valore della variabile intera
        numeroInterio = 20;
        System.out.println("Il nuovo valore della variabile 'numeroInterio' è: " + numeroInterio);
        
        // Dichiarazione di una costante
        final int COSTANTE = 5;
        System.out.println("Il valore della costante 'COSTANTE' è: " + COSTANTE);
        
        // Errore di compilazione: tentativo di modificare il valore di una costante
        // COSTANTE = 10;
    }
}
