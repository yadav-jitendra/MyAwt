package youtube;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Thread.sleep;

public class Demo2 extends Frame implements ActionListener {
    public Demo2(String name) {
        super(name);
        setSize(800, 500);
        setLocation(100, 100);

        FlowLayout f = new FlowLayout();
        setLayout(f);

        Button b = new Button("Start Disco");
        add(b);
        b.setBackground(Color.white);
        b.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        while (true) {
            int r1 = (int) (Math.random() * 255);
            int g1 = (int) (Math.random() * 255);
            int b1 = (int) (Math.random() * 255);
            Color c = new Color(r1, g1, b1);
            setBackground(c);

            try {
                sleep(300);
            } catch (InterruptedException er) {
                er.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        new Demo2("Demo2");
    }

}
