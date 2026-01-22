public abstract class Mossa {

    private final String nome;

    public Mossa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    // Questo metodo e' astratto, verra' implementato mosse concrete.
    // Questo permette di avere mosse con effetti anche molto diversi tra loro
    // che pero' possono essere applicate chiamando questo metodo, che e' uguale per tutte le mosse.
    public abstract void applica(Pokemon attaccante, Pokemon difensore);
}
