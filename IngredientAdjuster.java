import java.util.Scanner;

public class IngredientAdjuster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many cookies would you like to make? ");

        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a whole number.");
            return;
        }

        int cookies = scanner.nextInt();
        if (cookies <= 0) {
            System.out.println("The number of cookies must be greater than zero.");
            return;
        }

        double scale = cookies / 48.0;
        double sugar = 1.5 * scale;
        double butter = scale;
        double flour = 2.75 * scale;

        System.out.println("Sugar: " + sugar + " cups");
        System.out.println("Butter: " + butter + " cups");
        System.out.println("Flour: " + flour + " cups");
    }
}
