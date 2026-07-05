import java.util.Scanner;

public class StringToInteger{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a numeric string to convert to an integer: ");
            String input = scanner.nextLine();

            int number = Integer.parseInt(input);
            System.out.println("Conversion successful! The integer value is: " + number);

        } catch (NumberFormatException e) {
            System.out.println("Error: \"" + e.getMessage() + "\" is not a valid integer. Please enter digits only (e.g., 123 or -45).");

        } finally {
            scanner.close();
            System.out.println("Program terminated.");
        }
    }
}