package h04;

import java.applet.Applet;
import java.awt.*;

public class h046 extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.fillRect(2,2, 150, 300);
        g.setColor(Color.red);
        g.fillOval(25,20,100, 100);
        g.setColor(Color.green);
        g.fillOval(25, 140, 100,100);
    }
}