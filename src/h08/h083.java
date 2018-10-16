package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class h083 extends Applet {
    TextField Tekstvak;
    Label label;
    Button Ok;
    double BTW;

    public void init() {
        Tekstvak = new TextField("", 14);
        label = new Label("bereken uw btw");
        Ok = new Button("OK");
        Ok.addActionListener(new KnopListener());
        Tekstvak.addActionListener(new KnopListener());
        add(Tekstvak);
        add(label);
        add(Ok);
    }

    public void paint(Graphics g){
    g.drawString("Bedrag inc. btw is:" + (BTW*1.21),40 , 70);
    }


    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s= Tekstvak.getText();
            BTW= Double.parseDouble(s);
            repaint();

        }
    }
}

