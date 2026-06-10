public class JavaThisKeyword {
    int x; // Initializing a variable of the class

    public JavaThisKeyword(int x) {
//        x = x; // Here, Java thinks it as both are 'parameter x', not the class's x
        // To indicate the class/object's x, we use 'this' keyword:
        this.x = x; // Sets the value of 'parameter x' into the 'class/object's x'
    }

    public static void main(String[] args) {
        JavaThisKeyword myObject = new JavaThisKeyword(2);

        System.out.println(myObject.x);
    }
}
