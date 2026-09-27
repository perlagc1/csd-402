/*
 * Name: Perla Garcia Cavazos
 * Date: September 27, 2026
 * Assignment: Module 9 - Program 1
 * Course: CSD 402
 *
 * This program creates an ArrayList containing at least 10 Strings.
 * It uses a for-each loop to display the collection and asks the user
 * which element they would like to see again. The program demonstrates
 * autoboxing and auto-unboxing and uses try/catch exception handling
 * for an invalid ArrayList index.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Garcia_Mod9_1 {

    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<>();

        items.add("Apple");
        items.add("Banana");
        items.add("Orange");
        items.add("Strawberry");
        items.add("Grape");
        items.add("Watermelon");
        items.add("Pineapple");
        items.add("Mango");
        items.add("Peach");
        items.add("Cherry");

        System.out.println("ArrayList Elements:");

        int number = 0;

        // For-each loop used to display the ArrayList
        for (String item : items) {
            System.out.println(number + ": " + item);
            number++;
        }

        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter the number of the element you would like to see again: ");

        String userInput = input.nextLine();

        try {
            // Convert the user's String input to an Integer.
            // Integer.valueOf() demonstrates autoboxing.
            Integer boxedIndex = Integer.valueOf(userInput);

            // Assigning Integer to int demonstrates auto-unboxing.
            int index = boxedIndex;

            System.out.println("You selected: " + items.get(index));

        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Exception has been thrown: Out of Bounds");
        }

        input.close();
    }
}