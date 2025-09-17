public class PassaggioPerValoreORiferimento {

    static class Punto {
        public double x = 0;
        public double y = 0;
    }
    
    public static void main(String[] args) {
        double a = 3.3, b = 2.5;
        perValore(a, b);
        System.out.println("Dopo perValore: a=" + a + " b=" + b);

        Punto p = new Punto();
        p.x = 3.3;
        p.y = 2.5;
        perRiferimento(p);
        System.out.println("Dopo perRiferimento: p.x=" + p.x + " p.y=" + p.y);
    }

    // I tipi primitivi, quando sono argomento di una
    // funzione, vengono passati per valore.
    // Cioe' viene creata una copia di quel valore che
    // esiste solo all'interno della funzione.
    static void perValore(double x, double y) {
        x = x*2;
        y = y*2;
        System.out.println("Dentro perValore: x=" + x + " y=" + y);
    }

    // Gli oggetti, quando sono argomento di una
    // funzione, vengono passati per riferimento.
    // Cioe' viene passato un "puntatore" alla zona
    // di memoria occupata da quell'oggetto.
    static void perRiferimento(Punto p) {
        p.x = p.x*2;
        p.y = p.y*2;
        System.out.println("Dentro perRiferimento: x=" + p.x + " y=" + p.y);
    }
}
