public class Main {

    public static void main(String[] args) {

        Punto p1 = new Punto(3, 7);
        Punto p2 = new Punto(5, 3);

        Segmento s1 = new Segmento(p1, p2);
        Segmento s2 = new Segmento(3, 2, 5, 6);
        System.out.println(s1);
        System.out.println(s2);
    }

}
