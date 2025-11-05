// Classe astratta: una classe astratta non puo' essere istanziata.
// Non posso chiamare il costruttore: new FormaGeometrica()
// Il senso di una classe astratta e' quello di essere estesa con delle
// sottoclassi, che saranno le forme geometriche "concrete".

public abstract class FormaGeometrica {
    private String nome;

    public FormaGeometrica(String nome) {
        this.nome = nome;
    }

    public abstract float area();
    public abstract float perimetro();

    public String toString() {
        return "Sono un " + this.nome
        + " con area = " + this.area()
        + " e perimetro = " + this.perimetro();
    }
}


