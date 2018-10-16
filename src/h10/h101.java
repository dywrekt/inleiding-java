package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h101 extends Applet {
    int hoogstegetal;
    int invoer;
    TextField tekstvak;
    String tekst;


    public void init() {
        setSize(1000,1000);
        tekstvak = new TextField("type een getal in het vak en het hoogste getal verschijnt", 70);
        Tekstvaklistener kl = new Tekstvaklistener();
        tekstvak.addActionListener(kl);
        add(tekstvak);
        tekst = "";

    }


    public void paint(Graphics g) {
        g.drawString("het hooggste getal is: " + hoogstegetal,50,100);
    }

    class Tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            invoer = Integer.parseInt(s);
            if (hoogstegetal < invoer) {
                hoogstegetal = invoer;
                repaint();

            }
        }
    }

}