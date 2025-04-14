package src.ui;

public class GameConsole implements GameUI {
    // ... (existing code)
    
    public void showArena() {
        System.out.println(PURPLE + BOLD + "====================================");
        System.out.println("        🏟️  DICE DUEL ARENA  🏟️       ");
        System.out.println("====================================" + RESET);
        System.out.println("YOU            vs            ENEMY");
        System.out.println("⚔️                          ⚔️");
        System.out.println();
    }

    public void showDuelIntro() {
        System.out.println(YELLOW + BOLD + "THE DICE WILL DECIDE YOUR FATE!" + RESET);
        System.out.println("Type 'roll' when ready...");
    }

    public void showVictory(boolean isPlayer1Winner) {
        String winner = isPlayer1Winner ? "YOU" : "ENEMY";
        System.out.println(GREEN + BOLD + "╔═══════════════╗");
        System.out.println("│  " + winner + " WIN" + (winner.equals("YOU") ? "! 🏆 " : "S! 💀") + "  │");
        System.out.println("╚═══════════════╝" + RESET);
    }
}
