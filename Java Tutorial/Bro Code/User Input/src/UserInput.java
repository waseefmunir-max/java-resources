import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        // Here, 'Scanner' is a class that allows us to read user input from the console. We create an object of the 'Scanner' class called 'scanner' and pass 'System.in' as an argument to its constructor. This tells the 'Scanner' to read input from the standard input stream (the console).
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name);

        scanner.close(); // Good practice to close the object
    }
}
