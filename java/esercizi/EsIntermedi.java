import java.util.*;
import java.util.function.*;

public class EsIntermedi {
    /*
     * Data una matrice quadrata (un array bidimensionale NxN), calcola la somma 
     * dei numeri che si trovano sulla sua diagonale principale (dall'angolo in 
     * alto a sinistra a quello in basso a destra).
     * * Ad esempio, con questa matrice 3x3:
     * [ 1, 2, 3 ]
     * [ 4, 5, 6 ]
     * [ 7, 8, 9 ]
     * I numeri sulla diagonale sono 1, 5 e 9.
     * sommaDiagonale(matrice);
     * ritorna: 15
     */
    public static int sommaDiagonale(int[][] matrice) {
        return 0;
    }

    /*
     * Traduce una stringa in "alfabeto farfallino".
     * Regola: dopo ogni vocale (a, e, i, o, u) devi aggiungere 
     * una 'f' seguita dalla stessa vocale.
     * Puoi assumere per semplicità che il testo sia tutto in minuscolo.
     * * Ad esempio:
     * inFarfallino("ciao");
     * ritorna: "cifiafaofo"
     */
    public static String inFarfallino(String testo) {
        return "";
    }

    /*
     * Traduce una stringa dall'alfabeto farfallino all'italiano normale.
     * Regola: rimuovi la 'f' e la vocale ripetuta che seguono ogni vocale.
     * Puoi assumere che il testo in input sia formattato correttamente in farfallino.
     * * Ad esempio:
     * daFarfallino("mefelafa");
     * ritorna: "mela"
     */
    public static String daFarfallino(String testo) {
        return "";
    }

    /*
     * Verifica se TUTTI gli elementi della lista rispettano la condizione passata.
     * Suggerimento: usa condizione.test(numero) per verificare un singolo elemento.
     * Se l'elemento rispetta la condizione, il metodo test() ritorna true, altrimenti false.
     * * Ad esempio:
     * tuttiRispettano([2, 4, 6], n -> n % 2 == 0);
     * ritorna: true
     */
    public static boolean tutti(ArrayList<Integer> lista, Predicate<Integer> condizione) {
        return false;
    }

    /*
     * Verifica se ALMENO UN elemento della lista rispetta la condizione passata.
     * Appena ne trovi uno che la rispetta, puoi smettere di cercare!
     * * Ad esempio:
     * almenoUnoRispetta([-1, -5, 3, -9], n -> n > 0);
     * ritorna: true (perché c'è il 3)
     */
    public static boolean almenoUno(ArrayList<Integer> lista, Predicate<Integer> condizione) {
        return false;
    }
}
