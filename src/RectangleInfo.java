import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean enterAnotherValue;

        do {
            double width, height;

            // Get width
            do {
                System.out.print("Enter width: ");
                String input = scanner.nextLine();
                try {
                    width = Double.parseDouble(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input.");
                }
            } while (true);

            // Get height
            do {
                System.out.print("Enter height: ");
                String input = scanner.nextLine();
                try {
                    height = Double.parseDouble(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input.");
                }
            } while (true);

            // Calculations
            double area = width * height;
            double perimeter = 2 * (width + height);
            double diagonal = Math.sqrt(width * width + height * height);

            // Output
            System.out.printf("Area: %.2f%n", area);
            System.out.printf("Perimeter: %.2f%n", perimeter);
            System.out.printf("Diagonal: %.2f%n", diagonal);

            // Prompt to continue
            System.out.print("Enter another value? [Y/N]: ");
            String choice = scanner.nextLine().trim();
            enterAnotherValue = choice.equalsIgnoreCase("Y");

        } while (enterAnotherValue);

        System.out.println("Thanks for using the calculator!");
        scanner.close();
    }
}