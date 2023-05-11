public class OperatoriLogici {
    public static void main(String[] args) {
        
        boolean a = true; // Dichiarazione e inizializzazione della variabile booleana 'a'
        boolean b = false; // Dichiarazione e inizializzazione della variabile booleana 'b'
        
        System.out.println("Valore di 'a': " + a);
        System.out.println("Valore di 'b': " + b);
        
        // Utilizzo dell'operatore logico AND (&&)
        boolean and = a && b;
        System.out.println("Il risultato dell'operatore AND su 'a' e 'b' è: " + and);
        
        // Utilizzo dell'operatore logico OR (||)
        boolean or = a || b;
        System.out.println("Il risultato dell'operatore OR su 'a' e 'b' è: " + or);
        
        // Utilizzo dell'operatore logico NOT (!)
        boolean notA = !a;
        boolean notB = !b;
        System.out.println("Il risultato dell'operatore NOT su 'a' è: " + notA);
        System.out.println("Il risultato dell'operatore NOT su 'b' è: " + notB);
    }
}