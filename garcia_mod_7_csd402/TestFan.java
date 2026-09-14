public class TestFan {
    public static void main(String[] args) {

        // Create fan using default constructor
        Fan fan1 = new Fan();
        System.out.println("Fan 1: " + fan1);

        // Create fan using argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");
        System.out.println("Fan 2: " + fan2);

        // Demonstrate setters
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setOn(true);
        fan1.setColor("green");

        System.out.println("Updated Fan 1: " + fan1);
    }
}