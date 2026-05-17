public class JavaThisKeyword {
    int x; // Initializing a variable of the class

    public JavaThisKeyword() {
        x = 5;
    }

    public static void main(String[] args) {
        JavaThisKeyword myObject = new JavaThisKeyword();

        System.out.println(myObject.x);
    }
}
