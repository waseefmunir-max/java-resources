import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        // Here, 'Scanner' is a class that allows us to read user input from the console. We create an object of the 'Scanner' class called 'scanner' (or any other name we want) and pass 'System.in' as an argument to its constructor. This tells the 'Scanner' to read input from the standard input stream (the console).
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
        double cgpa = 0; // if this is not initialized, it will print an error. We need to initialize it, in case if user doesn't put any input, it will proceed with the initialized value
        char gradeExpected = 0;

        if (isStudent) {
            System.out.print("Enter your cgpa: ");
            cgpa = scanner.nextDouble();

            // To read char, you can use the next() method and take only the first character from the string:
            System.out.print("What is your expected grade? (A, B, C, D): ");
            // String gradeExpected = scanner.next().charAt(0); // It will cause an error because charAt(0) returns a char, but we are trying to assign it to a String variable. To fix this, we can change the variable type to char:
            gradeExpected = scanner.next().charAt(0);
        }

        System.out.println("Hello, " + name);
        System.out.println("You are " + age + " years old");
        if (isStudent) {
            System.out.println("You are enrolled as student");
            System.out.println("Your cgpa: " + cgpa);
            System.out.println("Your expected grade: " + gradeExpected);
        } else {
            System.out.println("You are NOT enrolled as student");
        }

        scanner.close(); // Good practice to close the object, otherwise it may lead to unexpected results
    }
}
