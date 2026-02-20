import java.util.*;

public class EsBaseTest extends Test {
    public static void main(String[] args) {
        iniziaGruppo("sommaPari");
            test(EsBase.sommaPari(new int[]{1, 2, 3, 4, 5, 6}), 12);
            test(EsBase.sommaPari(new int[]{1, 3, 5}), 0);
            test(EsBase.sommaPari(new int[]{}), 0);
        terminaGruppo();

        iniziaGruppo("ePrimo");
            test(EsBase.ePrimo(7), true);
            test(EsBase.ePrimo(10), false);
            test(EsBase.ePrimo(1), false);
            test(EsBase.ePrimo(2), true);
        terminaGruppo();

        iniziaGruppo("contaVocali");
            test(EsBase.contaVocali("ciao mondo"), 5);
            test(EsBase.contaVocali("bcd fgh"), 0);
            test(EsBase.contaVocali("Aiuola"), 5); // Attenzione alle maiuscole!
        terminaGruppo();

        iniziaGruppo("filtraPositivi");
            ArrayList<Integer> lista1 = new ArrayList<>(Arrays.asList(-1, 5, 0, -3, 8));
            ArrayList<Integer> atteso1 = new ArrayList<>(Arrays.asList(5, 8));
            test(EsBase.filtraPositivi(lista1), atteso1);
            ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(-1, -2, -3));
            ArrayList<Integer> atteso2 = new ArrayList<>();
            test(EsBase.filtraPositivi(lista2), atteso2);
        terminaGruppo();

        iniziaGruppo("intersezione");
            ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
            ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6));
            ArrayList<Integer> comuni = new ArrayList<>(Arrays.asList(3, 4));
            test(EsBase.intersezione(l1, l2), comuni);
            ArrayList<Integer> l3 = new ArrayList<>(Arrays.asList(1, 2));
            ArrayList<Integer> l4 = new ArrayList<>(Arrays.asList(8, 9));
            test(EsBase.intersezione(l3, l4), new ArrayList<Integer>());
        terminaGruppo();

        riepilogoFinale();
    }
}
