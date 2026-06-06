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

        // +
        double x = 2.5;
        int y = 12;
        double z = -24.5;
        System.out.printf("x: %+.2f\n", x);
        System.out.printf("y: %+d\n", y);
        System.out.printf("z: %+.2f\n\n", z);

        // ,
        double x1 = 45690.78;
        int y1 = 1234545689;
        double z1 = 453456364576690.78;
        System.out.printf("x1: %,.2f\n", x1);
        System.out.printf("y1: %,d\n", y1);
        System.out.printf("z1: %,.2f\n\n", z1);

        // (
        double x2 = 2.5;
        int y2 = 12;
        double z2 = -24.5;
        System.out.printf("x2: %(.2f\n", x2);
        System.out.printf("y2: %(d\n", y2);
        System.out.printf("z2: %(.2f\n\n", z2);

        // space
        double x3 = 2.5;
        int y3 = 12;
        double z3 = -24.5;
        System.out.printf("x3: % .2f\n", x3);
        System.out.printf("y3: % d\n", y3);
        System.out.printf("z3: % .2f\n\n", z3);

        // ---------------------------------------------------------------------------------------------------------

        // [width]
        // 0 : pad with zeros
        // number : right justified padding with spaces (if the number is positive, it will be right justified, and if the number is negative, it will be left justified)
        // -number : left justified padding with spaces (if the number is positive, it will be left justified, and if the number is negative, it will be right justified)

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1); // prints 0001
        System.out.printf("%04d\n", id2); // prints 0023
        System.out.printf("%04d\n", id3); // prints 0456
        System.out.printf("%04d\n\n", id4); // prints 7890, because it is already 4 digits, so it will not be padded with zeros

        System.out.printf("%4d\n", id1); // prints "   1", because it is right justified, and there are 3 spaces before the number 1
        System.out.printf("%4d\n", id2); // prints "  23", because it is right justified, and there are 2 spaces before the number 23
        System.out.printf("%4d\n", id3); // prints " 456", because it is right justified, and there is 1 space before the number 456
        System.out.printf("%4d\n\n", id4); // prints "7890", because it is already 4 digits, so it will not be padded with spaces

        System.out.printf("%-4d\n", id1); // prints "1   ", because it is left justified, and there are 3 spaces after the number 1
        System.out.printf("%-4d\n", id2); // prints "23  ", because it is left justified, and there are 2 spaces after the number 23
        System.out.printf("%-4d\n", id3); // prints "456 ", because it is left justified, and there is 1 space after the number 456
        System.out.printf("%-4d\n\n", id4); // prints "7890", because it is already 4 digits, so it will not be padded with spaces
    }
}
