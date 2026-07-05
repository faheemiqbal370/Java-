import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayIndexProgram {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array contents: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
        try {
            System.out.print("\nEnter an index to access (0 to " + (numbers.length - 1) + "): ");
            int index = scanner.nextInt();
            int value = numbers[index];
            System.out.println("Value at index " + index + " is: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. enter a value between 0 and " + (numbers.length - 1) + ".");
        } catch (InputMismatchException e) {
            System.out.println("error: invalid input. enter a valid integer index.");
            System.out.println("e.getMessage: " + e.getMessage() );
            e.printStackTrace(); // this is inbluit function for printing the line no.s and method calls 
        } finally {
            scanner.close();
            System.out.println("program ended successfully.");
        }
    }
}