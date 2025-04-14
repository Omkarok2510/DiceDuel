package src.model;

import src.controller.SoundManager;
import src.ui.GameConsole;
import java.util.Random;

public class DiceGame {
    private final GameConsole ui;
    private final SoundManager sound;
    private final Random random = new Random();

    public DiceGame(GameConsole ui, SoundManager sound) {
        this.ui = ui;
        this.sound = sound;
    }

    public void start() {
        ui.showMessage("=== DICE DUEL ===");
        
        // Player 1 roll
        ui.showMessage("\nPlayer 1's turn (Press Enter)");
        ui.waitForInput();
        int roll1 = rollDice();
        
        // Player 2 roll
        ui.showMessage("\nPlayer 2's turn (Press Enter)");
        ui.waitForInput();
        int roll2 = rollDice();

        // Determine winner
        ui.showResult(roll1, roll2);
    }

    private int rollDice() {
        sound.playDiceSound();  // Play sound effect
        int value = random.nextInt(6) + 1;
        ui.showMessage("Rolled: " + value);
        return value;
    }
}