public class DataTypes {
    public static void main(String[] args){
        // Primitive and Non-primitive data types:
        // primitive data type: value  নিজেই ধরে রাখে।
        // Non-primitive data type: object কোথায় আছে সেটার reference ধরে রাখে।
        // Primitive types in Java are predefined and built into the language, while non-primitive types are created by the programmer (except for String).
        // Non-primitive types can be used to call methods to perform certain operations, whereas primitive types cannot.
        // **VERY IMPORTANT** Primitive types start with a lowercase letter (like int), while non-primitive types typically starts with an uppercase letter (like String).
        // Primitive types always hold a value, whereas non-primitive types can be null.

        // Data types in Java:
        // byte: 8-bit signed integer (2^8 = 256 possible values, ranging from -128 to 127)
        // short: 16-bit signed integer (2^16 = 65,536 possible values, ranging from -32,768 to 32,767)
        // int: 32-bit signed integer (2^32 = 4,294,967,296 possible values, ranging from -2,147,483,648 to 2,147,483,647)
        // long: 64-bit signed integer (2^64 = 18,446,744,073,709,551,616 possible values, ranging from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        // float: 32-bit floating-point number (single precision, approximately 6-7 decimal digits of precision)
        // double: 64-bit floating-point number (double precision, approximately 15-16 decimal digits of precision)
        // char: 16-bit Unicode character (stores a single character, such as a letter, number, or symbol)
        // boolean: stores a value of true or false (used for simple flags that track true/false conditions)
        // String: a sequence of characters (used to store text, and is a non-primitive data type)
        byte num = 123; // Stores whole numbers from -128 to 127
        short Num = 30720; // Stores whole numbers from -32,768 to 32,767
        int NUM = 1234567890; // Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long number = 1234567890123456789L; // Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807, but it is recommended to end the value with an "L" (e.g., 1234567890L) to indicate that it is a long literal
        float nu_mber = 1234567890.1234567890f; // Stores decimal numbers with single precision (6-7 digits), and it is recommended to end the value with an "f" (e.g., 123.45f) to indicate that it is a float literal
        float num2 = 1234567.678902345678f;
        float num3 = 12345678.678902345678f;
        double num_ber = 1234567890.678901234567890d; // Stores decimal numbers with double precision (15-16 digits). Also make sure to end the value with a "d" (e.g., 123.45d) to indicate that it is a double literal, although this is optional since double is the default for decimal literals
        char symbol = '~'; // Stores a single character (letter, number, or symbol) and must be enclosed in single quotes (e.g., 'A', '1', '$')
        boolean isOkay = false; // Stores a value of true or false, and is used for simple flags that track true/false conditions
        String name = "Waseef";

        System.out.println(num);
        System.out.println(Num);
        System.out.println(NUM);
        System.out.println(number);
        System.out.println(nu_mber);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num_ber);
        System.out.println(symbol);
        System.out.println(isOkay);
        System.out.println(name);
    }
}
