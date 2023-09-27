package net.mgstudios.mblauncher.sound;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.BufferedInputStream;
import java.io.IOException;

public class Background {
    Clip clip;
    public Background() {
        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new BufferedInputStream(Background.class.getClassLoader().getResourceAsStream("assets/MBLauncher/background.wav"))));
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        }
        catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println("===ERROR===");
            System.out.println("Can't Load Background Music!");
        }
    }
}