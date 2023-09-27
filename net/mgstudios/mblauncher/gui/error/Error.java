package net.mgstudios.mblauncher.gui.error;

import net.mgstudios.mblauncher.gui.Frame;
import net.mgstudios.mblauncher.gui.component.LiteLabel;

import javax.swing.*;
import java.awt.*;

public class Error {
    static JDialog dialog;
    public static void makeDialog(String ERROR_TEXT){
        if(canShow()){
            LiteLabel ERROR = new LiteLabel(ERROR_TEXT);
            ERROR.setBounds(0,0,500,250);
            ERROR.setHorizontalAlignment(SwingConstants.CENTER);
            ERROR.setVerticalAlignment(SwingConstants.CENTER);
            ERROR.setForeground(Color.RED);
            dialog = new JDialog(Frame.frame, "FATAL ERROR");
            dialog.setSize(500,250);
            dialog.getContentPane().setBackground(Color.BLACK);
            dialog.add(ERROR);
            dialog.setLocationRelativeTo(null);
            dialog.setResizable(false);
            dialog.setVisible(true);
            System.out.println("===FATAL-ERROR===");
            System.out.println(ERROR_TEXT);
        }
    }
    static boolean canShow(){
        return dialog == null || !dialog.isShowing();
    }
}