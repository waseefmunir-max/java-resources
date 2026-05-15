public class SumOfNumbersWithinSpecificRange {
    public static int sumOfNumbers(int start, int end) {
        if (end > start) {
            return end + sumOfNumbers(start, end - 1);
        } else {
            return end;
        }
    }

    public static void main(String[] args) {
        int start = 5, end = 10;
        System.out.println("Sum of numbers from 5 to 10 is: " + sumOfNumbers(start, end));
    }
}
