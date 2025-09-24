
import java.io.*;

public class MetodoClassico {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        // stessa cosa fatta in una riga
        // BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Scrivi qualcosa: ");
            String inputUtente = tastiera.readLine();
            System.out.println("Hai scritto: " + inputUtente);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
