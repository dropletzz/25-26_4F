public class Main {

    public static void main(String[] args) {
        Pokemon p1 = Pokemon.charmander();
        Pokemon p2 = Pokemon.rattata();

        System.out.println(p1.getNome() + " contro " + p2.getNome() + ", inizia lo scontro!");
        // TODO far lottare i due pokemon
    }
}
