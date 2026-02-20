import java.util.*;

public class EsAvanzatiTest extends Test {

    public static void main(String[] args) {
        iniziaGruppo("estraiParole");
            test(EsAvanzati.estraiParole("Ciao, come stai?"), 
                Arrays.asList("Ciao", "come", "stai"));
            test(EsAvanzati.estraiParole("L'albero ha 100 rami!"), 
                Arrays.asList("L", "albero", "ha", "rami"));
            test(EsAvanzati.estraiParole("---solo---parole---"), 
                Arrays.asList("solo", "parole"));
            test(EsAvanzati.estraiParole("12345 67890"), 
                new ArrayList<>());
            test(EsAvanzati.estraiParole(""), 
                new ArrayList<>());
        terminaGruppo();

        iniziaGruppo("contaParole");
            HashMap<String, Integer> atteso1 = new HashMap<>();
            atteso1.put("mela", 2);
            atteso1.put("pera", 1);
            test(EsAvanzati.contaParole(Arrays.asList("mela", "pera", "mela")), atteso1);
            HashMap<String, Integer> atteso2 = new HashMap<>();
            test(EsAvanzati.contaParole(new ArrayList<>()), atteso2);
        terminaGruppo();

        iniziaGruppo("haDuplicati");
            test(EsAvanzati.haDuplicati(new int[]{1, 2, 3, 4, 5}), false);
            test(EsAvanzati.haDuplicati(new int[]{1, 2, 3, 4, 1}), true);
            test(EsAvanzati.haDuplicati(new int[]{}), false);
        terminaGruppo();


        iniziaGruppo("sonoAnagrammi");
            test(EsAvanzati.sonoAnagrammi("calendario", "locandiera"), true);
            test(EsAvanzati.sonoAnagrammi("roma", "amor"), true);
            test(EsAvanzati.sonoAnagrammi("ciao", "miao"), false);
            test(EsAvanzati.sonoAnagrammi("aaab", "abbb"), false);
        terminaGruppo();

        riepilogoFinale();
    }
}
