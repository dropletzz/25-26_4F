public class MossaBraciere extends Mossa {

    public MossaBraciere() {
        super("Braciere");
    }

    @Override
    public void applica(Pokemon attaccante, Pokemon difensore) {
        int danno = (int) (attaccante.getAttacco() * 1.5);
        difensore.subisciDanno(danno);
    }
}
