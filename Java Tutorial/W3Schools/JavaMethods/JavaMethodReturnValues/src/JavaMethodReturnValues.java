public class JavaMethodReturnValues {
    static int sum2Numbers (int x, int y) {
        return x + y;
    }

    static int doubler(int x) {
        return x *= 2;
    }

    public static void main(String[] args) {
        System.out.println(sum2Numbers(2, 3));
        System.out.println(sum2Numbers(2, 4));
        System.out.println(sum2Numbers(3, 5));

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.println("DOuble of " + i + " is " + doubler(i));
        }
    }
}
