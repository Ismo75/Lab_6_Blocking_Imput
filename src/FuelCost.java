import java.util.Scanner;

public class FuelCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallons, mpg, price;

        // Get gallons
        do {
            System.out.print("Enter gallons in tank: ");
            String input = scanner.nextLine();
            try {
                gallons = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number.");
            }
        } while (true);

        // Get MPG
        do {
            System.out.print("Enter fuel efficiency (MPG): ");
            String input = scanner.nextLine();
            try {
                mpg = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number.");
            }
        } while (true);

        // Get price
        do {
            System.out.print("Enter gas price per gallon: ");
            String input = scanner.nextLine();
            try {
                price = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number.");
            }
        } while (true);

        double costToDrive100 = (100 / mpg) * price;
        double distanceFullTank = gallons * mpg;

        System.out.printf("Cost to drive 100 miles: $%.2f%n", costToDrive100);
        System.out.printf("Distance on full tank: %.2f miles%n", distanceFullTank);
    }
}
