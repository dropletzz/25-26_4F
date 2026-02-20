import java.util.*;

public class EsAvanzati {

    /*
     * Estrae da una stringa tutte le "parole".
     * Una parola è definita come una sequenza contigua di soli caratteri alfabetici 
     * (lettere maiuscole o minuscole).
     * Qualsiasi altro carattere (spazi, numeri, punteggiatura) fa da separatore.
     * * Il metodo deve ritornare un ArrayList contenente le parole trovate, 
     * mantenendo l'ordine in cui appaiono nel testo originale.
     */
    public static List<String> estraiParole(String testo) {
        ArrayList<String> parole = new ArrayList<>();
        // TODO
        return parole;
    }

    /*
     * Dato un array di stringhe, conta quante volte ogni singola stringa 
     * compare nell'array e salva il risultato in una HashMap.
     * La chiave della mappa sarà la parola, il valore sarà il conteggio.
     * * Ad esempio:
     * contaOccorrenze(new String[]{"mela", "pera", "mela"});
     * ritorna una mappa con: {"mela"=2, "pera"=1}
     */
    public static HashMap<String, Integer> contaParole(List<String> parole) {
        HashMap<String, Integer> conteggi = new HashMap<>();
        // TODO
        return conteggi;
    }

    /*
     * Ritorna true se l'array di interi contiene almeno un elemento duplicato,
     * altrimenti ritorna false.
     * Suggerimento: un doppio ciclo for funziona, ma se vuoi fare lo sborone
     * prova a cercare come funziona un HashSet in Java!
     * * Ad esempio:
     * haDuplicati(new int[]{1, 2, 3, 2});
     * ritorna: true
     */
    public static boolean haDuplicati(int[] numeri) {
        return false;
    }

    /*
     * Ritorna true se la stringa 'a' è un anagramma della stringa 'b'.
     * Due stringhe sono anagrammi se contengono esattamente gli stessi caratteri,
     * ma possibilmente in ordine diverso.
     * Puoi assumere che le stringhe contengano solo lettere minuscole.
     * * Ad esempio:
     * sonoAnagrammi("calendario", "locandiera");
     * ritorna: true
     */
    public static boolean sonoAnagrammi(String a, String b) {
        return false;
    }
}