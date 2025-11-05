
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // FormaGeometrica f1 = new FormaGeometrica(); // errore!
        Cerchio f1 = new Cerchio(10);
        FormaGeometrica f2 = new Rettangolo(4, 5); // ok perche' Rettangolo estende FormaGeometrica

        ArrayList<FormaGeometrica> lista = new ArrayList<>();
        lista.add(f1); // ok perche' Cerchio estende FormaGeometrica
        lista.add(f2);
        lista.add(new Cerchio(7));
        lista.add(new Quadrato(5));

        float areaTotale = 0;
        float perimetroTotale = 0;
        for (FormaGeometrica f : lista) {
            System.out.println(f);
            areaTotale += f.area();
            perimetroTotale += f.perimetro();
        }
        System.out.println("Area totale: " + areaTotale);
        System.out.println("Perimetro totale: " + perimetroTotale);
    }
    
}
