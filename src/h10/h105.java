package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class h105 extends Applet {
    TextField tekstvak;
    String s, resultaat;
    Button button;
    double cijfer;
    double totaal;
    int AantalInvoer;
    double gemiddelde;


    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstvakListener());
        button = new Button("OK");
        button.addActionListener(new TekstvakListener());
        resultaat = "";
        add(tekstvak);
        add(button);

    }

    public void paint(Graphics g) {
        g.drawString(resultaat, 50, 60);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Double.parseDouble(s);

            if (cijfer <= 5.5) {
                resultaat = "onvoldoende";
            } else if (cijfer >= 5.5) {
                resultaat = "voldoende";
            } else {
                resultaat = "Foutmedling; Null";
            }
            repaint();
        }
    }
}