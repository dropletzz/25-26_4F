public class Main {

    public static void main(String[] args) {
        Foo a = new Foo("Alice");
        Foo b = new Foo("Bob");

        a.stampa(); // Sono un Foo e mi chiamo Alice
        b.stampa(); // Sono un Foo e mi chiamo Bob

        a.nome = "Anais";
        b.nomeStatic = "Bar";

        a.stampa(); // Sono un Bar e mi chiamo Anais
        b.stampa(); // Sono un Bar e mi chiamo Bob

        Foo.nomeStatic = "Baz";

        a.stampa(); // Sono un Baz e mi chiamo Anais
        b.stampa(); // Sono un Baz e mi chiamo Bob
    }
}
