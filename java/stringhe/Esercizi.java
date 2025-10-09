import java.util.ArrayList;

public class Esercizi {

    /*
     * Aggiungi un punto esclamativo in fondo ad s e rendila maiuscola
     * 
     * Ad esempio:
     * enfatizza("che bello");
     * ritorna: "CHE BELLO!"
     */
    public static String enfatizza(String s) {
        return "";
    }

    /*
     * Aggiungi n punti esclamativi in fondo ad s e rendila maiuscola
     * 
     * Ad esempio:
     * enfatizza("che bello", 4);
     * ritorna: "CHE BELLO!!!!"
     */
    public static String enfatizza(String s, int n) {
        return "";
    }

    /*
     * Ritorna true se la stringa è composta solo da caratteri alfabetici
     * o numerici, altrimenti ritorna false
     * 
     * Ad esempio:
     * alfanumerica("aaa999fsd");
     * ritorna: true
     * 
     * alfanumerica("aaa-999f-sd");
     * ritorna: false
     */
    public static boolean alfanumerica(String s) {
        return false;
    }

    /*
     * Ritorna la stringa s incorniciata dal carattere #
     * 
     * Ad esempio:
     * incornicia("Ciao tt bn?");
     * ritorna:
     * ###############
     * # Ciao tt bn? #
     * ###############
     */
    public static String incornicia(String s) { //
        return "";
    }

    /*
     * Ritorna true se la stringa e' palindroma, altrimenti ritorna false.
     * Una stringa e' palindroma se e' identica quando viene letta al contrario.
     * 
     * Ad esempio:
     * palindroma("oroNero");
     * ritorna: false
     * 
     * palindroma("oroNoro");
     * ritorna: true
     */
    public static boolean palindroma(String s) {
        return false;
    }

    /*
     * Se s e' piu corta di maxL caratteri ritorna s,
     * altrimenti accorcia la stringa s tagliando la parte
     * finale in modo che sia lunga esattamente maxL caratteri
     * 
     * Ad esempio:
     * accorcia("Ciao tt bn?", 6);
     * ritorna: "Ciao t"
     * 
     * accorcia("Ciao tt bn?", 20);
     * ritorna: "Ciao tt bn?"
     */
    public static String accorcia(String s, int maxL) {
        return "";
    }

    /*
     * Se s e' piu corta di maxL caratteri ritorna s,
     * altrimenti accorcia la stringa s tagliando la parte
     * finale ed aggiungendo in fondo la stringa ellissi.
     * La stringa accorciata deve essere lunga esattamente
     * maxL caratteri, compresa l'ellissi aggiunta in fondo.
     * 
     * Ad esempio:
     * accorciaConEllissi("Ciao tt bn?", 6, "...");
     * ritorna: "Cia..."
     * 
     * accorciaConEllissi("Ciao tt bn?", 20, "...");
     * ritorna: "Ciao tt bn?"
     * 
     * accorciaConEllissi("Ciao tt bn?", 3, "-");
     * ritorna: "Ci-"
     */
    public static String accorciaConEllissi(String s, int maxL, String ellissi) {
        return "";
    }

    /*
     * Conta quante volte la stringa daCercare compare nella stringa s.
     * 
     * Ad esempio:
     * conta("ciao, mi chiamo ciao e sono un saluto, ciaoooo", "ciao");
     * ritorna: 3
     * 
     * conta("ciao, mi chiamo ciao e sono un saluto, ciaoooo", "ia");
     * ritorna: 4
     * 
     * conta("ciao, mi chiamo ciao e sono un saluto, ciaoooo", "xxx");
     * ritorna: 0
     */
    public static int conta(String s, String daCercare) {
        return -1;
    }

    /*
     * Conta quante volte la parola daCercare compare nella stringa s.
     * Una parola e' composta da una sequenza di caratteri alfabetici consecutivi.
     * Tutti i caratteri non alfabetici (come spazi o punteggiatura)
     * separano le parole una dall'altra.
     * 
     * Ad esempio:
     * contaParole("ciao, mi chiamo ciao e sono un saluto, ciaoooo", "ciao");
     * ritorna: 2
     * 
     * contaParole("ciao, mi chiamo ciao e sono un saluto, ciaoooo", "ia");
     * ritorna: 0
     */
    public static int contaParole(String s, String daCercare) {
        return -1;
    }

    /*
     * Trova nella stringa s la prima parte della stringa
     * contenuta tra parentesi tonde e restituiscila.
     * Se non ci sono parentesi quadre restituisci la stringa vuota.
     * 
     * Ad esempio:
     * trovaTraQuadre("questa quella [e anche l'altra] ecc [ecc] ecc");
     * ritorna: "e anche l'altra"
     * 
     * trovaTraQuadre("questa quella ecc ecc");
     * ritorna: ""
     */
    public static String trovaTraQuadre(String s) {
        return "";
    }

    /*
     * Trova nella stringa s tutte le parti contenute tra
     * parentesi tonde e restituiscile.
     * 
     * Ad esempio:
     * trovaTutteTraQuadre("questa quella [e anche l'altra] ecc [ecc] ecc");
     * ritorna: ["e anche l'altra", "ecc"]
     */
    public static ArrayList<String> trovaTutteTraQuadre(String s) {
        ArrayList<String> risultato = new ArrayList<>();

        return risultato;
    }
}
