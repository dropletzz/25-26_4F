import java.util.*;

public class EsIntermediTest extends Test {
    public static void main(String[] args) {
        iniziaGruppo("sommaDiagonale");
            int[][] matrice1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            test(EsIntermedi.sommaDiagonale(matrice1), 15); // 1 + 5 + 9
            int[][] matrice2 = {
                {10, 0},
                {0, 10}
            };
            test(EsIntermedi.sommaDiagonale(matrice2), 20); // 10 + 10
        terminaGruppo();

        iniziaGruppo("inFarfallino");
            test(EsIntermedi.inFarfallino("ciao"), "cifiafaofo");
            test(EsIntermedi.inFarfallino("mela"), "mefelafa");
            test(EsIntermedi.inFarfallino("programmare"), "profografammafarefe");
        terminaGruppo();

        iniziaGruppo("daFarfallino");
            test(EsIntermedi.daFarfallino("cifiafaofo"), "ciao");
            test(EsIntermedi.daFarfallino("mefelafa"), "mela");
            test(EsIntermedi.daFarfallino("profografammafarefe"), "programmare");
        terminaGruppo();

        iniziaGruppo("tutti");
            ArrayList<Integer> lista1 = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
            ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(2, 4, 7, 8));
            // Condizione: il numero è pari? (n % 2 == 0)
            test(EsIntermedi.tutti(lista1, n -> n % 2 == 0), true);
            test(EsIntermedi.tutti(lista2, n -> n % 2 == 0), false);
            // Condizione: il numero è maggiore di 0?
            test(EsIntermedi.tutti(lista1, n -> n > 0), true);
        terminaGruppo();

        iniziaGruppo("almenoUno");
            ArrayList<Integer> lista3 = new ArrayList<>(Arrays.asList(-1, -5, 3, -9));
            ArrayList<Integer> lista4 = new ArrayList<>(Arrays.asList(-1, -5, -7, -9));
            // Condizione: il numero è positivo?
            test(EsIntermedi.almenoUno(lista3, n -> n > 0), true);
            test(EsIntermedi.almenoUno(lista4, n -> n > 0), false);
        terminaGruppo();

        riepilogoFinale();
    }
}
