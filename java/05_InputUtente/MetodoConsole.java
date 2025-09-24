
public class MetodoConsole {
    public static void main(String[] args) {
        // leggo una stringa
        String nomeUtente = System.console().readLine("Inserisci nome utente: ");

        // leggo una password (l'utente non vede cosa sta digitando)
        char[] password = System.console().readPassword("Inserisci password: ");
    }
}
