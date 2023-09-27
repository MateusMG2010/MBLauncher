package net.mgstudios.mblauncher.gui.component;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LiteButton extends LiteLabel{
    String TEXT;
    public LiteButton(String TEXT){
        super(TEXT);
        this.TEXT = TEXT;
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                LiteButton.super.setText("> %s".formatted(TEXT));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                LiteButton.super.setText(TEXT);
            }
        });
    }
    public void reset(){
        this.setText(TEXT);
    }
}