package src.model;

public class DiceGame {
    // ... (existing code)
    
    public void start() {
        ui.showArena();
        ui.showDuelIntro();
        
        // Player 1 roll
        ui.showMessage("\n" + CYAN + "YOUR TURN" + RESET);
        int playerRoll = rollDice();
        
        // Player 2 (enemy) roll 
        ui.showMessage("\n" + RED + "ENEMY'S TURN" + RESET);
        int enemyRoll = rollDice();

        // Battle results
        showBattleResult(playerRoll, enemyRoll);
    }

    private void showBattleResult(int p1, int p2) {
        ui.showMessage("\n" + BOLD + "⚔️ BATTLE RESULTS ⚔️");
        ui.showMessage("YOU: " + p1 + "   vs   ENEMY: " + p2);
        
        if (p1 > p2) {
            ui.showVictory(true);
            sound.playVictorySound(); // Add this to SoundManager
        } else if (p2 > p1) {
            ui.showVictory(false);
            sound.playDefeatSound(); // Add this to SoundManager
        } else {
            ui.showMessage(YELLOW + "⚔️ DRAW! The tension rises..." + RESET);
        }
    }
}
