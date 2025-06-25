import java.util.Scanner;

public class CTFConterter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean convertOtherValues;

        do {
            double celsius;

            while (true) {
                System.out.print("Enter temperature in Celsius: ");
                String input = scanner.nextLine();

                try {
                    celsius = Double.parseDouble(input);
                    break; // Valid input, break loop
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }

            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);

            System.out.print("Convert another value? [Y/N]: ");
            String choice = scanner.nextLine().trim();
            convertOtherValues = choice.equalsIgnoreCase("Y");

        } while (convertOtherValues);

        System.out.println("Thanks for using the converter!");
        scanner.close();
    }
}

