public class ShortHandIfElse {
    public static void main(String[] args) {
        int minAge = 18, userAge = 20;
//        if (userAge >= minAge) {
//            System.out.println("You are eligible to vote!");
//        } else {
//            System.out.println("You are not old enough to vote");
//        }

        // printing using shorthand if else, without separate variable:
        System.out.println((userAge >= minAge) ? "You are eligible to vote!" : "You are not old enough to vote");

        // printing using shorthand if else, with separate variable (recommended):
        String msg = (userAge >= minAge) ? "You are eligible to vote!" : "You are not old enough to vote";
        System.out.println(msg);

        System.out.println();

        // Note: Use shorthand if-else without separate variable, as it is more convenient to work with multiple data types
//        int num = 85;
//        int num = 75;
        int num = 65;

        System.out.println((num >= 80) ? "A+" // Data type: String
                : (num >= 70 && num <= 79) ? 'A' // Data type: Char
                  : (num >= 60 && num <= 69) ? 66 // Data type: int (though it's expected to print 'B', it prints 66, which is the ASCII value of 'B', because the data type of the previous and next values is not the same as char, so it converts char to int)
//                : (num >= 60 && num <= 69) ? 'B'
                    : (num >= 50 && num <= 59) ? 'C' : (num >= 60 && num <= 69) ? 'D' : 'F');

        // In the example below, the output will always be of int data type, because the value of all branches is of int data type
        int x = 5;
        System.out.println((x < 7) ? 65 : (x == 5) ? 66 : 71);
    }
}
