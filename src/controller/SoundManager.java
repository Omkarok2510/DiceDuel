package src.controller;

import javax.sound.sampled.*;
import java.io.File;

public class SoundManager {
    public void playDiceSound() {
        try {
            // Use relative path from project root
            File soundFile = new File("assets/dice.wav");
            
            if (!soundFile.exists()) {
                System.err.println("Sound file not found at: " + soundFile.getAbsolutePath());
                return;
            }

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start(); // Play async
            
        } catch (Exception e) {
            System.err.println("Could not play sound: " + e.getMessage());
        }
    }
}