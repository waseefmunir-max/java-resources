public class ArraysRLENegZeroChecker {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, -7, 9, 0, 11, 13};

        for (int number : numbers) {
            if (number < 0) {
                continue;
            } else if (number == 0) {
                break;
            }
            System.out.println(number);
        }
    }
}
