/*
 * Author: Perla Garcia Cavazos
 * Date: 08/24/2026
 * Assignment: Module 1.3 – Energy Needed to Heat Water
 */

import java.util.Scanner;

public class GarciaCavazos_mod_1_csd402 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature (Celsius): ");
        double initialTemp = input.nextDouble();

        System.out.print("Enter the final temperature (Celsius): ");
        double finalTemp = input.nextDouble();

        double energy = waterMass * (finalTemp - initialTemp) * 4184;

        System.out.println("The energy needed is " + energy + " Joules.");

        input.close();
    }
}
