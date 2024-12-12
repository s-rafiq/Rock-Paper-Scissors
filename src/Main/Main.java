package Main;

import Game.Game;

public class Main {
    public static void main(String[] args) {
        // rock paper scissors game call
        System.out.println(Game.randomChoice()); // Random choice for Player 1
        String player1 = Game.randomChoice();
        String player2 = Game.randomChoice();
        String gameResult = Game.winner(player1, player2);
        System.out.println(String.format("Player 1 chose %s and Player 2 chose %s, %s", player1, player2, gameResult));
    }
}
