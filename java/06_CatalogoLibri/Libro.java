public class Libro {
    public enum Genere {
        FANTASCIENZA,
        GIALLO,
        COMMEDIA,
        SCONOSCIUTO
    }

    private String titolo;
    private String autore;
    private Genere genere;

    public Libro(String titolo, String autore, Genere genere) {
        this.titolo = titolo;
        this.autore = autore;
        this.genere = genere;
    }

    public String getTitolo() {
        return titolo;
    }

    @Override
    public String toString() {
        return  titolo + " di " + autore;
    }
}
