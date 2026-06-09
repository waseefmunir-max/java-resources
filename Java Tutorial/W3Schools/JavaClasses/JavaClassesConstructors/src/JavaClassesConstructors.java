// A constructor in Java is a special method that is used to initialize objects.
// The constructor is called when an object of a class is created.
// It can be used to set initial values for object attributes
// Note that the constructor name must match the class name, and it cannot have a return type (like void).

public class JavaClassesConstructors {
    private final int x;

    //    public JavaClassesConstructors() {
    public JavaClassesConstructors(int y) {
//        x = 5;
        x = y;
    }

    public static void main(String[] args) {
        JavaClassesConstructors myObj = new JavaClassesConstructors(5);

//        System.out.println(myObj.x);
        System.out.println(myObj.x);
    }
}
