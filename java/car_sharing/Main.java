import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        
        CarSharing carSharing = new CarSharing();

        int scelta = -1;

        do {
            System.out.println("\n--- MENU CAR SHARING ---");
            System.out.println("1. Mostra elenco utenti");
            System.out.println("2. Mostra elenco veicoli");
            System.out.println("3. Mostra elenco veicoli liberi");
            System.out.println("4. Mostra elenco noleggi terminati");
            System.out.println("5. Mostra elenco noleggi in corso");
            System.out.println("6. Avvia noleggio");
            System.out.println("7. Termina noleggio");
            System.out.println("0. Esci");

            scelta = Leggi.intero("Seleziona un'opzione: ");

            switch (scelta) {
                case 1:
                    // mostrare gli utenti
                    break;
                case 2:
                    // mostrare i veicoli
                    break;
                case 3:
                    // mostrare i veicoli disponibili
                    break;
                case 4:
                    // mostrare i noleggi in corso
                    break;
                case 5:
                    // mostrare i noleggi in corso
                    break;
                case 6:
                    // avviare un noleggio
                    // 1) leggi in input una mail e trova l'utente con quella mail
                    // 2) leggi in input una targa e trova il veicolo con quella targa
                    // 3) se il veicolo e' gia' noleggiato stampa un messaggio di errore
                    // 4) altrimenti avvia il nuovo noleggio
                    break;
                case 7:
                    // terminare un noleggio
                    break;
                case 0:
                    System.out.println("Bye bye!");
                    break;
                default:
                    System.out.println("Scelta non valida.");
                    break;
            }

        } while (scelta != 0);
    }

    public static void inizializza(CarSharing carSharing) {
        Utente u = new Utente("Mario", "Rossi", "mario.rossi@email.com");
        carSharing.getUtenti().add(u);
        carSharing.getUtenti().add(new Utente("Laura", "Bianchi", "laura.bianchi@email.com"));
        carSharing.getUtenti().add(new Utente("Giuseppe", "Verdi", "giuseppe.verdi@email.com"));

        Veicolo v = new Veicolo("AA123BB", "Fiat Panda", TipoVeicolo.UTILITARIA);
        carSharing.getVeicoli().add(v);
        carSharing.getVeicoli().add(new Veicolo("CC456DD", "Jeep Renegade", TipoVeicolo.SUV));
        carSharing.getVeicoli().add(new Veicolo("EE789FF", "Ford Transit", TipoVeicolo.FURGONE));

        // noleggio terminato
        Noleggio n1 = new Noleggio(v, u, LocalDateTime.of(2025, 10, 25, 12, 30));
        n1.termina(LocalDateTime.of(2025, 10, 25, 14, 00));

        //noleggio in corso
        Noleggio n2 = new Noleggio(v, u, LocalDateTime.now());

        carSharing.getNoleggi().add(n1);
        carSharing.getNoleggi().add(n2);
    }
}
