import javax.swing.*;
import java.awt.*;

public class EsempioGridLayout {
    private static final Color[] colori = new Color[] {
        new Color(0xFFE491),
        new Color(0xB6EEA2),
    };

    public static void main(String[] args) {
        JFrame frame = new JFrame("Esempio GridLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Griglia: 2 righe, 3 colonne, spazio di 10px tra le celle
        frame.setLayout(new GridLayout(2, 3, 10, 10));

        // Aggiungiamo 6 pannelli
        for (int i = 0; i < 6; i++) {
            // Usa i colori a rotazione
            Color colore = colori[i % colori.length];
            frame.add(new PannelloColorato(colore, "Cella " + (i + 1)));
        }

        frame.setVisible(true);
    }

    // Classe interna per comodità, così il file è autonomo
    static class PannelloColorato extends JPanel {
        public PannelloColorato(Color color, String text) {
            setBackground(color);
            setLayout(new GridBagLayout()); // Per centrare la label
            add(new JLabel(text));
            setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
    }
}