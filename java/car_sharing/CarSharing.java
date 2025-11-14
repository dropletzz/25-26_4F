import java.util.ArrayList;
import java.util.List;

public class CarSharing {

    private List<Utente> utenti;
    private List<Veicolo> veicoli;
    private List<Noleggio> noleggi;

    public CarSharing() {
        this.utenti = new ArrayList<>();
        this.veicoli = new ArrayList<>();
        this.noleggi = new ArrayList<>();
    }

    public List<Utente> getUtenti() {
        return utenti;
    }

    public List<Veicolo> getVeicoli() {
        return veicoli;
    }

    public List<Noleggio> getNoleggi() {
        return noleggi;
    }

    public List<Noleggio> getNoleggiTerminati() {
        // TODO
        // restituisce tutti i noleggi terminati
        return null;
    }

    public List<Noleggio> getNoleggiInCorso() {
        // TODO
        // restituisce tutti i noleggi in corso
        return null;
    }

    public List<Veicolo> getVeicoliLiberi() {
        // TODO
        // restituisce tutti i veicoli senza un noleggio in corso
        return null;
    }

    public Utente trovaUtente(String email) {
        // TODO restituisce l'utente con la data email
        return null;
    }

    public Veicolo trovaVeicolo(String targa) {
        // TODO restituisce il veicolo con la data targa
        return null;
    }

    public void avviaNoleggio(Utente u, Veicolo v) {
        // TODO
        // crea un nuovo noleggio che inizia dalla data/ora corrente e inseriscilo nella lista
    }

    public boolean terminaNoleggio(Veicolo v) {
        // TODO
        // 1) se c'e' un noleggio in corso per il veicolo, terminalo e restituisci true
        // 2) altrimenti restituisi false
        return false;
    }
}