package h04;

import java.applet.Applet;
import java.awt.*;

public class h045 extends Applet {


    public void init() {
    }
    public void paint (Graphics g){
        setBackground(Color.blue);
        g.setColor(Color.black);
        /*Arc*/
        g.setColor(Color.yellow);
g.fillArc(80,80,160,160,0,360);
    }
}
