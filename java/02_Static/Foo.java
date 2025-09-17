// La keyword "static" puo' essere utilizzata sia
// sugli attributi che sui metodi di una classe
// (anche altrove, ma per ora non ci interessa).

// Un attributo static:
// * e' relativo all'intera classe
// * e' condiviso da tutte le istanze di quella classe

// Un metodo static:
// * e' relativo all'intera classe
// * puo' accedere SOLO agli attributi static della sua classe

public class Foo {
    public static String nomeStatic = "Foo";

    public String nome;
    
    public Foo(String nome) {
        this.nome = nome;
    }

    public void stampa() {
        System.out.println(
            "Sono un " + nomeStatic + " e mi chiamo " + nome
        );
    }

    public static void stampaStatic() {
        // in questo metodo non posso stampare l'attributo
        // nome perche' non e' static
        System.out.println("Sono un" + nomeStatic);
    }
}
