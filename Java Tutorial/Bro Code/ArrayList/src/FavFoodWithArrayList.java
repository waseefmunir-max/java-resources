import java.util.ArrayList;
import java.util.Scanner;

public class FavFoodWithArrayList {
    public static void main(String[] args) {
        ArrayList<String> favoriteFood = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the # of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine(); // removing input buffer

        for (int i = 0; i < numOfFood; i++) {
            System.out.print("Enter food #" + (i + 1) + ": ");
            String food = scanner.nextLine();
            favoriteFood.add(food);
        }

        System.out.println(favoriteFood);

        scanner.close();
    }
}
