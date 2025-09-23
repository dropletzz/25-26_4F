public class LeggiTest {

    public static void main(String[] args) {

        String nome = Leggi.stringa("Inserisci il tuo nome: ");

        int eta = Leggi.interoMin("Quanti anni hai? ", 0);
        System.out.println("Ciao " + nome + ", anni: " + eta);


        if (Leggi.siNo("Sei maggiorenne? ", "SI", "NO")) {
            if (eta < 18) System.out.println("Bugiardo!");
        }
    }
    
}
