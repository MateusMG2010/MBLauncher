package net.mgstudios.mblauncher.gui.component;

import javax.swing.*;
import java.awt.*;

public class LiteLabel extends JLabel {
    public LiteLabel(String TEXT){
        super(TEXT);
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setFont(new Font("Consolas",Font.PLAIN, 25));
    }
}