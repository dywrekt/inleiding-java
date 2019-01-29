package h12;

import java.applet.Applet;
import java.awt.*;

public class h12PR extends Applet {

    private TextField nummerField;
    private TextField naamField;
    private String[] namen;
    private String[] nummers;
    private int aantalKlik;


    private final static int AANTAL_INVOER = 10;


    public void init() {
        naamField = new TextField(10);
        add(naamField);
        nummerField = new TextField(10);
        add(nummerField);
        namen = new String[AANTAL_INVOER];
        nummers = new String[AANTAL_INVOER];
        aantalKlik = 0;


        Button button = new Button("Ok");
        add(button);
        button.addActionListener(e -> {
            namen[aantalKlik] = naamField.getText();
            nummers[aantalKlik] = nummerField.getText();
            aantalKlik++;
            if (aantalKlik == AANTAL_INVOER) {
                repaint();
            }

        });
    }


    public void paint(Graphics g) {

        if (aantalKlik != 0) {
            int x1 = 50;
            int x2 = 125;
            int y = 70;
            for (int i = 0; i < AANTAL_INVOER; i++) {
                y += 20;
                g.drawString(namen[i], x1, y);
                g.drawString(nummers[i], x2, y);
            }
            aantalKlik = 0;
        }
    }
}