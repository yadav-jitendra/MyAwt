package youtube;

import java.awt.*;

public class Demo extends Frame {
    String name;

    public Demo(String name) {
        super(name);
        setSize(800,500);
        setLocation(100,100);
        setBackground(Color.black);
        setVisible(true);
    }

    public void paint(Graphics g){
        g.setColor(Color.white);
        int x =150, y =150, w =150, h =150, sa =0, ma=3;

        for(int i=1;;i++){
            int r1 = (int) (Math.random()*255);
            int g1 = (int) (Math.random()*255);
            int b1 = (int) (Math.random()*255);

            Color c = new Color(r1,g1,b1);
            g.setColor(c);
           g.fillArc(x,y,w,h,sa,ma);
           sa +=12;

           try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        new Demo("Demo");
    }
}
