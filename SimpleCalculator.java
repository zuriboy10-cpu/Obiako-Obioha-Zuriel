import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = input.nextDouble();
        System.out.print("Enter second number: ");
        double b = input.nextDouble();

        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        if (b != 0) {
            System.out.println("Quotient: " + (a / b));
            System.out.println("Remainder: " + (a % b));
        } else {
            System.out.println("Quotient: cannot divide by zero");
            System.out.println("Remainder: cannot divide by zero");
        }
        input.close();
    }
}
