public class JavMethodOverloading {
    public static int sum2Numbers(int x, int y) {
        return x + y;
    }

    public static double sum2Numbers(double x, double y) {
        return x + y;
    } // Method with the same name can be declared, as long as their data type is different

    // Overloading methods with different number of parameters:
    public static double sum2Numbers(double x) {
        return x;
    }

    // Overloading methods with different order but same number of parameters:
    public static double sum2Numbers(int x, double y) {
        return x + y;
    }

    public static double sum2Numbers(double x, int y) {
        return x - y;
    }

    public static void main(String[] args) {

        System.out.println("Sum of 2 integers: " + sum2Numbers(5, 6));
        System.out.println("Sum of 2 doubles: " + sum2Numbers(5.6, 6.5));

        System.out.printf("Mirroring the number %.2f with the same method: %.2f\n\n", 4.5, sum2Numbers(4.5));

        System.out.println(sum2Numbers(4, 5.6));
        System.out.printf("%.2f", sum2Numbers(5.6, 4));
    }
}
