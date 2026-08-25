 * Name: Perla Garcia Cavazos
 * Date: August 24, 2026
 * Assignment: Module 4 – Overloaded Average Methods
 */

public class GarciaCavazos_Mod4_CSD402 {

    // ----- Overloaded average methods -----

    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short)(sum / array.length);
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // ----- Test Program -----

    public static void main(String[] args) {

        short[] shortArray = {10, 20, 30};
        int[] intArray = {5, 15, 25, 35};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {2.5, 4.5, 6.5, 8.5, 10.5, 12.5};

        System.out.println("Short Array:");
        printArray(shortArray);
        System.out.println("Average: " + average(shortArray));
        System.out.println();

        System.out.println("Int Array:");
        printArray(intArray);
        System.out.println("Average: " + average(intArray));
        System.out.println();

        System.out.println("Long Array:");
        printArray(longArray);
        System.out.println("Average: " + average(longArray));
        System.out.println();

        System.out.println("Double Array:");
        printArray(doubleArray);
        System.out.println("Average: " + average(doubleArray));
        System.out.println();
    }

    // ----- Helper print methods -----

    public static void printArray(short[] array) {
        for (short num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printArray(long[] array) {
        for (long num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] array) {
        for (double num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}