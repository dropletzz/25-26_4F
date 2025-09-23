import java.util.ArrayList;

/*
 * Gli array dinamici (o liste) in Java non hanno un limite
 * al numero di elementi che possono contenere.
 * Come per gli array statici, ogni elemento e' accessibile
 * tramite un indice numerico che parte da 0.
 */

public class ArrayDinamici {
    public static void main(String[] args) {
        // inizializzo un array dinamico (lista)
        ArrayList<Integer> lista = new ArrayList<>();

        // la lunghezza della lista si ottiene col metodo size()
        System.out.println("La lista contiene " + lista.size() + " elementi");

        // riempio l'array con la tabellina del 7
        for (int i = 1; i <= 10; i++) {
            // il metodo add della classe ArrayList aggiunge un elemento
            // in coda all'array
            lista.add(i * 7);
        }

        System.out.println("Dopo averla riempita, la lista contiene " + lista.size() + " elementi");

        // stampo il contenuto dell'array
        for (int i = 0; i < lista.size(); i++) {
            // con lista.get(i) ottengo l'i-esimo elemento della lista
            // e' analogo ad usare le parentesi quadre con gli array statici
            System.out.println("lista[" + i + "] = " + lista.get(i));
        }
    }
}
