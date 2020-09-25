package myAwt;

import javax.swing.*;

public class SwingEx {
    public static void main(String[] args) {
        JFrame fenster = new JFrame();
        fenster.setTitle("Ein Swing - Fenster ");
        fenster.setLocation(500, 400);
        fenster.setSize(300, 150);
        fenster.setVisible(true);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

