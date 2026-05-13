public class JavaMethodReturnValues {
    static int sum2Numbers(int x, int y) {
        return x + y;
    }

    static int doubler(int x) {
        return x * 2;
    }

    static String greetingMsg(String name) {
        return "Hello, " + name;
    }

    public static void main(String[] args) {
        System.out.println(sum2Numbers(2, 3));
        System.out.println(sum2Numbers(2, 4));
        System.out.println(sum2Numbers(3, 5));

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Double of " + i + " is " + doubler(i));
        }

        System.out.println();

        System.out.println(greetingMsg("Alan"));
        System.out.println(greetingMsg("Paul"));
        System.out.println(greetingMsg("Walker"));
    }
}
