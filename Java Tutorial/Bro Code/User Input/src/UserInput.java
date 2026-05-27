import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        // Here, 'Scanner' is a class that allows us to read user input from the console. We create an object of the 'Scanner' class called 'scanner' and pass 'System.in' as an argument to its constructor. This tells the 'Scanner' to read input from the standard input stream (the console).
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // nextLine() is a method of the Scanner class that reads a line of text even if it contains spaces. It waits for the user to input a line of text and then returns that text as a String.
        // To read a single word (without spaces), you can use the next() method instead of nextLine(). For example:
//        String name = scanner.next();

        // To read an integer, you can use the nextInt() method. For example:
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // To read a boolean, you can use the nextBoolean() method. For example:
        System.out.print("Are you a student (true: Yes, false: No): ");
        boolean isStudent = scanner.nextBoolean();

        // To read doubles, you can use the nextDouble() method. For example:
        System.out.print("Enter your cgpa: ");
        double cgpa = scanner.nextDouble();

//        System.out.print("Enter your expected grade: ");
//        char grade = scanner.next

        System.out.println("Hello, " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your cgpa: " + cgpa);

        scanner.close(); // Good practice to close the object
    }
}
