public class Array {
    public static void main(String[] args) {
        
        // Dichiarazione e inizializzazione di un array di interi
        int[] numeri = {1, 2, 3, 4, 5};
        
        // Utilizzo del metodo length per ottenere la lunghezza dell'array
        System.out.println("Lunghezza dell'array: " + numeri.length);
        
        // Modifica di un elemento dell'array
        numeri[2] = 10;
        System.out.println("Terzo elemento dell'array: " + numeri[2]);
        
        // Dichiarazione e inizializzazione di un array di stringhe
        String[] nomi = new String[3];
        nomi[0] = "Alessandro";
        nomi[1] = "Luigi";
        nomi[2] = "Mario";
        
        // Utilizzo del ciclo for-each per stampare tutti gli elementi dell'array
        for (String nome : nomi) {
            System.out.println(nome);
        }
    }
}
