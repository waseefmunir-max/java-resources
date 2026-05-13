public class Maths {
    public static void main(String[] args) {
        System.out.println(Math.max(8, 10));
        System.out.println(Math.min(2, 4));
        System.out.println(Math.sqrt(81));
        System.out.println(Math.abs(-3.98));
        System.out.println(Math.pow(2, 4));
        System.out.println(Math.round(5.5));
        System.out.println(Math.floor(5.5));
        System.out.println(Math.ceil(5.5));

        // Math.random() returns a random irrational number between 0.0 (inclusive), and 1.0 (exclusive).
        // 0.0 (inclusive), and 1.0 (exclusive) mathematically means:
        // Let 'x' be the random number. So, the range:
        // 0.0 <= x < 1.0
        System.out.println(Math.random());
        // Generating a number between 1 and 100:
        int randomNumber = (int) (Math.random() * 101); // Choosing 101 instead of 100 because x < 1.0, not x <= 1.0. So x would never be 1 and therefore after multiplication we will never get 100
        System.out.println(randomNumber);
    }
}
