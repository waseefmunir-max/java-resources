public class JavaMethodReturnValues {
    static int sum2Numbers (int x, int y) {
        return x + y;
    }

    static int doubler(int x) {
        return x *= x;
    }

    public static void main(String[] args) {
        System.out.println(sum2Numbers(2, 3));
        System.out.println(sum2Numbers(2, 4));
        System.out.println(sum2Numbers(3, 5));
    }
}
