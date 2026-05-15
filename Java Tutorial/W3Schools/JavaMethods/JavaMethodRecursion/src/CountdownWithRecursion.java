public class CountdownWithRecursion {
    public static void countdown(int x) {
        if (x > 0) {
            System.out.println(x);
            countdown(x - 1);
        }
    }

    public static void main(String[] args) {
        int x = 10;
        countdown(x);
    }
}
