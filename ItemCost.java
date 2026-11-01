import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String item = input.nextLine();
        System.out.print("Enter unit price: ");
        double price = input.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        double total = price * quantity;

        System.out.println("Item: " + item);
        System.out.printf("Unit price: %.2f%n", price);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total cost: %.2f%n", total);
        input.close();
    }
}
