package src.ui;

import java.util.Scanner;

public class GameConsole {
    private final Scanner scanner = new Scanner(System.in);

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void waitForInput() {
        scanner.nextLine(); // Wait for Enter key
    }

    public void showResult(int player1, int player2) {
        System.out.println("\n=== RESULTS ===");
        System.out.println("Player 1: " + player1);
        System.out.println("Player 2: " + player2);

        if (player1 > player2) {
            System.out.println("Player 1 wins!");
        } else if (player2 > player1) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}