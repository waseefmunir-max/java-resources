//import java.util.Scanner; // package to read user input

import java.util.*; // package to import all the classes in java.util package

public class JavaPackagesAPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Hello, " + username + "!");

        int randomNumber = random.nextInt(1, 7);
        System.out.println("Random number between 1-6: " + randomNumber);

        scanner.close();
    }
}
