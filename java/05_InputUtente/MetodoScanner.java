import java.util.Scanner;

public class MetodoScanner {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci una stringa: ");
        String inputStringa = tastiera.nextLine();

        System.out.println("Inserisci un intero: ");
        int inputIntero = tastiera.nextInt();

        System.out.println("Inserisci un double: ");
        double inputDouble = tastiera.nextDouble();
    }
}
