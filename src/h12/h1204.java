package h12;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h1204 extends Applet {

    double[] getallen = {1, 2, 4, 8, 16, 32, 64, 132, 264, 528, 1056, 2102};
    Button knop;
    TextField tekstvak;
    double input;
    boolean komtvoor = false;
    double getal;
    String uitslag;
    public void init() {
        input = 0;
        tekstvak = new TextField(10);
        knop = new Button("Zit het er in?");
        add(tekstvak);
        knopListener kl = new knopListener();
        knop.addActionListener(kl);
        add(knop);
    }
    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input = Double.parseDouble(tekstvak.getText());
            for (int i = 0; i != getallen.length; i++)
                getal = getallen[i];

            if (getal == input) {
                komtvoor = true;

            }
            repaint();
        }
    }
    public void paint(Graphics g) {
        uitslag = "Staat het getal in de lijst?";
        g.drawString(uitslag, 50, 50);
        if (komtvoor) {
            g.drawString("het staat in de lijst!", 50, 70);
        } else {
            g.drawString("het staat niet in de lijst.", 50, 90);
            setSize(1000,1000);
        }
    }
}