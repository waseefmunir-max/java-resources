import java.util.Scanner;

public class FirstPage {
    private final int choice;

    public FirstPage(int choice) {
        this.choice = choice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------Result Management System----------\n");
        System.out.println("Welcome to the Result Management System!\n");
        System.out.println("Select an option to continue: ");
        System.out.println("1. Login as a teacher");
        System.out.println("2. Login as a student");
        System.out.println("3. Exit the program");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        scanner.close();
    }
}
