
public class OperatoriAssegnazione {
    public static void main(String[] args) {
        
        int a = 5; // Dichiarazione e inizializzazione della variabile 'a'
        int b = 3; // Dichiarazione e inizializzazione della variabile 'b'
        
        System.out.println("Valore iniziale di 'a': " + a);
        System.out.println("Valore iniziale di 'b': " + b);
        
        // Utilizzo dell'operatore di assegnazione semplice (=)
        a = b;
        System.out.println("Dopo l'operazione 'a = b':");
        System.out.println("Valore di 'a': " + a);
        System.out.println("Valore di 'b': " + b);
        
        // Utilizzo dell'operatore di assegnazione composto (+=)
        a += 2;
        System.out.println("Dopo l'operazione 'a += 2':");
        System.out.println("Valore di 'a': " + a);
        System.out.println("Valore di 'b': " + b);
        
        // Utilizzo dell'operatore di assegnazione composto (-=)
        b -= 1;
        System.out.println("Dopo l'operazione 'b -= 1':");
        System.out.println("Valore di 'a': " + a);
        System.out.println("Valore di 'b': " + b);
        
        // Utilizzo dell'operatore di assegnazione composto (*=)
        a *= b;
        System.out.println("Dopo l'operazione 'a *= b':");
        System.out.println("Valore di 'a': " + a);
        System.out.println("Valore di 'b': " + b);
        
        // Utilizzo dell'operatore di assegnazione composto (/=)
        b /= 2;
        System.out.println("Dopo l'operazione 'b /= 2':");
        System.out.println("Valore di 'a': " + a);
        System.out.println("Valore di 'b': " + b);
        
        // Utilizzo dell'operatore di assegnazione composto (%=)
        a %= 3;
        System.out.println("Dopo l'operazione 'a %= 3':");
        System.out.println("Valore di 'a': " + a);
        System.out.println("Valore di 'b': " + b);
    }
}