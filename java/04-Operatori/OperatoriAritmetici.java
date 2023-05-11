public class OperatoriAritmetici {
    public static void main(String[] args) {
        
        int a = 5; // Dichiarazione e inizializzazione della variabile 'a'
        int b = 3; // Dichiarazione e inizializzazione della variabile 'b'
        
        System.out.println("Valore di 'a': " + a);
        System.out.println("Valore di 'b': " + b);
        
        // Utilizzo dell'operatore di addizione (+)
        int somma = a + b;
        System.out.println("Somma di 'a' e 'b': " + somma);
        
        // Utilizzo dell'operatore di sottrazione (-)
        int differenza = a - b;
        System.out.println("Differenza tra 'a' e 'b': " + differenza);
        
        // Utilizzo dell'operatore di moltiplicazione (*)
        int prodotto = a * b;
        System.out.println("Prodotto di 'a' e 'b': " + prodotto);
        
        // Utilizzo dell'operatore di divisione (/)
        int divisione = a / b;
        System.out.println("Divisione di 'a' per 'b': " + divisione);
        
        // Utilizzo dell'operatore modulo (%)
        int modulo = a % b;
        System.out.println("Resto della divisione di 'a' per 'b': " + modulo);
        
        // Utilizzo dell'operatore di incremento (++)
        a++;
        System.out.println("Valore di 'a' dopo l'incremento: " + a);
        
        // Utilizzo dell'operatore di decremento (--)
        b--;
        System.out.println("Valore di 'b' dopo il decremento: " + b);
    }
}