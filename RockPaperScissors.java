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
