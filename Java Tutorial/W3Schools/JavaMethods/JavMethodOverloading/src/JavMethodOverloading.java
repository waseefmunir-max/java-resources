public class JavMethodOverloading {
    static int sum2Numbers(int x, int y) {
        return x + y;
    }

    static double sum2Numbers(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {

        System.out.println("Sum of 2 integers: " + sum2Numbers(5, 6));
        System.out.println("Sum of 2 doubles: " + sum2Numbers(5.6, 6.5));
    }
}
