public class Stringhe {
    public static void main(String[] args) {
        
        // Dichiarazione e inizializzazione di una stringa
        String nome = "Mario";
        
        // Stampiamo la lunghezza della stringa utilizzando il metodo length()
        System.out.println("La lunghezza della stringa '" + nome + "' è: " + nome.length());
        
        // Concateniamo due stringhe utilizzando l'operatore '+'
        String cognome = "Rossi";
        String nomeCompleto = nome + " " + cognome;
        System.out.println("Il nome completo è: " + nomeCompleto);
        
        // Confrontiamo due stringhe utilizzando il metodo equals()
        String nomeConfronto = "Mario";
        boolean confronto = nome.equals(nomeConfronto);
        System.out.println("Le due stringhe sono uguali? " + confronto);
        
        // Converitiamo una stringa in un array di caratteri utilizzando il metodo toCharArray()
        char[] caratteri = nome.toCharArray();
        System.out.println("La prima lettera del nome è: " + caratteri[0]);
    }
}