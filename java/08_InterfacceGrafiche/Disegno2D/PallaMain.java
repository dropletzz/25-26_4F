import java.awt.Dimension;
import javax.swing.JFrame;

// creo una finestra (JFrame) e ci inserisco un contenuto (la classe PallaComponent)
public class PallaMain extends JFrame {
    public static int LARGHEZZA = 640;
    public static int ALTEZZA = 640;

    public PallaMain() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(LARGHEZZA, ALTEZZA));
        add(new PallaComponent());
        pack();
    }

    public static void main(String[] args) {
        PallaMain f = new PallaMain();
        f.setVisible(true);
    }
}
