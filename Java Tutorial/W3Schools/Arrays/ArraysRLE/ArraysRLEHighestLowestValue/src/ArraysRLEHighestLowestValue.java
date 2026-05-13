public class ArraysRLEHighestLowestValue {
    public static void main(String[] args) {
        int numbers[] = {2,5,7,-8,5,9,4,3};
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
