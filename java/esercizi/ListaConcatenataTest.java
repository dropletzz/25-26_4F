public class ListaConcatenataTest extends Test {

    public static void main(String[] args) {
        
        iniziaGruppo("Creazione, stato iniziale e restituzione null");
        ListaConcatenata lista1 = new ListaConcatenata();
        test(lista1.getLunghezza(), 0);
        
        test(lista1.primo(), null);
        test(lista1.ultimo(), null);
        test(lista1.get(0), null);
        terminaGruppo();

        iniziaGruppo("aggiungiInTesta e lettura base");
        ListaConcatenata lista2 = new ListaConcatenata();
        lista2.aggiungiInTesta(10);
        test(lista2.getLunghezza(), 1);
        
        test(lista2.primo(), 10); 
        test(lista2.ultimo(), 10); 
        
        lista2.aggiungiInTesta(20);
        test(lista2.getLunghezza(), 2);
        test(lista2.primo(), 20);
        test(lista2.ultimo(), 10);
        terminaGruppo();

        iniziaGruppo("aggiungiInCoda e casi nulli intermedi");
        ListaConcatenata lista3 = new ListaConcatenata();
        
        lista3.aggiungiInCoda(50);
        test(lista3.getLunghezza(), 1);
        test(lista3.primo(), 50);
        test(lista3.ultimo(), 50);
        
        lista3.aggiungiInCoda(60);
        lista3.aggiungiInCoda(70);
        test(lista3.getLunghezza(), 3);
        test(lista3.primo(), 50);
        test(lista3.ultimo(), 70);
        terminaGruppo();

        iniziaGruppo("metodo get(posizione) e limiti (out of bounds)");
        ListaConcatenata lista4 = new ListaConcatenata();
        lista4.aggiungiInCoda(100);
        lista4.aggiungiInCoda(200);
        lista4.aggiungiInCoda(300);
        
        // Indici validi
        test(lista4.get(0), 100);
        test(lista4.get(1), 200);
        test(lista4.get(2), 300);
        
        // Indici non validi 
        test(lista4.get(-1), null);
        test(lista4.get(-50), null);
        test(lista4.get(3), null);
        test(lista4.get(10), null);
        
        terminaGruppo();

        riepilogoFinale();
    }
}