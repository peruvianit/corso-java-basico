import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidazioneLetturaDatiTastiera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroInserito = 0;
        boolean valido = false;

        do {
            try {
                System.out.print("Inserisci un numero intero: ");
                numeroInserito = scanner.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Input non valido. Devi inserire un numero intero.");
                scanner.nextLine(); // Consuma l'input non valido
            }
        } while (!valido);

        System.out.println("Hai inserito il numero intero: " + numeroInserito);

        scanner.close();
    }
}
