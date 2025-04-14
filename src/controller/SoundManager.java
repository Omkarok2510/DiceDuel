package src.controller;

public class SoundManager {
    // ... (existing code)
    
    public void playVictorySound() {
        playSound("assets/victory.wav"); // Add victory sound file
    }

    public void playDefeatSound() {
        playSound("assets/defeat.wav"); // Add defeat sound file
    }

    private void playSound(String path) {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        } catch (Exception e) {
            System.err.println("Could not play sound: " + path);
        }
    }
}
