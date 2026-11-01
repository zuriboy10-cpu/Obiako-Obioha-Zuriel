import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first score: ");
        double s1 = input.nextDouble();
        System.out.print("Enter second score: ");
        double s2 = input.nextDouble();
        System.out.print("Enter third score: ");
        double s3 = input.nextDouble();

        double total = s1 + s2 + s3;
        double average = total / 3;

        System.out.println("Total: " + total);
        System.out.printf("Average: %.2f%n", average);
        input.close();
    }
}
