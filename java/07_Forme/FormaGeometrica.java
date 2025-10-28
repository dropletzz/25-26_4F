// Classe astratta: una classe astratta non puo' essere istanziata.
// Non posso chiamare il costruttore: new FormaGeometrica()
// Il senso di una classe astratta e' quello di essere estesa con delle
// sottoclassi, che saranno le forme geometriche "concrete".
public abstract class FormaGeometrica {

    // Metodo astratto: definisce la "firma" del metodo ma non la sua implementazione.
    // Con "firma" del metodo si intendono: il suo nome, gli argomenti ed il tipo restituito.
    // Le sottoclassi dovranno obbligatoriamente implementare i metodi astratti qui definiti.
    public abstract float area();
    public abstract float perimetro();

}
