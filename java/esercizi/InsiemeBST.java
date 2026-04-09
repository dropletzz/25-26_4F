// Un insieme implementato con un albero binario di ricerca (BST)
public class InsiemeBST {

    private class Nodo {
        Integer valore;
        Nodo sx, dx;

        public Nodo(Integer valore) {
            this.valore = valore;
            this.sx = null;
            this.dx = null;
        }
    }

    private Nodo radice = null;

    // inserisce il valore se non e' gia' presente
    // restituisce true se inserito, false se era gia' presente
    public boolean inserisci(Integer valore) {
        return false;
    }

    // rimuove il valore, se presente
    // restituisce true se era presente ed e' stato rimosso, altrimenti false
    public boolean rimuovi(Integer valore) {
        return false;
    }

    // restituisce true se il valore e' presente, altrimenti false
    public boolean contiene(Integer valore) {
        return false;
    }
}