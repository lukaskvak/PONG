import java.awt.*;

public class Lopta {
    private int x,y;
    private int priemer = 20;
    private int rychlostX = 5,rychlostY = 5;
    private Color farba;

    public Lopta(int x, int y, int priemer, Color farba) {
        this.x = x;
        this.y = y;
        this.priemer = priemer;
        this.farba = Color.MAGENTA;

    }
    public void nakresliSa(Graphics g) {
        g.setColor(farba);
        g.fillOval(x, y, priemer, priemer);
    }
    public void pohyb() {
        x += rychlostX;
        y += rychlostY;
        //Kontrola kolízie s okrajmi
        if (x <= 0 || x >= 800 - priemer) {
            rychlostX = -rychlostX;
        }
        if (y <= 0 || y >= 800 - priemer) {
            rychlostY = -rychlostY;
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
    public int getPriemer() {
        return priemer;
    }
    public int getRychlostX() {
        return rychlostX;
    }
    public int getRychlostY() {
        return rychlostY;
    }
    public int setRychlostX(int rychlostX) {
        return this.rychlostX = rychlostX;
    }
    public int setRychlostY(int rychlostY) {
        return this.rychlostY = rychlostY;
    }

}
