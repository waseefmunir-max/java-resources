public class JavaMethodParameters {
    static void firstName(String fName) {
        System.out.println(fName + " Walker");
    }

    public static void main(String[] args) {
        firstName("Alan");
        firstName("Paul");
        firstName("John");
    }
}
