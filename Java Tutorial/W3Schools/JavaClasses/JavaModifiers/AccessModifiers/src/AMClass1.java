class AMClass {
    public String name = "John Doe"; // Accessible everywhere
    private int age = 25; // Accessible only in class AMClass
}

public class AMClass1 {
    public String name = "Loren Ipsum";
    public int age = 24;

    public static void main(String[] args) {
        AMClass obj = new AMClass();
        AMClass1 obj1 = new AMClass1();

        System.out.println("Name: " + obj.name);
//        System.out.println("Age: " + obj.age); // Throws out an error
        System.out.println("Name: " + obj1.name);
        System.out.println("Age: " + obj1.age);
    }
}
