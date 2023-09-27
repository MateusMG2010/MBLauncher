package net.mgstudios.mblauncher.gui.menu;

import net.mgstudios.mblauncher.game.GameRunner;
import net.mgstudios.mblauncher.gui.component.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Join extends LitePanel {
    LiteButton JOIN = new LiteButton("Join");
    JTextField IP_FIELD = new JTextField();
    LiteLabel UNDERLINE = new LiteLabel("______________");
    public Join(){
        IP_FIELD.setOpaque(false);
        IP_FIELD.setBorder(BorderFactory.createEmptyBorder());
        IP_FIELD.setFont(new Font("Consolas",Font.PLAIN, 20));
        IP_FIELD.setForeground(Color.WHITE);
        IP_FIELD.setBounds(20,225,200,25);
        IP_FIELD.setDocument(new Limit(18));
        IP_FIELD.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyChar() == KeyEvent.VK_ENTER){
                    if(!IP_FIELD.getText().isEmpty()){
                        GameRunner.Join(IP_FIELD.getText());
                    }
                }
            }
        });
        UNDERLINE.setBounds(20,227,210,25);
        JOIN.setBounds(20,275,200,35);
        JOIN.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(!IP_FIELD.getText().isEmpty()){
                    GameRunner.Join(IP_FIELD.getText());
                }
            }
        });
        this.add(new Return(List.MultiplayerSelect));
        this.add(IP_FIELD);
        this.add(UNDERLINE);
        this.add(JOIN);
    }
}