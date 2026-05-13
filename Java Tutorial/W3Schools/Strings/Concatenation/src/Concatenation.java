public class Concatenation {
    public static void main(String[] args) {
        String firstName = "Waseef";
        String lastname = "Munir";
        String str = " World!";
        int age = 20;

        System.out.println("Hello" + str);
        System.out.println(firstName + " " + lastname);
        System.out.println(firstName + " " + lastname + ", " + age + " years old.");

        String text1 = "Hi ";
        String text2 = "there!";
        System.out.println(text1.concat(text2)); // Combining two strings

        String text3 = "Hope ";
        String text4 = "you ";
        String text5 = "are ";
        String text6 = "doing ";
        String text7 = "well";

        System.out.println(text3.concat(text4).concat(text5).concat(text6).concat(text7)); // Combining multiple strings

        // Special characters:
        System.out.println("I like\nkacchi!");
        System.out.println("Hello \t there!");
        System.out.println("File is loacted at: C:\\Users\\Admin\\Desktop");
        System.out.println("We call him \"Johnny\"");
//        System.out.println("Put the \'pen\' on the table"); // Shows a warning
        System.out.println("Put the 'pen' on the table");
    }
}
