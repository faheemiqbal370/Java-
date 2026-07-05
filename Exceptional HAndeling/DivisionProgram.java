import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("enter the dividend: ");
            int numerator = scanner.nextInt();
            System.out.print("enter the divisor: ");
            int denominator = scanner.nextInt();
            int result = numerator / denominator;
            System.out.println("result: " + numerator + " / " + denominator + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("error: cannot divide by zero. can't you use a non-zero denominator.");
        } catch (InputMismatchException e) {
            System.out.println("error: invalid input. can't you enter valid integers only.");
        } finally {
            scanner.close();
            System.out.println("program terminated.");
        }
    }
}