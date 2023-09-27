package net.mgstudios.mblauncher.gui.component;

import javax.swing.*;
import java.awt.*;

public class LitePanel extends JLabel {
    LiteLabel TITLE = new LiteLabel("<html><body>Five<br>Nights<br>At<br>Freddy's<br>3</body></html>");
    LiteLabel CREDITS = new LiteLabel("By @MateusMG2010");
    public LitePanel(){
        this.setIcon(new ImageIcon(LitePanel.class.getClassLoader().getResource("assets/MBLauncher/background/background.jpg")));
        this.setLayout(null);
        this.add(TITLE);
        this.add(CREDITS);
        TITLE.setBounds(20,-65,135,320);
        TITLE.setFont(new Font("Consolas",Font.PLAIN, 30));
        CREDITS.setBounds(20,280,200,320);
        CREDITS.setFont(new Font("Consolas",Font.PLAIN, 20));
    }
}