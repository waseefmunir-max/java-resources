public class JavaMethodParameters {
    static void firstName(String firstName) {
        System.out.println(firstName + " Walker");
    }

    static void info(String firstName, int age) {
        System.out.println(firstName + " Walker," + " age: " + age);
    }

    static void checkAge(int age) {
        if (age >= 18 && age <= 60) {
            System.out.println("You are eligible to vote!");
        } else if (age > 60) {
            System.out.println("You are a senior citizen");
        } else {
            System.out.println("You are not old enough to vote");
        }
    }

    public static void main(String[] args) {
        firstName("Alan");
        firstName("Paul");
        firstName("John");

        System.out.println();

        info("Alan", 21);
        info("Paul", 23);
        info("John", 24);

        System.out.println();

        checkAge(20);
        checkAge(70);
        checkAge(10);
    }
}
