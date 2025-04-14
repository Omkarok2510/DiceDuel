package src;

import src.controller.SoundManager;
import src.model.DiceGame;
import src.ui.GameConsole;

public class Main {
    public static void main(String[] args) {
        // Initialize components
        SoundManager sound = new SoundManager();
        GameConsole ui = new GameConsole();
        DiceGame game = new DiceGame(ui, sound);

        // Start game
        game.start();
    }
}