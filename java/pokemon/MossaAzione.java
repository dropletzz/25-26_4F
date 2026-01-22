public class MossaAzione extends Mossa {

    public MossaAzione() {
        super("Azione");
    }

    @Override
    public void applica(Pokemon attaccante, Pokemon difensore) {
        int danno = attaccante.getAttacco();
        difensore.subisciDanno(danno);
    }
}
