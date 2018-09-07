package h04;

import java.applet.Applet;
import java.awt.*;

public class h047 extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(4,4,100,100);
        g.fillOval(12,12,20,20);
        g.fillOval(12,72,20,20);
        g.fillOval(72,12,20,20);
        g.fillOval(72,72,20,20);
    }
    }

