
/*
 * Leggi e' una classe di utilita' che semplifica la lettura di input da linea di comando.
 * La sua filosofia e' quella di continuare a chiedere input all'utente fino a quando
 * l'input non e' correttamente formattato (ad esempio, se mi aspetto un numero e
 * l'utente inserisce lettere, continuero' a chiedere nuovi input fino a quando viene inserito un numero)
 * 
 * La classe Leggi non e' pensata per essere istanziata, contiene solo
 * metodi ed attributi di tipo static.
 */

import java.io.*;
import java.util.ArrayList;

public class Leggi {
    /*
     * qui sotto definisci un attributo static di tipo BufferedReader che legge
     * dallo standard input tramite un InputStreamReader ed inizializzarlo
     */
    private static final BufferedReader in = new BufferedReader(
        new InputStreamReader(System.in)
    );

    /*
     * 0) stampa in output il messaggio
     * 1) leggi una stringa dall'input
     * 2) restituisci la stringa appena letta
     */
    public static String stringa(String messaggio) {
        System.out.print(messaggio);
        String risultato = "";

        try {
            risultato = in.readLine();
        }
        catch (IOException e) {
            System.out.println("! impossibile leggere dallo standard input");
            // se non posso leggere lo standart input c'e' qualche grosso problema nel computer
            // quindi termino il programma restituendo un codice di errore
            System.exit(1);
        }

        return risultato;
    }

    /*
     * 0) stampa in output il messaggio
     * 1) leggi una stringa dall'input
     * 2) prova a convertire la stringa in un intero (parsing)
     * 3) se la conversione avviene con successo, restituisci il numero intero
     * 4) in caso contrario, stampa un messaggio di errore e ritorna al punto 0
     */
    public static int intero(String messaggio) {
        int risultato = 0;
        boolean errore = false;
        do { 
            try {
                String input = Leggi.stringa(messaggio);
                risultato = Integer.parseInt(input);
                errore = false;
            } catch (NumberFormatException e) {
                System.out.println("! Non hai inserito un intero, riprova");
                errore = true;
            }
        } while (errore);

        return risultato;
    }

    /* Leggi in input un numero intero che deve essere >= min */
    public static int interoMin(String messaggio, int min) {
        int risultato = 0;
        boolean errore = false;
        do { 
            try {
                String input = Leggi.stringa(messaggio);
                risultato = Integer.parseInt(input);
                if (risultato >= min) {
                    errore = false;
                }
                else {
                    errore = true;
                    System.out.println("! Il numero deve essere >= " + min);
                }
            } catch (NumberFormatException e) {
                System.out.println("! Non hai inserito un intero, riprova");
                errore = true;
            }
        } while (errore);

        return risultato;
    }

    /* Leggi in input un numero intero che deve essere <= max */
    public static int interoMax(String messaggio, int max) {
        return 0;
    }

    /* Leggi in input un numero intero che deve essere compreso tra max e min (estremi inclusi) */
    public static int interoTra(String messaggio, int min, int max) {
        return 0;
    }

    /* Leggi in input un numero con la virgola */
    public static double numero(String messaggio) {
        return 0.0;
    }

    /* Leggi in input un numero con la virgola che deve essere >= min */
    public static double numeroMin(String messaggio, double min) {
        return 0.0;
    }

    /* Leggi in input un numero con la virgola che deve essere <= max */
    public static double numeroMax(String messaggio, double max) {
        return 0.0;
    }

    /* Leggi in input un numero con la virgola che deve essere compreso tra max e min (estremi inclusi) */
    public static double numeroTra(String messaggio, double min, double max) {
        return 0.0;
    }

    /*
     * 0) stampa in output il messaggio
     * 1) leggi una stringa dall'input
     * 2) se la stringa letta e' uguale al contenuto della variabile si, restituisci true
     * 3) se la stringa letta e' uguale al contenuto della variabile no, restituisci false
     * 4) in caso contrario, stampa un messaggio di errore e torna al punto 0
     */
    public static boolean siNo(String messaggio, String si, String no) {
        boolean errore = false;
        boolean risultato = false;

        do {
            String input = Leggi.stringa(messaggio);
            if (input.equals(si) || input.equals(no)) {
                risultato = input.equals(si);
                errore = false;
            }
            else {
                errore = true;
                System.out.println("! Inserisci " + si + " oppure " + no);
            }

        } while (errore);

        return risultato;
    }

    /*
     * 0) stampa in output il messaggio
     * 1) stampa in output le opzioni (numerate)
     * 2) chiedi all'utente di scegliere un'opzione, inserendo un numero
     * 3) restituisci l'opzione scelta
     */
    public static String scelta(String messaggio, ArrayList<String> opzioni) {
        return null;
    }
}