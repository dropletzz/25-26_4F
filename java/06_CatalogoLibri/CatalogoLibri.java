import java.util.ArrayList;

public class CatalogoLibri {

    public static void main(String[] args) {

        // creo una lista di libri inizialmente vuota
        ArrayList<Libro> catalogo = new ArrayList<>();

        Libro l1 = new Libro("10 piccoli di indiani", "Agatha Christie");
        // aggiungo il libro in fondo alla lista
        catalogo.add(l1);

        Libro l2 = new Libro("Ubik", "Philip Dick");
        catalogo.add(l2);

        for (int i = 0; i < catalogo.size(); i++) {
            // estraggo dalla lista il libro alla posizione i
            // (equivalente a catalogo[i] negli array statici)
            Libro lib = catalogo.get(i);
            System.out.println(lib.toString());
        }
    }
}
