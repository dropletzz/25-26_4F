import javax.swing.*;
import java.awt.*;

public class EsempioGridBagLayout  {
    private static final Color[] colori = new Color[] {
        new Color(0xFFCDED),
        new Color(0x57A5EC),
        new Color(0xFFE491),
        new Color(0xB6EEA2),
        new Color(0xD7CDED),
    };

    public static void main(String[] args) {
        JFrame frame = new JFrame("Esempio GridLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        // Affinché i pannelli occupino tutto lo spazio in GridBagLayout, 
        // dobbiamo usare 'fill' e i 'weight' (pesi).
        
        gbc.fill = GridBagConstraints.BOTH; // Riempie sia in larghezza che altezza
        
        // -- Rettangolo A (in alto a sinistra) --
        gbc.gridx = 0; gbc.gridy = 0;
        gbc.weightx = 0.3; // Prende il 30% della larghezza
        gbc.weighty = 1.0; // Prende tutta l'altezza disponibile della riga
        frame.add(new PannelloColorato(colori[0], "30% della larghezza"), gbc);

        // -- Rettangolo B (in alto a destra) --
        gbc.gridx = 1; gbc.gridy = 0;
        gbc.weightx = 0.7; // Prende il 70% della larghezza
        gbc.weighty = 1.0;
        frame.add(new PannelloColorato(colori[1], "70% della larghezza"), gbc);

        // -- Rettangolo C (in basso, largo 2 colonne) --
        gbc.gridx = 0; gbc.gridy = 1;
        gbc.gridwidth = 2; // Occupa 2 colonne
        gbc.weightx = 1.0; 
        gbc.weighty = 0.5; // Altezza inferiore rispetto alla riga sopra
        frame.add(new PannelloColorato(colori[2], "Prende 2 colonne, alto meta' delle celle sopra"), gbc);

        frame.setVisible(true);
    }

    // Classe interna per comodità, così il file è autonomo
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