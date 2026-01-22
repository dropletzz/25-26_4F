public class Pokemon {
    private String nome;
    private int attacco;
    private int difesa;
    private int saluteMassima;
    private int salute;
    private Mossa[] mosse;

    public Pokemon(String nome, int saluteMassima, int attacco, int difesa, Mossa[] mosse) {
        this.nome = nome;
        this.salute = saluteMassima;
        this.saluteMassima = saluteMassima;
        this.attacco = attacco;
        this.difesa = difesa;
        this.mosse = mosse;
    }

    public String getNome() {
        return this.nome;
    }

    public int getAttacco() {
        return this.attacco;
    }

    public int getDifesa() {
        return this.difesa;
    }

    public int getSalute() {
        return this.salute;
    }

    public int getSaluteMassima() {
        return this.saluteMassima;
    }

    public Mossa[] getMosse() {
        return this.mosse;
    }

    public void subisciDanno(int danno) {
        this.salute = this.salute - danno;
    }

    // Di seguito sono definiti dei metodi static che generano istanze di questa classe,
    public static Pokemon charmander() {
        Mossa[] mosse = new Mossa[4];
        mosse[0] = new MossaAzione();
        mosse[1] = new MossaBraciere();
        mosse[2] = new MossaAzione(); // TODO creare nuove mosse e cambiarla
        mosse[3] = new MossaAzione(); // TODO creare nuove mosse e cambiarla

        return new Pokemon(
            "Charmander", 
            20, // saluteMassima
            7,  // attacco
            5,  // difesa
            mosse
        );
    }

    public static Pokemon rattata() {
        Mossa[] mosse = new Mossa[4];
        mosse[0] = new MossaAzione();
        mosse[1] = new MossaAzione(); // TODO creare nuove mosse e cambiarla
        mosse[2] = new MossaAzione(); // TODO creare nuove mosse e cambiarla
        mosse[3] = new MossaAzione(); // TODO creare nuove mosse e cambiarla

        return new Pokemon(
            "Rattata", 
            22, // saluteMassima
            5,  // attacco
            7,  // difesa
            mosse
        );
    }
}
