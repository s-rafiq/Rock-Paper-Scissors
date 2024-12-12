package Game;

public class Game {

    // Method to generate a random choice for rock, paper, or scissors
    public static String randomChoice() {
        int choice = (int) Math.floor(Math.random() * 3);
        if (choice == 0) {
            return "rock";
        } else if (choice == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    // Method to determine the winner of a rock-paper-scissors game
    public static String winner(String player1, String player2) {
        if (player1.equals(player2)) {
            return "It's a tie";
        } else if (player1.equals("rock") && player2.equals("scissors") ||
                player1.equals("paper") && player2.equals("rock") ||
                player1.equals("scissors") && player2.equals("paper")) {
            return "Player 1 wins";
        } else {
            return "Player 2 wins";
        }
    }

    // Method to check the relationship between three integers
    public static String everyWhichWay(int x, int y, int z) {
        if (x + y == z) {
            return "sum";
        } else if (x - y == z) {
            return "difference";
        } else if (x * y == z) {
            return "product";
        } else if (y != 0 && x / y == z) { // Added check to prevent division by zero
            return "fraction";
        } else {
            return null;
        }
    }
}