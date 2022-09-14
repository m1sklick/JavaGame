package Main;

import javax.swing.*;

public class GameWindow extends JFrame {
    public GameWindow(GamePanel gamepanel) {
        JFrame jFrame = new JFrame();

        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(gamepanel);
        jFrame.setVisible(true);
    }
}
