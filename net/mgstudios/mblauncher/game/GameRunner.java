package net.mgstudios.mblauncher.game;

import java.io.File;
import java.io.IOException;

import net.mgstudios.mblauncher.gui.error.Error;

public class GameRunner {
    static void runCommand(String COMMAND){
        try {
            Runtime.getRuntime().exec(new String[]{"cmd.exe","/c", COMMAND});
        }catch (IOException e){
            System.out.println("===FATAL-ERROR===");
            System.out.println("Error On Exec Runtime Command!");
        }
    }
    static boolean exists(String PATH) {
        return new File(PATH).exists();
    }
    static boolean checkAll(){
        return exists("Game\\gzdoom.exe") && exists("Game\\Wads\\FD3\\FiveNightsAtFreddys3REMAKE.wad") && exists("Game\\Wads\\FD3\\FNAF3.pk3") && exists("Game\\Wads\\FD3\\zFNAF3_LowPoly.pk3");
    }
    public static void Singleplayer(){
        if(checkAll()){
            runCommand("cd Game && start gzdoom.exe -file Wads\\FD3\\* +map e1m1");
            exit();
        }
        else {
            Error.makeDialog("Some Game Files Not Found!");
        }
    }
    public static void Join(String HOST_IP){
        if(checkAll()){
            runCommand("cd Game && start gzdoom.exe -file Wads\\FD3\\* -join %s -skill 4".formatted(HOST_IP));
            exit();
        }
        else {
            Error.makeDialog("Some Game Files Not Found!");
        }
    }
    public static void Host(String P_NUMBER, String MAP_CODE){
        if(checkAll()){
            runCommand("cd Game && start gzdoom.exe -file Wads\\FD3\\* -host %s +map %s +sv_cheats 1".formatted(P_NUMBER,MAP_CODE));
            exit();
        }
        else {
            Error.makeDialog("Some Game Files Not Found!");
        }
    }
    static void exit(){
        System.exit(0);
    }
}