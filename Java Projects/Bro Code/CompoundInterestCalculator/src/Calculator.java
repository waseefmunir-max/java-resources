import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfYears;
        double principleAmount, interestRate, numOfCompoundedTimes, amount, compoundInterest;

        System.out.print("Enter the principle amount: ");
        principleAmount = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        interestRate = scanner.nextDouble();
        interestRate /= 100.0;

        System.out.print("Enter the # of times compounded per year: ");
        numOfCompoundedTimes = scanner.nextDouble();

        System.out.print("Enter the # of years: ");
        numOfYears = scanner.nextInt();

        amount = principleAmount * Math.pow((1 + interestRate / numOfCompoundedTimes), (numOfCompoundedTimes * numOfYears));
        compoundInterest = amount - principleAmount;

        System.out.printf("The amount after %d year(s) is: $%,.2f\n", numOfYears, amount);
        System.out.printf("Compound interest: $%,.2f\n", compoundInterest);

        scanner.close(); // closing the scanner object to prevent memory leaks
    }
}
