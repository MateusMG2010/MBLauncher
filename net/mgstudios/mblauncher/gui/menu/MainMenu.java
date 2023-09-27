package net.mgstudios.mblauncher.gui.menu;

import net.mgstudios.mblauncher.game.GameRunner;
import net.mgstudios.mblauncher.gui.Frame;
import net.mgstudios.mblauncher.gui.component.LiteButton;
import net.mgstudios.mblauncher.gui.component.LitePanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainMenu extends LitePanel {
    LiteButton SINGLEPLAYER = new LiteButton("Singleplayer");
    LiteButton MULTIPLAYER = new LiteButton("Multiplayer");
    public MainMenu(){
        SINGLEPLAYER.setBounds(20,225,200,35);
        SINGLEPLAYER.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                SINGLEPLAYER.reset();
                GameRunner.Singleplayer();
            }
        });
        MULTIPLAYER.setBounds(20,275,200,35);
        MULTIPLAYER.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                MULTIPLAYER.reset();
                Frame.Load(List.MultiplayerSelect);
            }
        });
        this.add(SINGLEPLAYER);
        this.add(MULTIPLAYER);
    }
}