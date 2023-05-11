public class MetodiStringhe {
    public static void main(String[] args) {
        
        // Dichiarazione e inizializzazione di una stringa
        String nomeCompleto = "Mario Rossi";
        
        // Utilizzo del metodo toUpperCase()
        String nomeCompletoMaiuscolo = nomeCompleto.toUpperCase();
        System.out.println("Nome completo in maiuscolo: " + nomeCompletoMaiuscolo);
        
        // Utilizzo del metodo toLowerCase()
        String nomeCompletoMinuscolo = nomeCompleto.toLowerCase();
        System.out.println("Nome completo in minuscolo: " + nomeCompletoMinuscolo);
        
        // Utilizzo del metodo indexOf()
        int indice = nomeCompleto.indexOf("Rossi");
        System.out.println("L'indice della parola 'Rossi' è: " + indice);
        
        // Utilizzo del metodo substring()
        String nome = nomeCompleto.substring(0, 5);
        System.out.println("Il nome è: " + nome);
        
        // Utilizzo del metodo split()
        String[] partiNomeCompleto = nomeCompleto.split(" ");
        String nomeUtente = partiNomeCompleto[0].substring(0,1) + partiNomeCompleto[1];
        System.out.println("Nome utente: " + nomeUtente);
    }
}