import javax.swing.*;
import java.awt.*;

public class EsempioBorderLayout {
    private static final Color[] colori = new Color[] {
        new Color(0xFFCDED),
        new Color(0x57A5EC),
        new Color(0xFFE491),
        new Color(0xB6EEA2),
        new Color(0xD7CDED),
    };

    public static void main(String[] args) {
        JFrame frame = new JFrame("Esempio BorderLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Il layout di default del JFrame è già BorderLayout, ma lo esplicitiamo
        frame.setLayout(new BorderLayout());

        frame.add(new PannelloColorato(colori[0], "NORD"), BorderLayout.NORTH);
        frame.add(new PannelloColorato(colori[1], "SUD"), BorderLayout.SOUTH);
        frame.add(new PannelloColorato(colori[2], "EST"), BorderLayout.EAST);
        frame.add(new PannelloColorato(colori[3], "OVEST"), BorderLayout.WEST);
        frame.add(new PannelloColorato(colori[4], "CENTRO"), BorderLayout.CENTER);

        frame.setVisible(true);
    }

    static class PannelloColorato extends JPanel {
        public PannelloColorato(Color color, String text) {
            setBackground(color);
            setLayout(new GridBagLayout()); // Per centrare la label
            add(new JLabel(text));
            setPreferredSize(new Dimension(100, 50));
            setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
    }
}