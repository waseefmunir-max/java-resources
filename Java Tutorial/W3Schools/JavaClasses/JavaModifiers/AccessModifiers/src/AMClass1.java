public class AMClass1 {
    public String name = "John Doe"; // Accessible everywhere
    private int age = 25; // Accessible only in class AMClass1

    public static void main(String[] args) {
        AMClass1 obj1 = new AMClass1();

        System.out.println("Name: " + obj1.name);
        System.out.println("Age: " + obj1.age);
    }
}

class AMClass11 {

}
