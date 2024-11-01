package youtube;

import java.awt.*;

import static java.lang.Thread.sleep;

public class Demo extends Frame {
    public Demo(String name) {
        super(name);
        setSize(800,500);
        setLocation(100,100);
        setBackground(Color.black);
        setVisible(true);
    }

    public void paint(Graphics g){
        g.setColor(Color.white);
        int x = 150;
        int y = 150;
        int w = 150;
        int h = 150;
        int sa = 0;
        int ma = 3;

        while (true) {
            int r1 = (int) (Math.random() * 255);
            int g1 = (int) (Math.random() * 255);
            int b1 = (int) (Math.random() * 255);

            Color c = new Color(r1, g1, b1);
            g.setColor(c);
            g.fillArc(x, y, w, h, sa, ma);
            sa += 12;

            try {
                sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        new Demo("Demo");
    }
}
