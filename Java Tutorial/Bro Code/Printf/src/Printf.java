public class Printf {
    public static void main(String[] args) {
        String name = "Spongebob";
        int age = 30;
        char firstLetter = 'S';
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello, %s\n", name);
        System.out.printf("Your name starts with %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("Your are %.2f inches tall\n", height);
        System.out.printf("Employed: %b", isEmployed);

        System.out.printf("%s is %d years old", name, age);
    }
}
