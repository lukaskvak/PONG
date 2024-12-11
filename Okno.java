import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Okno {
    private int x_rozmer = 800;
    private int y_rozmer = 800;
    private JFrame frame;
    private JPanel panel;
    private Hrac hrac1;
    private Hrac hrac2;
    private Lopta lopta;
    private Ovladanie ovladanie;
    private Timer casovac;

    public Okno() {
        vytvorOkno();
        spustCasovac();
    }

    private void vytvorOkno() {
        frame = new JFrame("KVAK PONG");
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Vykreslenie hráčov a lopty
                hrac1.nakresliSa(g);  // Nakreslíme prvého hráča
                hrac2.nakresliSa(g);  // Nakreslíme druhého hráča
                lopta.nakresliSa(g);  // Nakreslíme loptu
            }
        };

        // Vytvorenie hráčov a lopty
        hrac1 = new Hrac(270, 550, 100, 20, Color.BLUE);
        hrac2 = new Hrac(270, 50, 100, 20, Color.RED);
        lopta = new Lopta(400, 400, 20, Color.MAGENTA);

        frame.setSize(x_rozmer, y_rozmer);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        panel.setBackground(Color.DARK_GRAY);
        frame.add(panel);
        frame.setResizable(true);
        frame.setVisible(true);

        // Ovládanie hráčov cez klávesy
        ovladanie = new Ovladanie(hrac1, hrac2);
        frame.addKeyListener(ovladanie);
        panel.setFocusable(true);
        panel.requestFocusInWindow();  // Získanie focusu pre panel
    }

    private void spustCasovac() {
        casovac = new Timer(1000 / 60, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lopta.pohyb();
                panel.repaint();  // Prekreslenie panelu
            }
        });
        casovac.start();
    }
}


