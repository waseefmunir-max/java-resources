import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String itemName;
        float itemPrice;
        int numOfItems;

        System.out.print("What item would you like to buy?: ");
        itemName = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        itemPrice = scanner.nextFloat(); // .nextFloat() for floating point numbers

        System.out.print("How many would you like?: ");
        numOfItems = scanner.nextInt();

        float totalPrice = itemPrice * numOfItems;

        System.out.println("\nYou have bought " + numOfItems + " " + itemName + "/s");
        System.out.println("Your total is $" + totalPrice);

        scanner.close();
    }
}
