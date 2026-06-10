public class NAMClass {
    final int x = 5;
    final String name = "Alan";

    // If the method is public, then it will be accessible outside the class. Here, NAMClass2 class can access the myStaticMethod() by NAMClass.myStaticMethod()
    // If the method is private, then it will not be accessible outside the class. Here, NAMClass2 class can not access the myStaticMethod() by NAMClass.myStaticMethod()
//    private static void myStaticMethod() { // private
//    static void myStaticMethod() { // set to 'default', which won't be accessible outside the package
    public static void myStaticMethod() { // public
        System.out.println("This is a statement.");
    }

    public static void main(String[] args) {
        NAMClass namObj = new NAMClass();

//        namObj.x = 5; // Will cause an error

        System.out.println(namObj.x);
        System.out.println(namObj.name);

        // The static method can be called in two ways:
        myStaticMethod(); // Calling it directly without creating objects
        NAMClass.myStaticMethod(); // Calling it using the class name
    }
}
