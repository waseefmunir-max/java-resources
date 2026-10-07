import java.util.Scanner;

public class Exercise2_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x, y, sum;

        System.out.print("Enter first integer: ");
        x = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter second integer: ");
        y = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("Sum: %d%n", x + y);
        System.out.printf("Product: %d%n", x * y);
        System.out.printf("Difference: %d%n", x - y);
        System.out.printf("Quotient: %d%n", x / y);
    }
}
