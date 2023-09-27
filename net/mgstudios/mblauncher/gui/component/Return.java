package net.mgstudios.mblauncher.gui.component;

import net.mgstudios.mblauncher.gui.Frame;
import net.mgstudios.mblauncher.gui.menu.List;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Return extends LiteButton{
    public Return(List TO_LOAD){
        super("Return");
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Return.super.reset();
                Frame.Load(TO_LOAD);
            }
        });
        this.setFont(new Font("Consolas",Font.PLAIN, 20));
        this.setBounds(20,395,200,35);
    }
}