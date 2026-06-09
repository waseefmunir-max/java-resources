import java.util.Scanner;

public class SumOfNumbersWithinSpecificRange {
    public static int sumOfNumbers(int start, int end) {
        if (end > start) {
            return end + sumOfNumbers(start, end - 1);
        } else {
            return end;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start, end;

        System.out.print("Enter the first number: ");
        start = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the second number: ");
        end = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("Sum of numbers from %d to %d is: %d\n", start, end, sumOfNumbers(start, end));

        scanner.close();
    }
}
