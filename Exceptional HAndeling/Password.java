import java.util.Scanner;

public class Password{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a password (minimum 8 characters): ");
            String password = scanner.nextLine();

            if (password.length() < 8) {
                throw new IllegalArgumentException("Password must be at least 8 characters long. You entered " + password.length() + " character(s).");
            }

            System.out.println("Password accepted. Length: " + password.length() + " characters.");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            scanner.close();
            System.out.println("Program terminated.");
        }
    }
}