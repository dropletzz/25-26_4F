public class InsiemeBSTTest extends Test {
    public static void main(String[] args) {

        iniziaGruppo("Inserimento e Ricerca (Contiene)");
        InsiemeBST set1 = new InsiemeBST();
        
        // Ricerca in un albero vuoto
        test(set1.contiene(10), false);

        // Inserimento della radice
        test(set1.inserisci(10), true);
        test(set1.contiene(10), true);

        // Inserimento di un duplicato (deve restituire false e non alterare l'albero)
        test(set1.inserisci(10), false);
        test(set1.contiene(10), true);

        // Inserimenti a sinistra e a destra
        test(set1.inserisci(5), true);
        test(set1.inserisci(15), true);
        test(set1.contiene(5), true);
        test(set1.contiene(15), true);
        
        // Ricerca di elementi inesistenti
        test(set1.contiene(99), false);
        test(set1.contiene(1), false);
        terminaGruppo();


        iniziaGruppo("Rimozione - Casi base e Foglie");
        InsiemeBST set2 = new InsiemeBST();
        
        // Rimozione da albero vuoto
        test(set2.rimuovi(10), false);

        set2.inserisci(50);
        set2.inserisci(30);
        set2.inserisci(70);
        set2.inserisci(20);
        set2.inserisci(40);
        
        /* Struttura attuale:
                 50
               /    \
             30      70
            /  \
          20    40 
        */

        // Rimozione di una foglia (20)
        test(set2.rimuovi(20), true);
        test(set2.contiene(20), false);
        test(set2.contiene(30), true); // Il padre deve esistere ancora
        
        // Rimozione di un elemento non presente
        test(set2.rimuovi(99), false);
        terminaGruppo();


        iniziaGruppo("Rimozione - Nodi con un figlio");
        InsiemeBST set3 = new InsiemeBST();
        set3.inserisci(50);
        set3.inserisci(30);
        set3.inserisci(20); // 30 ha solo il figlio sinistro
        set3.inserisci(70);
        set3.inserisci(80); // 70 ha solo il figlio destro
        
        // Rimuovi nodo con solo figlio sinistro (30)
        test(set3.rimuovi(30), true);
        test(set3.contiene(30), false);
        test(set3.contiene(20), true); // 20 deve aver preso il posto di 30
        
        // Rimuovi nodo con solo figlio destro (70)
        test(set3.rimuovi(70), true);
        test(set3.contiene(70), false);
        test(set3.contiene(80), true); // 80 deve aver preso il posto di 70
        terminaGruppo();


        iniziaGruppo("Rimozione - Nodi con due figli e Radice");
        InsiemeBST set4 = new InsiemeBST();
        set4.inserisci(50);
        set4.inserisci(30);
        set4.inserisci(70);
        set4.inserisci(60);
        set4.inserisci(80);
        set4.inserisci(75);
        
        /* Struttura attuale:
                 50
               /    \
             30      70
                    /  \
                  60    80
                       /
                     75
        */

        // Rimuovi nodo con due figli (70)
        // L'algoritmo standard sostituisce 70 con il minimo del sottoalbero destro (75)
        test(set4.rimuovi(70), true);
        test(set4.contiene(70), false);
        test(set4.contiene(60), true);
        test(set4.contiene(80), true);
        test(set4.contiene(75), true); 

        // Rimuovi la radice (che attualmente ha un figlio sinistro, 30, e un figlio destro, 75)
        test(set4.rimuovi(50), true);
        test(set4.contiene(50), false);
        test(set4.contiene(30), true);
        test(set4.contiene(75), true); // La nuova radice (o 60, a seconda di come implementano il rimpiazzo)
        
        terminaGruppo();

        riepilogoFinale();
    }
}