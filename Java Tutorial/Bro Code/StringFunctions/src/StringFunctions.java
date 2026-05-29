import java.util.Scanner;

public class StringFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text;

        System.out.print("Enter some text: ");
        text = scanner.nextLine();

        if (text.isEmpty()) {
            System.out.println("You didn't enter anything!");
        } else if (text.isBlank()) {
            System.out.println("You entered whitespaces, but not any texts!");
        } else {
            System.out.println("Your entered texts: " + text);
        }

        // .isEmpty checks if the string is empty (length is 0), and it counts whitespaces as characters, so if the string contains only whitespaces, .isEmpty will return false.
        // .isBlank checks if the string is empty, but unlike .isEmpty, it ignores whitespaces. So if the string contains only whitespaces, .isBlank will return true.

        scanner.close();
    }
}
