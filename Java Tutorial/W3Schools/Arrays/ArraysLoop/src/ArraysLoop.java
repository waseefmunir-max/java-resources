public class ArraysLoop {
    public static void main(String[] args) {
        // Sum of numbers in an array:
        int sum = 0;
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }

        System.out.println(sum);
    }
}
