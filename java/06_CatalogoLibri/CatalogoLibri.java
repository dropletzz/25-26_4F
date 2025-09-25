import java.io.*;
import java.util.ArrayList;

public class CatalogoLibri {

    public static void main(String[] args) throws IOException {

        // creo una lista di libri inizialmente vuota
        ArrayList<Libro> catalogo = new ArrayList<>();
        // aggiungo due libri alla lista
        catalogo.add(new Libro("10 piccoli di indiani", "Agatha Christie"));
        catalogo.add(new Libro("Ubik", "Philip Dick"));

        BufferedReader tastiera = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int scelta = 0;
        do {
            System.out.println("1 => Inserisci un libro");
            System.out.println("2 => Elimina un libro");
            System.out.println("3 => Elimina un libro per nome");
            System.out.println("4 => Stampa i libri in catalogo");
            System.out.println("0 => Esci");
            scelta = Integer.parseInt(tastiera.readLine());

            switch (scelta) {
                case 1: // nuovo libro
                System.out.println("Inserisci titolo del libro");
                String titolo = tastiera.readLine();
                System.out.println("Inserisci autore del libro");
                String autore = tastiera.readLine();

                Libro nuovoLibro = new Libro(titolo, autore);
                catalogo.add(nuovoLibro);
                break;

                case 2: // elimina libro a scelta
                for (int i = 0; i < catalogo.size(); i++) {
                    Libro lib = catalogo.get(i);
                    System.out.println(i + ") " + lib.toString());
                }
                System.out.println("Inserisci l'indice del libro da rimuovere");
                int indice = Integer.parseInt(tastiera.readLine());
                catalogo.remove(indice);
                break;

                case 3: // elimina libro per titolo
                System.out.println("Inserisci il titolo del libro da rimuovere");
                String titoloInserito = tastiera.readLine();
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
                for (int i = 0; i < catalogo.size(); i++) {
                    Libro lib = catalogo.get(i);
                    System.out.println(i + ") " + lib.toString());
                }
                break;
            }
        } while (scelta != 0);

    }
}
