package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h104 extends Applet {

    TextField tekstvak;
    String s, tekst;
    Label label;
    int maand;
    int jaartal;

    public void init() {
        tekstvak = new TextField("", 30);
        tekstvak.addActionListener(new TekstvakListener());
        label = new Label("tik een maand in");
        tekst = "";
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 100, 70);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt(s);
            jaartal = Integer.parseInt(s);
            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0) {
                tekst = "" + jaartal + " is een schrikkeljaar";
            } else {
                tekst = "" + jaartal + " is geen schrikkeljaar";
                switch(maand) {
                    case 1:
                        tekst = "Januari: heeft 31 dagen";
                        break;
                    case 2:
                        tekst = "Februari: heeft 28 dagen";
                        break;
                    case 3:
                        tekst = "Maart: heeft 31 dagen";
                        break;
                    case 4:
                        tekst = "April: heeft 30 dagen";
                        break;
                    case 5:
                        tekst = "Mei: heeft 31 dagen";
                        break;
                    case 6:
                        tekst = "Juni: heeft 30 dagen";
                        break;
                    case 7:
                        tekst = "Juli: heeft 31 dagen";
                        break;
                    case 8:
                        tekst = "Augustus: heeft 31 dagen";
                        break;
                    case 9:
                        tekst =  "September: heeft 30 dagen";
                        break;
                    case 10:
                        tekst = "Oktober: heeft 31 dagen";
                        break;
                    case 11:
                        tekst = "November: heeft 30 dagen";
                        break;
                    case 12:
                        tekst = "December: heeft 31 dagen";
                        break;
                    default:
                        tekst = "geen schrikkeljaar!";
                        break;
                }
                repaint();


            }

            repaint();
        }

    }
}