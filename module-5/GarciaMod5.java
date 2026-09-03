/*
 * Author: Perla Garcia
 * Date: 09/03/2026
 * Module: 5
 * Description: Methods to locate largest and smallest values in 2D arrays.
 */

public class GarciaMod5 {

    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2];
        double largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = new int[2];
        int largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2];
        double smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = new int[2];
        int smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static void main(String[] args) {
        int[][] intArray = {
            {3, 8, 2},
            {14, 1, 9},
            {7, 6, 5}
        };

        double[][] doubleArray = {
            {3.5, 8.2, 2.1},
            {14.9, 1.3, 9.8},
            {7.4, 6.6, 5.0}
        };

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        System.out.println("Largest int at: (" + largestInt[0] + ", " + largestInt[1] + ")");
        System.out.println("Smallest int at: (" + smallestInt[0] + ", " + smallestInt[1] + ")");

        System.out.println("Largest double at: (" + largestDouble[0] + ", " + largestDouble[1] + ")");
        System.out.println("Smallest double at: (" + smallestDouble[0] + ", " + smallestDouble[1] + ")");
    }
}