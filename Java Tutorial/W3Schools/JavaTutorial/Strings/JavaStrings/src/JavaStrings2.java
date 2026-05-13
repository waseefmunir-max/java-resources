public class JavaStrings2 {
    public static void main(String[] args) {
        // String1.equals(String2): compares the content of two strings and returns true if they are equal, false otherwise.
        System.out.println("Hi".equals("Hi")); // prints true
        System.out.println("Hi".equals("there!")); // prints true
        System.out.println();

        String txt1 = "hello";
        String txt2 = "hello";
        String txt3 = "hello there";
        String txt4 = "hello world!";

        System.out.println(txt1.equals(txt2));
        System.out.println(txt3.equals(txt4));

        System.out.println();

        // String.trim(): removes any leading and trailing whitespace (not any whitespaces from middle) from a string.
        System.out.println("     Hello there!    ".trim());
        String text1 = "         Wha    t's      up  ?        ";
        System.out.println("Without trim: |" + text1 + "|");
        System.out.println("With trim: |" + text1.trim() + "|");
    }
}
