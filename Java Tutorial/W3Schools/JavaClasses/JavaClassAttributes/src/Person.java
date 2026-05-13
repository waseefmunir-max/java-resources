public class Person {
    String firstName = "John";
    String lastName = "Doe";
    int age = 21;

    public static void main(String[] args) {
        Person personObject = new Person();

//        System.out.println("First name: " + personObject.firstName);
//        System.out.println("Last name: " + personObject.lastName);
        System.out.println("Name: " + personObject.firstName + " " + personObject.lastName);
        System.out.println("Age: " + personObject.age);
    }
}
