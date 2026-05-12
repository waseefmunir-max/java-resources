public class TheVarKeyword {
    public static void main(String[] args) {
        // 'var' is a keyword that auto-detects the data type of the variable based on the value assigned to it.
        var num = 5;
//        num = 5.6; // Changing pre-declared data types to another are not allowed
        var num1 = 1234567890123456789L;
        var num2 = 12345.6789123f;
        var num3 = 1234567890.123456789d;
        var letter1 = 'A';
        var letter2 = 'b';
        var letter3 = 65; // Prints 65, not 'A'
        var Str = "Hello there!";
        var FactCheck = true;

        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(letter3);
        System.out.println(Str);
        System.out.println(FactCheck);
    }
}
