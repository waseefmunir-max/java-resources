import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principleAmount, interestRate, numOfCompoundedTimes, numOfYears, amount, compoundInterest;

        System.out.print("Enter the principle amount: ");
        principleAmount = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        interestRate = scanner.nextDouble();

        System.out.print("Enter the # of times compounded per year: ");
        numOfCompoundedTimes = scanner.nextDouble();

        System.out.print("Enter the # of years: ");
        numOfYears = scanner.nextDouble();

        amount = principleAmount * Math.pow((1 + interestRate / numOfCompoundedTimes), (numOfCompoundedTimes * numOfYears));

        System.out.printf("Compound interest: %.2f\n", compoundInterest);
        System.out.printf("The amount after 1 year(s) is: %.2f", amount);
    }
}
