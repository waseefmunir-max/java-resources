public class JavMethodOverloading {
    static int sum2Numbers(int x, int y) {
        return x + y;
    }

    static double sum2Numbers(double x, double y) {
        return x + y;
    } // Method with the same name can be declared, as long as their data type is different

    public static void main(String[] args) {

        System.out.println("Sum of 2 integers: " + sum2Numbers(5, 6));
        System.out.println("Sum of 2 doubles: " + sum2Numbers(5.6, 6.5));
    }
}
