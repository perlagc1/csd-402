public class Garcia_Mod3_CSD402 {
    public static void main(String[] args) {

        for (int row = 1; row <= 7; row++) {

            for (int s = 7 - row; s > 0; s--) {
                System.out.print("  ");
            }

            int value = 1;
            for (int i = 1; i <= row; i++) {
                System.out.print(value + " ");
                value *= 2;
            }

            value /= 4;
            for (int i = 1; i < row; i++) {
                System.out.print(value + " ");
                value /= 2;
            }

            System.out.println("@");
        }
    }
}