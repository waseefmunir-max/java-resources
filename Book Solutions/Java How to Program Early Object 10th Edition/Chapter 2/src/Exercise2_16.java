import java.util.Scanner;

public class Exercise2_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x, y;

        System.out.print("Enter first integer: ");
        x = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter second integer: ");
        y = scanner.nextInt();
        scanner.nextLine();

        if (x > y) {
            System.out.printf("%d is greater than %d%n", x, y);
        } else if (y > x) {
            System.out.printf("%d is greater than %d%n", y, x);
        } else  {
            System.out.println("These numbers are equal");
        }
    }
}
