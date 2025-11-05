public class Cerchio extends FormaGeometrica {

    private static final float PI = 3.14f;
    private float raggio;
    
    public Cerchio(float raggio) {
        super("cerchio"); // richiama il costruttore della superclasse (FormaGeometrica)
        this.raggio = raggio;
    }

    // @Override indica che stiamo implementando un metodo definito nella superclasse
    @Override
    public float area() {
        return PI * raggio * raggio;
    }

    @Override
    public float perimetro() {
        return 2 * PI * raggio;
    }
}
