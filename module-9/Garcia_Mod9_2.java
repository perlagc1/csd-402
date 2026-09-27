/*
 * Name: Perla Garcia Cavazos
 * Date: September 27, 2026
 * Assignment: Module 9 - Program 2
 * Course: CSD 402
 *
 * This program creates a file named data.file if it does not exist.
 * It appends 10 randomly generated integers to the file, with each
 * integer separated by a space. The program then closes the file,
 * reopens it, reads the contents, and displays the data.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Garcia_Mod9_2 {

    public static void main(String[] args) {

        File file = new File("data.file");
        Random random = new Random();

        try {
            // Create the file if it does not already exist.
            if (file.createNewFile()) {
                System.out.println("data.file was created.");
            } else {
                System.out.println("data.file already exists. New numbers will be appended.");
            }

            // Append 10 randomly generated integers to the file.
            FileWriter writer = new FileWriter(file, true);

            for (int i = 0; i < 10; i++) {
                int randomNumber = random.nextInt(100);
                writer.write(randomNumber + " ");
            }

            writer.close();

            // Reopen the file and display its contents.
            System.out.println("\nContents of data.file:");

            Scanner reader = new Scanner(file);

            while (reader.hasNext()) {
                System.out.print(reader.next() + " ");
            }

            reader.close();

            System.out.println();

        } catch (IOException e) {
            System.out.println("An error occurred while working with data.file.");
            e.printStackTrace();
        }
    }
}