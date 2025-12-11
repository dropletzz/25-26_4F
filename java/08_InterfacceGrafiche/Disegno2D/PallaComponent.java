import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

class PallaComponent extends JComponent {
    private static final int FPS = 60; // frames per second
    private final Timer timer;
    private int cx, cy, vx, vy, raggio;
    private Color colore = new Color(0, 255, 0);

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

            // rimbalzo sul bordo sinistro
            if (cx - raggio < 0) {
                vx = -vx;
                cx = raggio;
            }
            // rimbalzo sul bordo destro
            if (cx + raggio > getWidth()) {
                vx = -vx;
                cx = getWidth() - raggio;
            }
            // rimbalzo sul bordo alto
            if (cy - raggio < 0) {
                vy = -vy;
                cy = raggio;
            }
            // rimbalzo sul bordo destro
            if (cy + raggio > getHeight()) {
                vy = -vy;
                cy = getHeight() - raggio;
            }

            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(colore);
        g2.fillOval(cx - raggio, cy - raggio, raggio * 2, raggio * 2);

        // fix per avere una grafica fluida anche su Linux
        Toolkit.getDefaultToolkit().sync();
    }
}
