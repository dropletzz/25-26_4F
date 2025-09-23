

/*
 * gli array statici in Java hanno una dimensione fissa e 
 * definita quando viene creato l'array
 */


public class ArrayStatici {
    public static void main(String[] args) {
        // inizializzo un array statico
        int[] a = new int[10];

        // a.length e' la lunghezza dell'array
        System.out.println("Ho inizializzato un array lungo " + a.length);


        // riempio l'array con la tabellina del 7
        for (int i = 0; i < a.length; i++) {
            a[i] = (i+1) * 7;
        }

        // stampo il contenuto dell'array
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
