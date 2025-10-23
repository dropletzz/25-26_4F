public class Forza4 {

    private enum Cella {
        VUOTA,
        ROSSA,
        BLU
    }

    private enum Giocatore {
        ROSSO,
        BLU
    }

    private static final int NUM_RIGHE = 6;
    private static final int NUM_COLONNE = 7;
    private static final Cella[][] griglia = new Cella[NUM_RIGHE][NUM_COLONNE];

    public static void main(String[] args) {
        inizializzaGriglia(); // DA IMPLEMENTARE

        Giocatore turno = Giocatore.ROSSO;
        Giocatore vincitore = null;

        while (vincitore == null) {
            stampaGriglia(); // DA IMPLEMENTARE

            if (turno.equals(Giocatore.ROSSO)) System.out.println("Turno del rosso");
            else                               System.out.println("Turno del blu");

            int colonna = leggiInteroTra("In che colonna vuoi inserire il gettone? ", 1, NUM_COLONNE);
            inserisciGettone(colonna, turno); // DA IMPLEMENTARE

            // passa il turno all'altro giocatore
            if (turno.equals(Giocatore.ROSSO)) turno = Giocatore.BLU;
            else                               turno = Giocatore.ROSSO;

            // controlliamo se ha vinto qualcuno
            vincitore = controllaVittoria(); // DA IMPLEMENTARE
        }

        if (vincitore.equals(Giocatore.ROSSO)) System.out.println("Ha vinto il rosso!");
        else                                   System.out.println("Ha vinto il blu!");
    }

    private static void inizializzaGriglia() {
        // assegna il valore Cella.VUOTO a tutte le celle della griglia
    }

    private static void stampaGriglia() {
        // stampa la griglia
    }

    private static void inserisciGettone(int colonna, Giocatore g) {
        // modifica la griglia aggiungendo un gettone nella posizione appropriata
    }

    private static Giocatore controllaVittoria() {
        // Questa funzione restituisce:
        // > null se non c'e' un vincitore
        // > Giocatore.ROSSO se ha vinto il rosso
        // > Giocatore.BLU se ha vinto il blu
        return null;
    }


    public static int leggiInteroTra(String messaggio, int min, int max) {
        int risultato = 0;
        boolean errore;
        do { 
            String input = System.console().readLine(messaggio);

            try {
                risultato = Integer.parseInt(input);
                errore = risultato < min || risultato > max;
                if (errore) System.out.println("! Il numero deve essere compreso tra " + min + " e " + max);
            } catch (NumberFormatException e) {
                errore = true;
                System.out.println("! Non hai inserito un numero");
            }

        } while (errore);

        return risultato;
    }
}
