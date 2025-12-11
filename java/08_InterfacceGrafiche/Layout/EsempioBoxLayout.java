import javax.swing.*;
import java.awt.*;

public class EsempioBoxLayout {
    private static final Color[] colori = new Color[] {
        new Color(0xFFCDED),
        new Color(0x57A5EC),
        new Color(0xFFE491),
        new Color(0xB6EEA2),
        new Color(0xD7CDED),
    };

    public static void main(String[] args) {
        JFrame frame = new JFrame("Esempio BoxLayout (Verticale)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        // Creiamo un pannello principale che userà il BoxLayout
        JPanel mainPanel = new JPanel();
        // Impostiamo l'asse Y per fare una colonna verticale
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Aggiungiamo i pannelli con un po' di spazio tra loro
        mainPanel.add(new PannelloColorato(colori[0], "Header"));
        mainPanel.add(Box.createVerticalGlue()); // Spazio vuoto che si "aggiusta" da solo
        
        mainPanel.add(new PannelloColorato(colori[1], "Menu 1"));
        mainPanel.add(Box.createVerticalStrut(20)); // Spazio vuoto con dimensione fissa
        mainPanel.add(new PannelloColorato(colori[2], "Menu 2"));
        
        mainPanel.add(Box.createVerticalGlue());

        mainPanel.add(new PannelloColorato(colori[3], "Footer"));

        frame.add(mainPanel);
        frame.setVisible(true);
    }


    static class PannelloColorato extends JPanel {
        public PannelloColorato(Color color, String text) {
            setBackground(color);
            setLayout(new GridBagLayout()); // Per centrare la label
            add(new JLabel(text));
            // BoxLayout rispetta le dimensioni massime e preferite
            setMaximumSize(new Dimension(Integer.MAX_VALUE, 50)); // Largo quanto possibile, alto 50
            setPreferredSize(new Dimension(300, 50));
            setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
    }
}