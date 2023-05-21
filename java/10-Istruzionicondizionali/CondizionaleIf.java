

public class CondizionaleIf {
    public static void main(String[] args) {
        int numero = 10;

        if (numero > 0) {
            System.out.println("Il numero è positivo.");
        } else if (numero < 0) {
            System.out.println("Il numero è negativo.");
        } else {
            System.out.println("Il numero è zero.");
        }

        // Operatori logici

        int eta = 25;
        boolean haPatente = true;

        if (eta >= 18 && haPatente) {
            System.out.println("Puoi guidare un'auto.");
        } else {
            System.out.println("Non puoi guidare un'auto.");
        }

        // "if" inline

        numero = 12;
        String risultato = (numero > 0) ? "Il numero è positivo" : "Il numero è non positivo";

        System.out.println(risultato);
    }
}
