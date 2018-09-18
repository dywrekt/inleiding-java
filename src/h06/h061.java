package h06;

import java.applet.Applet;
import java.awt.*;

public class h061 extends Applet {

    int personen;
    int verdiend;
    int uitkomst;


    public void init() {
        setSize(1600,900);
        setBackground(Color.white);
        personen = 4;
        verdiend = 113;
        uitkomst = verdiend/personen;
    }
    public void paint (Graphics g){
        g.drawString("Jan heeft vandaag €" + uitkomst + "verdiend.", 100,100);
        g.drawString("Ali heeft vandaag €" + uitkomst + "verdiend.",100,120);
        g.drawString("Jeannette heeft vandaag €" + uitkomst + "verdiend.",100, 140);
        g.drawString("Hicham heeft vandaag €" + uitkomst + "verdiend." ,100,160);
    }
}
