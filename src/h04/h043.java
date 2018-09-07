package h04;

import java.applet.Applet;
import java.awt.*;

public class h043 extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.cyan);
        g.setColor(Color.black);
        /*paal*/
        g.fillRect(2, 2, 6, 300);
        /*blokken*/
        g.setColor(Color.red);
        g.fillRect(8,2, 250, 50);
        g.setColor(Color.white);
        g.fillRect(8,52,250,50);
        g.setColor(Color.blue);
        g.fillRect(8, 102,250,50);

    }
}