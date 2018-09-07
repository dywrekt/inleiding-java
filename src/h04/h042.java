package h04;

import java.applet.Applet;
import java.awt.*;

public class h042 extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        /*Dak*/
        g.drawLine(50,150,250,150); /*onder*/
        g.drawLine(50,150,150,1);  /*links*/
        g.drawLine(150,1,250,150); /*Rechts*/
        /*Vierkant*/
        g.drawLine(50, 150, 50, 300);
        g.drawLine(250, 150, 250, 300);
        g.drawLine(50, 300, 250, 300);
        /*Deur*/
        g.drawLine(100, 250, 100, 300);
        g.drawLine(100,250,150,250);
        g.drawLine(150, 250, 150, 300);
        /*raam*/
       g.drawRect(200,250, 30, 30);

    }
    }
