import java.util.*;

public class Test {
    private static int numTest = 0;
    private static int numTestPassati = 0;
    private static int numTestGruppo = 0;
    private static int numTestGruppoPassati = 0;

    protected static void iniziaGruppo(String nomeGruppo) {
        numTestGruppo = 0;
        numTestGruppoPassati = 0;
        System.out.println("TEST " + nomeGruppo);
    }

    protected static void terminaGruppo() {
        if (numTestGruppo == numTestGruppoPassati)
            System.out.println("Tutti i test sono passati!");
        else
            System.out.println("Passati "+numTestGruppoPassati+" test su "+ numTestGruppo);
        System.out.println();
    }

    protected static void test(String risultato, String risultatoAtteso) {
        numTest += 1;
        numTestGruppo += 1;
        if (risultato.equals(risultatoAtteso)) {
            numTestPassati += 1;
            numTestGruppoPassati += 1;
        }
        else {
            System.out.println("    ERRORE risulta '"+risultato+"' ma mi aspettavo '"+risultatoAtteso+"'");
        }
    }

    protected static void test(boolean risultato, boolean risultatoAtteso) {
        numTest += 1;
        numTestGruppo += 1;
        if (risultato == risultatoAtteso) {
            numTestPassati += 1;
            numTestGruppoPassati += 1;
        }
        else {
            System.out.println("    ERRORE risulta '"+risultato+"' ma mi aspettavo '"+risultatoAtteso+"'");
        }
    }

    protected static void test(Integer risultato, Integer risultatoAtteso) {
        numTest += 1;
        numTestGruppo += 1;
        if (risultato.equals(risultatoAtteso)) {
            numTestPassati += 1;
            numTestGruppoPassati += 1;
        }
        else {
            System.out.println("    ERRORE risulta "+risultato+" ma mi aspettavo "+risultatoAtteso);
        }
    }

    protected static <T> void test(List<T> risultato, List<T> risultatoAtteso) {
        numTest += 1;
        numTestGruppo += 1;
        if (risultato.equals(risultatoAtteso)) {
            numTestPassati += 1;
            numTestGruppoPassati += 1;
        }
        else {
            System.out.println("    ERRORE risulta "+listaToStringa(risultato)+" ma mi aspettavo "+listaToStringa(risultatoAtteso));
        }
    }

    protected static <K,V> void test(Map<K,V> risultato, Map<K,V> risultatoAtteso) {
        numTest += 1;
        numTestGruppo += 1;
        if (risultato.equals(risultatoAtteso)) {
            numTestPassati += 1;
            numTestGruppoPassati += 1;
        }
        else {
            System.out.println("    ERRORE risulta "+mappaToStringa(risultato)+" ma mi aspettavo "+mappaToStringa(risultatoAtteso));
        }
    }

    protected static <T> String listaToStringa(List<T> lista) {
        StringBuilder s = new StringBuilder();

        s.append("[ ");
        for (int i = 0; i < lista.size(); i++) {
            s.append(lista.get(i));
            if (i < lista.size() - 1) s.append(", ");
        }
        s.append(" ]");

        return s.toString();
    }

    protected static <K,V> String mappaToStringa(Map<K,V> mappa) {
        StringBuilder s = new StringBuilder();

        s.append("{");
        for (Map.Entry<K,V> e : mappa.entrySet()) {
            s.append(" " + e.getKey() + ": " + e.getValue());
        }
        s.append(" }");

        return s.toString();
    }

    protected static void riepilogoFinale() {
        System.out.println("RIEPILOGO FINALE");
        if (numTest == numTestPassati)
            System.out.println("Tutti i test sono passati!");
        else
            System.out.println("Passati "+numTestPassati+" test su "+numTest);
        System.out.println();
    }
}
