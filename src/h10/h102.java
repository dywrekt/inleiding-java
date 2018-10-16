package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h102 extends Applet {
    int hoogstegetal;
    int kleinstegetal;
    int invoer;
    TextField tekstvak;
    String tekst;


    public void init() {
        setSize(600, 300);
        hoogstegetal = Integer.MIN_VALUE;
        kleinstegetal= Integer.MAX_VALUE;
        tekstvak = new TextField("het hoogste getal verschijnt bovenaan en het kleinste getal onderaan", 70);
        Tekstvaklistener kl = new Tekstvaklistener();
        tekstvak.addActionListener(kl);
        add(tekstvak);
        tekst = "";

    }


    public void paint(Graphics g) {
        if (hoogstegetal > Integer.MIN_VALUE) {
            g.drawString("het hoogste getal is: " + hoogstegetal, 50, 100);
            g.drawString("het kleinste getal is: " + kleinstegetal, 50, 115);
        }
    }

    class Tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            invoer = Integer.parseInt(s);
            if (hoogstegetal < invoer) {
                hoogstegetal = invoer;

            }
            if (kleinstegetal > invoer) {
                kleinstegetal = invoer;
            }
            repaint();
        }
    }

}