package net.mgstudios.mblauncher.gui.menu;

import net.mgstudios.mblauncher.gui.Frame;
import net.mgstudios.mblauncher.gui.component.LiteButton;
import net.mgstudios.mblauncher.gui.component.LitePanel;
import net.mgstudios.mblauncher.gui.component.Return;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MultiplayerSelect extends LitePanel {
    LiteButton JOIN = new LiteButton("Join");
    LiteButton HOST = new LiteButton("Host");
    public MultiplayerSelect(){
        this.add(JOIN);
        this.add(HOST);
        this.add(new Return(List.MainMenu));
        JOIN.setBounds(20,225,200,35);
        JOIN.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                JOIN.reset();
                Frame.Load(List.Join);
            }
        });
        HOST.setBounds(20,275,200,35);
        HOST.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                HOST.reset();
                Frame.Load(List.Host);
            }
        });
    }
}