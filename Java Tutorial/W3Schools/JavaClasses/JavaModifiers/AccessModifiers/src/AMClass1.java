class AMClass {
    public String name = "John Doe"; // Accessible everywhere
    private int age = 25; // Accessible only in class AMClass
}

public class AMClass1 {
    public static void main(String[] args) {
        AMClass obj1 = new AMClass();

        System.out.println("Name: " + obj1.name);
//        System.out.println("Age: " + obj1.age); // Throws out an error
    }
}
