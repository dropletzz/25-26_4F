public class Segmento {
    public Punto a;
    public Punto b;

    public Segmento(Punto a, Punto b) {
        this.a = a;
        this.b = b;
    }

    public Segmento(double ax, double ay, double bx, double by) {
        this.a = new Punto(ax, ay);
        this.b = new Punto(bx, by);
    }

    public String toString() {
        return a.toString() + " -> " + b.toString();
    }
}
