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



        scanner.close();
    }
}
