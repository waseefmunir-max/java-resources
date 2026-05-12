public class ArraysRLENegZeroChecker {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, -7, 9, 0, 11, 13};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                continue;
            } else if (numbers[i] == 0) {
                break;
            }
            System.out.println(numbers[i]);
        }
    }
}
