import java.util.Scanner;

public class HomePage {
    private final int choice;

    public HomePage(int choice) {
        this.choice = choice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----------Result Management System----------\n");
            System.out.println("Welcome to the Result Management System!\n");
            System.out.println("Select an option to continue: ");
            System.out.println("1. Login as a teacher");
            System.out.println("2. Login as a student");
            System.out.println("3. Exit the program");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {

            } else if (choice == 2) {

            } else if (choice == 3) {
                System.out.println("Thank you for using the Result Management System!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
