import java.time.LocalDateTime;

public class Noleggio {

    private Veicolo veicolo;
    private Utente utente;
    private LocalDateTime inizio;
    private LocalDateTime fine;

    public Noleggio(Veicolo veicolo, Utente utente, LocalDateTime inizio) {
        this.veicolo = veicolo;
        this.utente = utente;
        this.inizio = inizio;
        this.fine = null; 
    }

    public Veicolo getVeicolo() {
        return veicolo;
    }

    public Utente getUtente() {
        return utente;
    }

    public LocalDateTime getInizio() {
        return inizio;
    }

    public LocalDateTime getFine() {
        return fine;
    }

    public boolean inCorso() {
        // TODO: restituisce true se fine e' null, altrimenti false
        return false;
    }

    public void termina() {
        // TODO
        // 1) se il noleggio e' in corso, assegna a fine la data/ora corrente
        // 2) altrimenti non fare nulla
    }

    public void termina(LocalDateTime fine) {
        // TODO
        // 1) se il noleggio e' in corso, assegna a fine la data/ora ricevuta come parametro
        // 2) altrimenti non fare nulla
    }

    public double costoTotale() {
        // TODO
        // 1) se il noleggio e' terminato calcola il costo e restituiscilo
        // 2) altrimenti restituisci 0
        return 0.0;
    }

    @Override
    public String toString() {
        // TODO
        // visualizzare:
        // * email utente, targa veicolo, data/ora di inizio
        // * data/ora di fine e costo totale (solo se il noleggio e' terminato)
        return "";
    }
}
