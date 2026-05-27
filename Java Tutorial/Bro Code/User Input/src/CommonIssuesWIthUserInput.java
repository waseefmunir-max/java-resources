import java.util.Scanner;

public class CommonIssuesWIthUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        scanner.close();
    }
}
