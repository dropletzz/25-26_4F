public class TipiPrimitivi {

    public static void main(String[] args) {
        // Tipo byte: numeri interi molto piccoli
        // Occupa 8 bit, intervallo da -128 a 127
        byte numeroByte = 100;
        System.out.println("byte: " + numeroByte);

        // Tipo short: numeri interi corti
        // Occupa 16 bit, intervallo da -32,768 a 32,767
        short numeroShort = 5000;
        System.out.println("short: " + numeroShort);

        // Tipo int: numeri interi (il più comune)
        // Occupa 32 bit, intervallo da -2^31 a 2^31-1
        int numeroInt = 100000;
        System.out.println("int: " + numeroInt);

        // Tipo long: numeri interi molto grandi
        // Occupa 64 bit, richiede il suffisso 'L'
        long numeroLong = 15000000000L;
        System.out.println("long: " + numeroLong);

        // Tipo float: numeri in virgola mobile a precisione singola
        // Occupa 32 bit, richiede il suffisso 'f'
        float numeroFloat = 5.75f;
        System.out.println("float: " + numeroFloat);

        // Tipo double: numeri in virgola mobile a doppia precisione (più comune per i decimali)
        // Occupa 64 bit
        double numeroDouble = 19.99;
        System.out.println("double: " + numeroDouble);

        // Tipo boolean: valore logico vero o falso
        // Potrebbe occupare 1 bit, ma probabilmente ne occupa di piu'
        boolean valoreBoolean = true;
        System.out.println("boolean: " + valoreBoolean);

        // Tipo char: singolo carattere
        // Occupa 16 bit (Unicode), si usano gli apici singoli ''
        char carattere = 'A';
        System.out.println("char: " + carattere);
    }
}