public class JavaMethodsRecursion {
    public static int sumNumbers(int x) {
        if (x > 0) {
            return x + sumNumbers(x - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + sumNumbers(10));
    }
}
