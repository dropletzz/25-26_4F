import java.io.*;
import java.util.ArrayList;

public class CatalogoLibri {

    public static void main(String[] args) throws IOException {
        // creo una lista di libri inizialmente vuota
        ArrayList<Libro> catalogo = new ArrayList<>();

        // aggiungo due libri alla lista
        catalogo.add(new Libro(
            "10 piccoli di indiani",
            "Agatha Christie",
            Libro.Genere.GIALLO
        ));
        catalogo.add(new Libro(
            "Ubik",
            "Philip Dick",
            Libro.Genere.FANTASCIENZA
        ));

        int scelta = 0;
        do {
            System.out.println("\n\n******CATALOGO LIBRI******");
            System.out.println("1 => Inserisci un libro");
            System.out.println("2 => Elimina un libro");
            System.out.println("3 => Elimina un libro per nome");
            System.out.println("4 => Stampa i libri in catalogo");
            System.out.println("0 => Esci");

            scelta = Leggi.interoTra("Scegli una opzione: ", 0, 4);

            switch (scelta) {
                case 1: // nuovo libro
                Libro nuovoLibro = leggiLibro();
                catalogo.add(nuovoLibro);
                break;

                case 2: // elimina libro a scelta
                if (catalogo.isEmpty()) {
                    System.out.println("Nessun elemento da eliminare");
                    break;
                }
                stampaElenco(catalogo);
                int indice = Leggi.interoTra("Inserisci l'indice del libro da rimuovere: ", 1, catalogo.size());
                catalogo.remove(indice-1);
                break;

                case 3: // elimina libro per titolo
                String titoloInserito = Leggi.stringa("Inserisci il titolo del libro da rimuovere: ");
                int indiceLibroCercato = -1;
                for (int i = 0; i < catalogo.size(); i++) {
                    Libro lib = catalogo.get(i);
                    if (titoloInserito.equals(lib.getTitolo())) {
                        indiceLibroCercato = i;
                    }
                }
                if (indiceLibroCercato >= 0) {
                    catalogo.remove(indiceLibroCercato);
                    System.out.println("Il libro e' stato rimosso");
                }
                else {
                    System.out.println("Nessun libro trovato con il titolo inserito");
                }
                break;

                case 4: // stampa elenco
                stampaElenco(catalogo);
            }
        } while (scelta != 0);

    }

    public static Libro leggiLibro() {
        String titolo = Leggi.stringa("Inserisci titolo del libro: ");
        String autore = Leggi.stringa("Inserisci autore del libro: ");

        System.out.println("1 = fantascienza");
        System.out.println("2 = giallo");
        System.out.println("3 = commedia");
        System.out.println("4 = sconosciuto");
        int sceltaGenere = Leggi.interoTra("Scegli un genere: ", 1, 4);

        Libro.Genere genere;
        switch (sceltaGenere) {
            case 0: genere = Libro.Genere.FANTASCIENZA; break;
            case 1: genere = Libro.Genere.GIALLO; break;
            case 2: genere = Libro.Genere.COMMEDIA; break;
            default: genere = Libro.Genere.SCONOSCIUTO; break;
        }

        return new Libro(titolo, autore, genere);
    }

    public static void stampaElenco(ArrayList<Libro> catalogo) {
        for (int i = 0; i < catalogo.size(); i++) {
            Libro lib = catalogo.get(i);
            System.out.println((i+1) + ") " + lib.toString());
        }
    }
}