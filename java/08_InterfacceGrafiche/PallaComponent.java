import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

class PallaComponent extends JComponent {
    private static final int FPS = 60; // frames per second
    private final Timer timer;
    private int cx, cy, vx, vy, raggio;

    public PallaComponent() {
        raggio = 100;
        cx = 300;
        cy = 300;
        vx = 5;
        vy = 2;

        // Il costruttore di Timer accetta due argomenti:
        // 1) t: una quantita' di tempo espressa in millisecondi
        // 2) f: una funzione
        // Il timer esegue la funzione f a ripetizione, ogni t millisecondi.
        int t = 1000/FPS;
        timer = new Timer(t, (ActionEvent e) -> {
            cx = cx + vx;
            cy = cy + vy;

            // rimbalzo sul bordo sinistro/destro
            if (cx - raggio < 0 || cx + raggio > getWidth()) vx = -vx;
            // rimbalzo sul bordo alto/destro
            if (cy - raggio < 0 || cy + raggio > getHeight()) vy = -vy;
            // NOTA: il rimbalzo non e' gestito perfettamente
            // (prova a rimpicciolire la finestra quando la palla e' vicino al bordo)

            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.BLUE);
        g2.fillOval(cx - raggio, cy - raggio, raggio * 2, raggio * 2);

        // fix per avere una grafica fluida anche su Linux
        Toolkit.getDefaultToolkit().sync();
    }
}
