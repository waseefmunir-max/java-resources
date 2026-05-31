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
        int userChoice;
        double lengthBase, lengthAltitude, lengthHypotenuse;
        userChoice = scanner.nextInt();

        if (userChoice == 2) {
            System.out.print("Enter the length of base (within 100): ");
            lengthBase = scanner.nextDouble();
            System.out.print("Enter the length of altitude (within 100): ");
            lengthAltitude = scanner.nextDouble();
        } else {
            lengthBase = random.nextDouble(1, 101);
            lengthAltitude = random.nextDouble(1, 101);
        }

        scanner.close();
    }
}
