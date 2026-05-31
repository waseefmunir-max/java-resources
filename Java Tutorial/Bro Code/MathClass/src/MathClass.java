public class MathClass {
    public static void main(String[] args) {
        // Java has built-in Math class that has many useful methods for performing mathematical operations. We can use these methods by calling them with the class name 'Math' followed by a dot '.' and then the method name.

        // For example, let's print the value of PI:
        System.out.println("Value of PI: " + Math.PI);
        System.out.println("Value of exponential: " + Math.E);

        double result1 = Math.pow(2, 4);
        double result2 = Math.abs(-5);
        double result3 = Math.sqrt(9);
//        double result4 = Math.round(4.5);
        double result4 = Math.round(4.4);
        double result5 = Math.ceil(4.4);
        double result6 = Math.floor(4.6);
        double result7 = Math.max(5, 6);
        double result8 = Math.min(5, 6);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
    }
}
