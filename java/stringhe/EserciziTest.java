import java.util.ArrayList;

public class EserciziTest {
    private static int numTest = 0;
    private static int numTestPassati = 0;
    private static int numTestGruppo = 0;
    private static int numTestGruppoPassati = 0;

    public static void main(String[] args) {
        iniziaGruppoTest("enfatizza");
        test(Esercizi.enfatizza("Yo"), "YO!");
        test(Esercizi.enfatizza("wow", 4), "WOW!!!!");
        test(Esercizi.enfatizza("wow", 0), "WOW");
        test(Esercizi.enfatizza("wow", -1), "WOW");
        terminaGruppoTest();

        iniziaGruppoTest("alfanumerica");
        test(Esercizi.alfanumerica("aaa999fsd"), true);
        test(Esercizi.alfanumerica("aaa-999f-sd"),  false);
        terminaGruppoTest();

        iniziaGruppoTest("incornicia");
        test(Esercizi.incornicia("ciao"), "########\n# ciao #\n########");
        test(Esercizi.incornicia(""), "###\n# #\n###");
        terminaGruppoTest();

        iniziaGruppoTest("palindroma");
        test(Esercizi.palindroma("oroNero"), false);
        test(Esercizi.palindroma("oroNoro"), true);
        terminaGruppoTest();

        iniziaGruppoTest("accorcia");
        test(Esercizi.accorcia("Ciao tt bn?", 6), "Ciao t");
        test(Esercizi.accorcia("Ciao tt bn?", 20), "Ciao tt bn?");
        terminaGruppoTest();

        iniziaGruppoTest("accorciaConEllissi");
        test(Esercizi.accorciaConEllissi("Ciao tt bn?", 6, "..."), "Cia...");
        test(Esercizi.accorciaConEllissi("Ciao tt bn?", 20, "..."), "Ciao tt bn?");
        test(Esercizi.accorciaConEllissi("Ciao tt bn?", 3, "-"), "Ci-");
        terminaGruppoTest();

        iniziaGruppoTest("conta");
        test(Esercizi.conta("ciao, mi chiamo ciao e sono un saluto, ciaoooo", "ciao"), 3);
        test(Esercizi.conta("ciao, mi chiamo ciao e sono un saluto, ciaoooo", "ia"), 4);
        test(Esercizi.conta("ciao, mi chiamo ciao e sono un saluto, ciaoooo", "xxx"), 0);
        terminaGruppoTest();

        iniziaGruppoTest("contaParole");
        test(Esercizi.conta("ciao, mi chiamo ciao e sono un saluto, ciaoooo", "ciao"), 2);
        test(Esercizi.conta("ciao, mi chiamo ciao e sono un saluto, ciaoooo", "ia"), 0);
        terminaGruppoTest();

        iniziaGruppoTest("trovaTraQuadre");
        test(Esercizi.trovaTraQuadre("uno [due] tre [qua]ttro"), "due");
        test(Esercizi.trovaTraQuadre("ciao mi chiamo xxx"), "");
        terminaGruppoTest();

        iniziaGruppoTest("trovaTutteTraQuadre");
        ArrayList<String> risultatoAtteso = new ArrayList<>();
        risultatoAtteso.add("due");
        risultatoAtteso.add("qua");
        test(Esercizi.trovaTutteTraQuadre("uno [due] tre [qua]ttro"), risultatoAtteso);
        risultatoAtteso.clear();
        test(Esercizi.trovaTutteTraQuadre("ciao mi chiamo xxx"), risultatoAtteso);
        terminaGruppoTest();
     
        System.out.println("RIEPILOGO FINALE");
        if (numTest == numTestPassati)
            System.out.println("Tutti i test sono passati!");
        else
            System.out.println("Passati "+numTestPassati+" test su "+numTest);
        System.out.println();
    }
    
    private static void iniziaGruppoTest(String nomeGruppo) {
        numTestGruppo = 0;
        numTestGruppoPassati = 0;
        System.out.println("TEST " + nomeGruppo);
    }

    private static void test(String risultato, String risultatoAtteso) {
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

    private static void test(boolean risultato, boolean risultatoAtteso) {
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

    private static void test(int risultato, int risultatoAtteso) {
        numTest += 1;
        numTestGruppo += 1;
        if (risultato == risultatoAtteso) {
            numTestPassati += 1;
            numTestGruppoPassati += 1;
        }
        else {
            System.out.println("    ERRORE risulta "+risultato+" ma mi aspettavo "+risultatoAtteso);
        }
    }

    private static void test(ArrayList<String> risultato, ArrayList<String> risultatoAtteso) {
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

    private static String listaToStringa(ArrayList<String> lista) {
        StringBuilder s = new StringBuilder();

        s.append("[ ");
        for (int i = 0; i < lista.size(); i++) {
            s.append(lista.get(i));
            if (i < lista.size() - 1) s.append(", ");
        }
        s.append(" ]");

        return s.toString();
    }

    private static void terminaGruppoTest() {
        if (numTestGruppo == numTestGruppoPassati)
            System.out.println("Tutti i test sono passati!");
        else
            System.out.println("Passati "+numTestGruppoPassati+" test su "+ numTestGruppo);
        System.out.println();
    }
}
