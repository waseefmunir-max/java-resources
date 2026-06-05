public class Printf {
    public static void main(String[] args) {

        // printf - A method used to format output.

        // %[flags][width][.precision][specifier-character]
        // [flags]
        // + : include a plus sign for positive numbers
        // , : include commas as thousand separators
        // ( : enclose negative numbers in parentheses
        // space : include a space before positive numbers, and a minus sign before negative numbers

        String name = "Spongebob";
        int age = 30;
        char firstLetter = 'S';
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello, %s\n", name);
        System.out.printf("Your name starts with %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("Your are %.2f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);

        System.out.println();

        // [flags]
        // + : include a plus sign for positive numbers
        // , : include commas as thousand separators
        // ( : enclose negative numbers in parentheses
        // space : include a space before positive numbers, and a minus sign before negative numbers

        double x = 2.5;
        double y = 12.5;
        double z = -24.5;

        // +
        System.out.printf("x: %+.2f\n", x);
        System.out.printf("y: %+.2f\n", y);
        System.out.printf("z: %+.2f\n", z);
    }
}
