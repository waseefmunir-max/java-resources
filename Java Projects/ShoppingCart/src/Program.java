import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String itemName;
        float price;
        int numOfItems;

        System.out.print("What item would you like to buy?: ");
        itemName = scanner.nextLine();



        scanner.close();
    }
}
