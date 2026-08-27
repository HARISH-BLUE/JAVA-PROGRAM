public class create {
    public static void main(String[] args) {
        int size = 8; // controls the size of the heart

        for (int i = size / 2; i <= size; i += 2) {
            // upper left spaces
            for (int j = 1; j < size - i; j += 2) {
                System.out.print(" ");
            }
            // upper left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // middle spaces
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            // upper right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower part of heart
        for (int i = size; i >= 1; i--) {
            // leading spaces
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
