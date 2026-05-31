import java.util.Scanner;
import java.util.Random;

public class HypotenuseOfRightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Choose an option:");
        System.out.println("1. Generate hypotenuse randomly");
        System.out.println("2. Generate hypotenuse randomly");
        System.out.print("Your choice: ");
        int userChoice = scanner.nextInt();

        scanner.close();
    }
}
