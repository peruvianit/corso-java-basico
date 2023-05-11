public class OperatoriConfronto {
    public static void main(String[] args) {
        
        int a = 5; // Dichiarazione e inizializzazione della variabile 'a'
        int b = 3; // Dichiarazione e inizializzazione della variabile 'b'
        
        System.out.println("Valore di 'a': " + a);
        System.out.println("Valore di 'b': " + b);
        
        // Utilizzo dell'operatore di uguaglianza (==)
        boolean uguale = a == b;
        System.out.println("La variabile 'a' è uguale alla variabile 'b': " + uguale);
        
        // Utilizzo dell'operatore di disuguaglianza (!=)
        boolean diverso = a != b;
        System.out.println("La variabile 'a' è diversa dalla variabile 'b': " + diverso);
        
        // Utilizzo dell'operatore di maggiore (>)
        boolean maggiore = a > b;
        System.out.println("La variabile 'a' è maggiore della variabile 'b': " + maggiore);
        
        // Utilizzo dell'operatore di maggiore o uguale (>=)
        boolean maggioreOuguale = a >= b;
        System.out.println("La variabile 'a' è maggiore o uguale alla variabile 'b': " + maggioreOuguale);
        
        // Utilizzo dell'operatore di minore (<)
        boolean minore = a < b;
        System.out.println("La variabile 'a' è minore della variabile 'b': " + minore);
        
        // Utilizzo dell'operatore di minore o uguale (<=)
        boolean minoreOuguale = a <= b;
        System.out.println("La variabile 'a' è minore o uguale alla variabile 'b': " + minoreOuguale);
    }
}
