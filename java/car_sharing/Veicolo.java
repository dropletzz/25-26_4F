public class Veicolo {

    private String targa;
    private String modello;
    private TipoVeicolo tipo;

    public Veicolo(String targa, String modello, TipoVeicolo tipo) {
        this.targa = targa;
        this.modello = modello;
        this.tipo = tipo;
    }

    public String getTarga() {
        return targa;
    }

    public String getModello() {
        return modello;
    }

    public TipoVeicolo getTipo() {
        return tipo;
    }

    public double getTariffaOraria() {
        // TODO
        // restituisci la tariffa oraria di questo veicolo, la tariffa varia in base al tipo di veicolo
        // UTILITARIA: 25 euro
        // SUV: 40 euro
        // FURGONE: 55 euro
        return 0.0;
    }

    @Override
    public String toString() {
        // TODO
        return "";
    }
}
