public class ForLoopsRLEFactorial {
    public static void main(String[] args) {
        int fact = 1, number = 4;

        for (int i = 1; i <= 4; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
