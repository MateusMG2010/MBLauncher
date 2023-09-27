package net.mgstudios.mblauncher.gui.menu;

import net.mgstudios.mblauncher.game.GameRunner;
import net.mgstudios.mblauncher.gui.component.LiteButton;
import net.mgstudios.mblauncher.gui.component.LitePanel;
import net.mgstudios.mblauncher.gui.component.Return;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Host extends LitePanel {
    final JSpinner PLAYER_SPINNER = new JSpinner(new SpinnerNumberModel(2, 2, 8, 1));
    final JFormattedTextField PLAYER_SPINNER_EDITOR = ((JSpinner.DefaultEditor) PLAYER_SPINNER.getEditor()).getTextField();
    final JComboBox<String> NIGHTS = new JComboBox<>(new String[]{"Night 1","Night 2","Night 3","Night 4","Night 5","Night 6"});
    final LiteButton HOST = new LiteButton("Host");
    public Host(){
        PLAYER_SPINNER.setBackground(Color.BLACK);
        PLAYER_SPINNER.setForeground(Color.WHITE);
        PLAYER_SPINNER.setBounds(20,225,200,35);

        PLAYER_SPINNER_EDITOR.setBackground(Color.BLACK);
        PLAYER_SPINNER_EDITOR.setForeground(Color.WHITE);
        PLAYER_SPINNER_EDITOR.setFont(new Font(Font.SERIF,Font.PLAIN,23));
        PLAYER_SPINNER_EDITOR.setEditable(false);

        NIGHTS.setBounds(20,275,200,35);
        NIGHTS.setBackground(Color.BLACK);
        NIGHTS.setForeground(Color.WHITE);
        NIGHTS.setFocusable(false);
        NIGHTS.setFont(new Font(Font.SERIF,Font.PLAIN, 22));

        HOST.setBounds(20,325,200,35);
        HOST.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                GameRunner.Host(PLAYER_SPINNER.getValue().toString(), "e1m%s".formatted(NIGHTS.getSelectedIndex()+1));
            }
        });

        this.add(PLAYER_SPINNER);
        this.add(NIGHTS);
        this.add(HOST);
        this.add(new Return(List.MultiplayerSelect));
    }
}