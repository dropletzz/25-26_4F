public class Rettangolo extends FormaGeometrica {

    private float base;
    private float altezza;
    
    public Rettangolo(float base, float altezza) {
        super("rettangolo"); // richiama il costruttore della superclasse (FormaGeometrica)
        this.base = base;
        this.altezza = altezza;
    }

    // @Override indica che stiamo implementando un metodo definito nella superclasse
    @Override
    public float area() {
        return base * altezza;
    }

    @Override
    public float perimetro() {
        return 2 * (base + altezza);
    }
}
