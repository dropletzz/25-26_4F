public class PassaggioPerValoreORiferimento {

    static class Punto {
        public double x = 0;
        public double y = 0;
    }
    
    public static void main(String[] args) {
        System.out.println("> Passaggio per valore");
        double x = 3.3, y = 2.5;
        perValore(x, y);
        System.out.println("dopo la funzione: x=" + x + " x=" + y);

        System.out.println("\n> Passaggio per riferimento");
        Punto p = new Punto();
        p.x = 3.3;
        p.y = 2.5;
        perRiferimento(p);
        System.out.println("dopo la funzione: p.x=" + p.x + " p.y=" + p.y);
    }

    // I tipi primitivi, quando sono argomento di una
    // funzione, vengono passati per valore.
    // Cioe' viene creata una copia di quel dato che
    // esiste solo all'interno della funzione.
    private static void perValore(double x, double y) {
        x = x*2;
        y = y*2;
        System.out.println("dentro la funzione: x=" + x + " y=" + y);
    }

    // Gli oggetti, quando sono argomento di una
    // funzione, vengono passati per riferimento.
    // Cioe' viene passato un "puntatore" alla zona
    // di memoria occupata da quell'oggetto.
    private static void perRiferimento(Punto p) {
        p.x = p.x*2;
        p.y = p.y*2;
        System.out.println("dentro la funzione: p.x=" + p.x + " p.y=" + p.y);
    }
}
