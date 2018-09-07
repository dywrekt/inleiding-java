package h04;

import java.applet.Applet;
import java.awt.*;

//Voorbeeld 4.1//

public class h041 extends Applet{


    public void init() {
    }

    public void paint(Graphics g) {

        int  x1,  y1,  x2,  y2,  x3,  y3;
        // We beginnen met punt (160,120)
        x1 = x2 = x3 = 160;
        y1 = y2 = y3 = 120;
        for (int i=0; i<100; i++)  {
            y1--;  x2--;
            y2++; x3++; y3++;
        }
        g.setColor (Color.black);
        h04 (g,x1,y1,x2,y2,x3,y3);
    }

    void h04 (Graphics g, int x1, int y1,
                   int x2, int y2, int x3, int y3)  {
        g.drawLine (x1, y1, x2, y2);
        g.drawLine (x2, y2, x3, y3);
        g.drawLine (x3, y3, x1, y1);}
}
