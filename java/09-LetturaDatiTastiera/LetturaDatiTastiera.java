import java.util.Scanner;

public class LetturaDatiTastiera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // lettura di una stringa
        System.out.print("Inserisci una stringa: ");
        String inputString = scanner.nextLine();

        // lettura di un intero
        System.out.print("Inserisci un intero: ");
        int inputInt = scanner.nextInt();

        // lettura di un numero decimale
        System.out.print("Inserisci un numero decimale: ");
        double inputDouble = scanner.nextDouble();

        // stampa dei risultati
        System.out.println("La stringa inserita è: " + inputString);
        System.out.println("L'intero inserito è: " + inputInt);
        System.out.println("Il numero decimale inserito è: " + inputDouble);

        scanner.close(); // chiusura dello scanner
    }
}
