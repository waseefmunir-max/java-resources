public class JavaMethodParameters {
    static void firstName(String fName) {
        System.out.println(fName + " Walker");
    }

    static void info(String firstName, int age) {
        System.out.println(firstName + " Walker," + " age: " + age);
    }

    public static void main(String[] args) {
        firstName("Alan");
        firstName("Paul");
        firstName("John");

        System.out.println();

        info("Alan", 21);
        info("Paul", 23);
        info("John", 24);
    }
}
