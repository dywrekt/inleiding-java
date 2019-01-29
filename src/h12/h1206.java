package h12;

import java.applet.Applet;
import java.awt.*;

public class h1206 extends Applet {

    private TextField textField;
    private int[] getallen = {5, 6, 5, 7, 8, 9, 3, 10, 22, 11, 33, 44};
    private int input;
    private int aantal;
    private boolean geklikt;


    public void init() {
        textField = new TextField(6);
        add(textField);
        Button button = new Button("Ok");
        button.addActionListener(e -> {
            aantal = 0;
            geklikt = true;
            input = Integer.parseInt(textField.getText());


            for (int getal : getallen) {
                if (getal == input) {
                    aantal++;
                }
            }
            repaint();

        });
        add(button);

    }

    public void paint(Graphics g) {
        if (geklikt) {
            g.drawString("Waarde " + input + " komt " + aantal + " voor", 20, 80);
        }

    }
}