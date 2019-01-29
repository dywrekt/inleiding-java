package h12;


import java.awt.*;
import java.applet.*;
import java.util.*;

public class h121 extends Applet {




    double[] salaris = {10, 12, 15, 30, 60,120,240,480,960,1920};
    double[] kopie;
    double totaal;
    public void init() {

        totaal = 10 + 12 + 15 + 30 + 60 + 120 + 240 + 480 + 960 + 1920;
        salaris = new double[5];
        kopie = new double[5];

        for (int teller = 0; teller < salaris.length; teller ++) {
            salaris[teller] = 100 * teller + 100;
        }
        kopie = salaris;
        kopie[3] = 1000;  //salaris[3] wordt nu ook gewijzigd!
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller ++) {
            g.drawString("het gemiddelde is" + (totaal / salaris.length), 60, 20 );
            setSize(1000,1000);

        }
    }
}