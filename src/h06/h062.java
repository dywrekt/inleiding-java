package h06;

import java.applet.Applet;
import java.awt.*;

public class h062 extends Applet {
    int minute;
    int day;
    int year;
    int uitkomsthour;
    int uitkomstday;
    int uitkomstyear;

    public void init() {
        setSize(1600, 900);
        setBackground(Color.white);
        minute = 60;
        day = 24;
        year = 365;
        uitkomsthour = (minute*minute);
        uitkomstday = (uitkomsthour*day);
        uitkomstyear = (uitkomstday*year);
    }

    public void paint(Graphics g) {
        g.drawString("Seconds in a hour:" + uitkomsthour + " seconds. ",100,100);
        g.drawString("Seconds in a day:" + uitkomstday + " seconds. " , 100 , 120);
        g.drawString("Seconds in a year:" + uitkomstyear + " seconds. ",100,140);

    }
}
