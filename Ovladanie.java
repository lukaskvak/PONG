import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class Ovladanie implements KeyListener {
    private Hrac hrac1, hrac2;

    public Ovladanie(Hrac hrac1, Hrac hrac2) {
        this.hrac1 = hrac1;
        this.hrac2 = hrac2;
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // Nevyužívame
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            hrac1.setX(hrac1.getX() - 10);
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hrac1.setX(hrac1.getX() + 10);
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            hrac2.setX(hrac2.getX() - 10);
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            hrac2.setX(hrac2.getX() + 10);
        }



    }
    @Override
    public void keyReleased(KeyEvent e) {
        // Nevyužívame
    }
}
