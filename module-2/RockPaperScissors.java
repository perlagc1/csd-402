/*
 * Author: Perla Garcia Cavazos
 * Course: CSD 402
 * Module: 2.2
 * Assignment: Rock-Paper-Scissors
 * Date: October 9, 2026
 *
 * Description:
 * This program simulates a Rock-Paper-Scissors game.
 * The computer randomly selects Rock, Paper, or Scissors.
 * The user enters a number from 1 to 3, and the program
 * displays both selections and determines the winner.
 */
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Rock-Paper-Scissors Game");
        System.out.println("1 = Rock, 2 = Paper, 3 = Scissors");

        // Computer choice
        int computer = rand.nextInt(3) + 1;

        // User choice
        System.out.print("Enter your choice (1-3): ");
        int user = input.nextInt();

        // Names for display
        String[] names = {"", "Rock", "Paper", "Scissors"};

        System.out.println("\nYou chose: " + names[user]);
        System.out.println("Computer chose: " + names[computer]);

        // Determine winner
        if (user == computer) {
            System.out.println("Result: It's a tie!");
        } else if ((user == 1 && computer == 3) ||
                   (user == 2 && computer == 1) ||
                   (user == 3 && computer == 2)) {
            System.out.println("Result: You win!");
        } else {
            System.out.println("Result: Computer wins!");
        }
    }
}
