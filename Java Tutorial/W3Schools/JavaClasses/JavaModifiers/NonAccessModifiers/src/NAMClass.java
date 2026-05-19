public class NAMClass {
    final int x = 5;
    final String name = "Alan";

    static void myMethod() {
        System.out.println("This is a statement.");
    }

    public static void main(String[] args) {
        NAMClass namObj = new NAMClass();

//        namObj.x = 5; // Will cause an error

        System.out.println(namObj.x);
        System.out.println(namObj.name);

        // The static method can be called in two ways:
        myMethod();
        NAMClass.myMethod();
    }
}
