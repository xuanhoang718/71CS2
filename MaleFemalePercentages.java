import java.util.Scanner;

public class MaleFemalePercentages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of males: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a whole number.");
            return;
        }
        int males = scanner.nextInt();

        System.out.print("Enter the number of females: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a whole number.");
            return;
        }
        int females = scanner.nextInt();

        if (males < 0 || females < 0) {
            System.out.println("Student counts cannot be negative.");
            return;
        }

        long total = (long) males + females;
        if (total == 0) {
            System.out.println("The class must have at least one student.");
            return;
        }

        double malePercentage = males * 100.0 / total;
        double femalePercentage = females * 100.0 / total;

        System.out.printf("Males: %.2f%%%n", malePercentage);
        System.out.printf("Females: %.2f%%%n", femalePercentage);
    }
}
