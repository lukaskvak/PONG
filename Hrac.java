import javax.swing.*;
import java.awt.*;

public class Hrac {
    private int x;
    private int y;
    private int sirka = 60;
    private int vyska = 10;
    private Color farba;
    /**
     * Konštruktor vytvára Paddle s určenou pozíciou a rozmermi.
     *
     * @param x      X-ová pozícia
     * @param y      Y-ová pozícia
     * @param sirka  Šírka paddle
     * @param vyska  Výška paddle
     * @param farba  Farba paddle
     */
    public Hrac(int x,int y ,int sirka,int vyska,Color farba) {
            this.x = x;
            this.y = y;
            this.sirka = sirka;
            this.vyska = vyska;
            this.farba = Color.BLUE;
    }
    /**
     * Metóda na vykreslenie hráča.
     *
     * @param g Grafický kontext
     */
    public void nakresliSa(Graphics g) {
        g.setColor(farba);
        g.fillRect(x, y, sirka, vyska);
    }
    public void pohyb(int smer) {
        x += smer;
        // Kontrola kolízie s okrajmi
        if (x <= 0) {
            x = 0;
        }
        if (x >= 800 - sirka) {
            x = 800 - sirka;
        }
    }

    public int getX() {
        return x;
    }
    public int setX(int x) {
        return this.x = x;
    }

    public int getY() {
        return y;
    }
    public int setY(int y) {
        return this.y = y;
    }
    public int getSirka() {
        return sirka;
    }

    public int getVyska() {
        return vyska;
    }

    public Color getFarba() {
        return farba;
    }
    public void nastavFarbu(Color novaFarba) {
        this.farba = novaFarba;
    }

}
