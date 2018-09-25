package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class h082 extends Applet{
    Button man;
    Button vrouw;
    Button man2;
    Button vrouw2;
    int teller;
    int teller1;
    int teller2;
    int teller3;
    int totaal;

    public void init() {
        setSize(500,500);
        KnopListener kl = new KnopListener();

        man = new Button("M");
        man.addActionListener(kl);
        vrouw = new Button("V");
        vrouw.addActionListener(new Vrouw());
        man2 = new Button("M2");
        man2.addActionListener(new Man2());
        vrouw2 = new Button("V2");
        vrouw2.addActionListener(new Vrouw2());
        teller = 0;
        teller1 = 0;
        teller2 = 0;
        teller3 = 0;
        add(man);
        add(vrouw);
        add(man2);
        add(vrouw2);


    }


    public void paint(Graphics g) {
        g.drawString("aantal Vaders" + teller, 20, 50);
        g.drawString("aantal Moeders" + teller1, 20, 65);
        g.drawString("aantal mannelijke potentiële studenten" + teller2, 20, 80);
        g.drawString("aantal vrouwelijke potentiële stundenten" + teller3, 20, 95);
        g.drawString("Totaal" + totaal , 20, 110);
        totaal= teller + teller1 + teller2 + teller3;

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller++;
            totaal++;
            repaint();

        }
    }

    class Vrouw implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller1++;
            totaal++;
            repaint();
        }
    }

    class Man2 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            teller2++;
            totaal++;
            repaint();
        }
    }

    class Vrouw2 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            teller3++;
            totaal++;
            repaint();

        }
    }


}