public class ListaConcatenata {
    private class Nodo {
        public int valore;
        public Nodo successivo;

        public Nodo(int valore) {
            this.valore = valore;
            this.successivo = null;
        }
    }

    private Nodo testa;
    private int lunghezza;
    
    public ListaConcatenata() {
        testa = null;
        lunghezza = 0;
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public void aggiungiInTesta(int valore) {
        // TODO
    }

    public void aggiungiInCoda(int valore) {
        // TODO
    }

    public Integer primo() {
        // TODO se la lista e' vuota restituisci null
        return 0;
    }

    public Integer ultimo() {
        // TODO se la lista e' vuota restituisci null
        return 0;
    }

    public Integer get(int posizione) {
        // TODO se la posizione e' negativa o maggiore della lunghezza restituisci null
        return 0;
    }
}