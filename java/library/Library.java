import java.lang.Math;

public class Library {
    public static void main(String[] args) {
    // Calcolo del valore assoluto di un numero
    int numero = -5;
    int valoreAssoluto = Math.abs(numero);
    System.out.println("Valore assoluto di " + numero + ": " + valoreAssoluto);

    // Calcolo del valore massimo tra due numeri
    int x = 10;
    int y = 20;
    int valoreMassimo = Math.max(x, y);
    System.out.println("Valore massimo tra " + x + " e " + y + ": " + valoreMassimo);

    // Calcolo di una potenza
    double base = 2.0;
    double esponente = 3.0;
    double potenza = Math.pow(base, esponente);
    System.out.println(base + " elevato alla " + esponente + "a potenza: " + potenza);
  }
}