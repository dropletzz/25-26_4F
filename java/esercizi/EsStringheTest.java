import java.util.ArrayList;

public class EsStringheTest extends Test {
    public static void main(String[] args) {
        iniziaGruppo("enfatizza");
            test(EsStringhe.enfatizza("Yo"), "YO!");
            test(EsStringhe.enfatizza("wow", 4), "WOW!!!!");
            test(EsStringhe.enfatizza("wow", 0), "WOW");
            test(EsStringhe.enfatizza("wow", -1), "WOW");
        terminaGruppo();

        iniziaGruppo("alfanumerica");
            test(EsStringhe.alfanumerica("aaa999fsd"), true);
            test(EsStringhe.alfanumerica("aaa-999f-sd"),  false);
        terminaGruppo();

        iniziaGruppo("incornicia");
            test(EsStringhe.incornicia("ciao"), "########\n# ciao #\n########");
            test(EsStringhe.incornicia(""), "###\n# #\n###");
        terminaGruppo();

        iniziaGruppo("palindroma");
            test(EsStringhe.palindroma("oroNero"), false);
            test(EsStringhe.palindroma("oroNoro"), true);
        terminaGruppo();

        iniziaGruppo("accorcia");
            test(EsStringhe.accorcia("Ciao tt bn?", 6), "Ciao t");
            test(EsStringhe.accorcia("Ciao tt bn?", 20), "Ciao tt bn?");
        terminaGruppo();

        iniziaGruppo("accorciaConEllissi");
            test(EsStringhe.accorciaConEllissi("Ciao tt bn?", 6, "..."), "Cia...");
            test(EsStringhe.accorciaConEllissi("Ciao tt bn?", 20, "..."), "Ciao tt bn?");
            test(EsStringhe.accorciaConEllissi("Ciao tt bn?", 3, "-"), "Ci-");
        terminaGruppo();

        iniziaGruppo("conta");
            test(EsStringhe.conta("ciao, mi chiamo ciao e sono un saluto, ciaoooo", "ciao"), 3);
            test(EsStringhe.conta("ciao, mi chiamo ciao e sono un saluto, ciaoooo", "ia"), 4);
            test(EsStringhe.conta("ciao, mi chiamo ciao e sono un saluto, ciaoooo", "xxx"), 0);
        terminaGruppo();

        iniziaGruppo("contaParole");
            test(EsStringhe.contaParola("ciao, mi chiamo ciao e sono un saluto, ciaoooo", "ciao"), 2);
            test(EsStringhe.contaParola("ciao, mi chiamo ciao e sono un saluto, ciaoooo", "ia"), 0);
        terminaGruppo();

        iniziaGruppo("trovaTraQuadre");
            test(EsStringhe.trovaTraQuadre("uno [due] tre [qua]ttro"), "due");
            test(EsStringhe.trovaTraQuadre("ciao mi chiamo xxx"), "");
        terminaGruppo();

        iniziaGruppo("trovaTutteTraQuadre");
            ArrayList<String> risultatoAtteso = new ArrayList<>();
            risultatoAtteso.add("due");
            risultatoAtteso.add("qua");
            test(EsStringhe.trovaTutteTraQuadre("uno [due] tre [qua]ttro"), risultatoAtteso);
            risultatoAtteso.clear();
            test(EsStringhe.trovaTutteTraQuadre("ciao mi chiamo xxx"), risultatoAtteso);
        terminaGruppo();
     
        riepilogoFinale();
    }
}
