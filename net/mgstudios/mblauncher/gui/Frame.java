package net.mgstudios.mblauncher.gui;

import net.mgstudios.mblauncher.gui.menu.*;
import net.mgstudios.mblauncher.gui.menu.List;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    static final MainMenu mainMenu = new MainMenu();
    static final MultiplayerSelect multiplayerSelect = new MultiplayerSelect();
    static final Join join = new Join();
    static final Host host = new Host();
    public static JFrame frame;
    public Frame(){
        super("MBLauncher -Five Nights at Freddy's 3 Doom Mod Launcher");
        frame = this;
        Load(List.MainMenu);
        this.setSize(800,500);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(Frame.class.getClassLoader().getResource("assets/MBLauncher/freddy.png")));
    }
    static void refresh(){
        SwingUtilities.updateComponentTreeUI(frame);
    }
    public static void Load(List e){
        switch (e){
            case MainMenu -> {
                frame.setContentPane(mainMenu);
                refresh();
            }
            case MultiplayerSelect -> {
                frame.setContentPane(multiplayerSelect);
                refresh();
            }
            case Host -> {
                frame.setContentPane(host);
                refresh();
            }
            case Join -> {
                frame.setContentPane(join);
                refresh();
            }
        }
    }
}