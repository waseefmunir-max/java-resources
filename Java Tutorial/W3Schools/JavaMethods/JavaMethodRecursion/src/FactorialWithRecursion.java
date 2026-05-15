public class FactorialWithRecursion {
    public static int factorialOfNumber(int x) {
        if (x > 1) {
            return x * factorialOfNumber(x - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("Factorial of 5 is: " + factorialOfNumber(x));
    }
}
