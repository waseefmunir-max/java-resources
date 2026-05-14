public class SumOfNumbers {
    public static int sumOfNumbers(int x) {
        if (x > 0) {
            return x + sumOfNumbers(x - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println("Sum: " + sumOfNumbers(x));
    }
}
