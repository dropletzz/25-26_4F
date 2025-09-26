
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

public class Leggi {
    private static final BufferedReader in = new BufferedReader(
        new InputStreamReader(System.in)
    );

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

    /* Leggi in input un numero intero che deve essere compreso tra max e min (estremi inclusi) */
    public static int interoTra(String messaggio, int min, int max) {
        int risultato = 0;
        boolean errore = false;
        do { 
            try {
                String input = Leggi.stringa(messaggio);
                risultato = Integer.parseInt(input);
                if (risultato >= min && risultato <= max) {
                    errore = false;
                }
                else {
                    errore = true;
                    System.out.println("! Il numero deve essere compreso tra " + min + " e " + max);
                }
            } catch (NumberFormatException e) {
                System.out.println("! Non hai inserito un intero, riprova");
                errore = true;
            }
        } while (errore);

        return risultato;
    }
}