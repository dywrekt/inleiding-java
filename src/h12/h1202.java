package h12;

import java.applet.Applet;
import java.awt.*;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class h1202 extends Applet {

    public void init() {

        int aantalbuttons = 25;
        AtomicReferenceArray<Button> buttons = new AtomicReferenceArray<>(new Button[aantalbuttons]);

        for (int i = 0; i < aantalbuttons; i++) {
            Button bt = new Button("Knopje " + i);
            buttons.set(i, bt);
            add(bt);
            setSize(1000,1000);

        }


    }
}