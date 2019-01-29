package h12;

import java.applet.Applet;
import java.awt.*;
import java.util.Arrays;

public class h1203 extends Applet {


    private TextField[] textFields;

    private final int aantalvelden = 5;



    public void init() {

        textFields = new TextField[aantalvelden];

        for (int i = 0; i < aantalvelden; i++) {
            TextField tf = new TextField(5);
            textFields[i] = tf;
            add(tf);
        }
        Button button = new Button("Ok");
        add(button);


        button.addActionListener(e -> {
            int[] invoer = new int[aantalvelden];
            for (int i = 0; i < aantalvelden; i++) {
                String s = textFields[i].getText();
                int input = Integer.parseInt(s);
                invoer[i] = input;
            }
            Arrays.sort(invoer);

            for (int i = 0; i < aantalvelden; i++) {
                textFields[i].setText(String.valueOf(invoer[i]));
                setSize(1000,1000);
            }
        });


    }
}