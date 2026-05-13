public class JavaStrings1 {
    public static void main(String[] args) {
        String text = "Hello World";
        System.out.println(text);

        //String.length():
        System.out.println("Hello!".length()); // Finds out the size (total number of characters) of the string
        System.out.println("Size of the string is: " + text.length());

        // String.toupper(), String.tolower():
        String loweredText = "i am ALAN who lives in texas";
        String upperedText = "HE IS DRIVING too FAST";

        System.out.println("abc".toUpperCase()); // Converts to uppercase
        System.out.println("EFG".toLowerCase()); // Converts to lowercase
        System.out.println(loweredText.toUpperCase());
        System.out.println(upperedText.toLowerCase());

        // String.indexOf("target_string"):
        System.out.println("Hello there! Hope you are doing well".indexOf("you"));

        String newText = "In which index word is located?";
        System.out.println(newText.indexOf("word"));

        String food = "Burger pizza hotdog";
        System.out.println("Index of pizza: " + food.indexOf("pizza"));
        System.out.println("Index of pizza: " + food.indexOf("sharma")); // outputs -1 (or any negative number) if the target string is not found in the main string

        // Note that the index always starts frm 0

        // String.charAt(INDEX_NUMBER):
        System.out.println("Morning!".charAt(2)); // Use String.charAt(INDEX_NUMBER) to find out the character at a specific index number in the string
        System.out.println("Morning!".indexOf('r')); // Use String.indexOf('target_character') to find out the index number of a specific character in the string. It will return the index number of the first occurrence of the target character in the string

        String car = "Mustang";
        System.out.println(car.charAt(3));
        System.out.println(car.indexOf('t'));
    }
}
