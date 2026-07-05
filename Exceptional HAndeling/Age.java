import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Age{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            validateAge(age);
            System.out.println("access granted. you are eligible (age: " + age + ").");

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("error: invalid input. age is a number btw.");

        } finally {
            scanner.close();
            System.out.println("program ended.");
        }
    }

    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("you should be at least 18 years old to proceed. Your age: " + age + ".");
        }
    }
}