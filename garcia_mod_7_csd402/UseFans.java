/*
 * Perla Garcia Cavazos
 * Module 7 Assignment - CSD402
 * UseFans Class
 */

import java.util.ArrayList;

public class UseFans {

    // Display ONE fan (no toString)
    public static void displayFan(Fan fan) {
        System.out.println("Fan Details:");
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On: " + fan.isOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
        System.out.println("---------------------------");
    }

    // Display ALL fans in a collection (no toString)
    public static void displayFans(ArrayList<Fan> fans) {
        System.out.println("Displaying All Fans:");
        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    public static void main(String[] args) {

        // Create a collection of Fan objects
        ArrayList<Fan> fanList = new ArrayList<>();

        // Add fans to the collection
        fanList.add(new Fan(Fan.FAST, true, 10, "blue"));
        fanList.add(new Fan(Fan.MEDIUM, false, 8, "green"));
        fanList.add(new Fan(Fan.SLOW, true, 5, "yellow"));
        fanList.add(new Fan()); // default fan

        // Display all fans
        displayFans(fanList);
    }
}