// In Java tutto cio' che non e' un tipo primitivo e' un oggetto.

// Una variabile di tipo oggetto non contiene l'oggetto stesso.
// Contiene un riferimento (un indirizzo di memoria) che "punta"
// alla locazione in memoria dove si trova l'oggetto reale.

// La memoria dove sono allocati gli oggetti si chiama heap.

// Esiste un valore speciale chiamato null che puo' essere
// assegnato alle variabili di tipo oggetto.
// Una variabile con valore null non punta a nessun oggetto.


public class Oggetti {
    
    public static void main(String[] args) {
        // definisco la classe Punto solo per usarla in questo main
        class Punto {
            public double x = 3;
            public double y = 7;
        }

        Punto a = new Punto();
        Punto b = null;

        // quando stampo un oggetto viene visualizzato il suo "puntatore"
        System.out.println(a); // Oggetti$Punto@251a69d7
        System.out.println(b); // null

        // stampo il contenuto di a
        System.out.println("a = (" + a.x + ", " + a.y + ")");

        // dato che b e' null non posso accedere ai suoi attributi o metodi
        // risultato: NullPointerException
        System.out.print("b = (" + b.x + ", " + b.y + ")");
    }
    
    
}
