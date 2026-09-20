import java.util.ArrayList;
import java.util.Scanner;

/*
 * Name: Perla Garcia Cavazos
 * Date: September 20, 2026
 * Assignment: Module 8 Programming Assignment
 */

public class GarciaArrayListTest {

    /**
     * Returns the largest value in an ArrayList.
     *
     * @param list the ArrayList containing Integer values
     * @return the largest value in the ArrayList, or 0 if the list is empty
     */
    public static Integer max(ArrayList list) {

        if (list.isEmpty()) {
            return 0;
        }

        Integer largest = (Integer) list.get(0);

        for (int i = 1; i < list.size(); i++) {
            Integer current = (Integer) list.get(i);

            if (current > largest) {
                largest = current;
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers. Enter 0 to stop.");

        Integer number;

        do {
            System.out.print("Enter an integer: ");
            number = input.nextInt();
            numbers.add(number);
        } while (number != 0);

        Integer largest = max(numbers);

        System.out.println("The largest value is: " + largest);

        // Additional test for an empty ArrayList.
        ArrayList<Integer> emptyList = new ArrayList<>();
        System.out.println("Testing an empty ArrayList: " + max(emptyList));

        input.close();
    }
}