import java.util.Scanner;

public class CommonIssuesWIthUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Removes the newline character left in the buffer after reading an integer

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("You're " + age + " old");
        System.out.println("You like the color " + color);

        scanner.close();
    }
}
