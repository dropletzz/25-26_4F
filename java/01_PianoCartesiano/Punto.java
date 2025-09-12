public class Punto {
    public double x;
    public double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double ampiezza() {
        return Math.sqrt(x*x + y*y);
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
