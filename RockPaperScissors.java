import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public enum Move {
        ROCK, PAPER, SCISSORS
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("WELCOME TO THE GAME OF Rock, Paper, Scissors!");

        while (true) {
            // Player's move
            System.out.print("Enter your move (Rock, Paper, or Scissors): ");
            String playerMoveStr = scanner.nextLine().toUpperCase();
            Move playerMove = Move.valueOf(playerMoveStr);

            // Computer's move
            Move computerMove = Move.values()[random.nextInt(Move.values().length)];

            System.out.println("Computer chooses: " + computerMove);

            // Determine the winner
            if (playerMove == computerMove) {
                System.out.println("It's a tie!");
            } else if ((playerMove == Move.ROCK && computerMove == Move.SCISSORS) ||
                    (playerMove == Move.PAPER && computerMove == Move.ROCK) ||
                    (playerMove == Move.SCISSORS && computerMove == Move.PAPER)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            // Ask for another round
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        System.out.println("Thanks for playing Avi!");
        scanner.close();
    }
}
