public class JavaConstructors {
    int x, a;

    String firstName, lastName;
    int agePerson;

    String brandName, modelName;
    int yearReleased;

    // Constructors are special types of methods that are used to initialize objects
    public JavaConstructors(int y) {
        x = 5;
        a = y;
    }

    // We can have multiple constructors in a class, and they can be overloaded, which means that they can have different parameters, and we can use them to initialize different variables of the class

    //     For example, a constructor for a person's full name:
    public JavaConstructors(String fName, String lName) {
        firstName = fName;
        lastName = lName;
    }
//    public JavaConstructors(String fName, String lName, int age) {
//        firstName = fName;
//        lastName = lName;
//        agePerson = age;
//    } // Causes an error because both constructors have the same number of parameters, and the compiler cannot determine which constructor to use when we create an object of the class.
    // To fix this error, we can either change the number of parameters in one of the constructors, or we can change the data type of one of the parameters in one of the constructors, so that the compiler can determine which constructor to use when we create an object of the class.

    // A constructor about a car's info:
    public JavaConstructors(String brand, String model, int year) {
        brandName = brand;
        modelName = model;
        yearReleased = year;
    }

    public static void main(String[] args) {
//        JavaConstructors myObj = new JavaConstructors(); // Constructor is called when the object is created, and it initializes the value of x to 5
        JavaConstructors myObj = new JavaConstructors(6); // Here, it initializes the value of x to 5 and a to 6, because we have passed 6 as an argument to the constructor, which is mandatory, otherwise it will give an error because we have defined a constructor that takes an integer as an argument, and we have to pass an integer when we create an object of the class
        System.out.println(myObj.x);

//        JavaConstructors nameObj = new JavaConstructors("Loren", "Ipsum", 21);
        JavaConstructors nameObj = new JavaConstructors("Loren", "Ipsum");
        System.out.println("Name: " + nameObj.firstName + " " + nameObj.lastName);

        JavaConstructors carObj = new JavaConstructors("Ford", "Mustang", 1969);
        System.out.println("Car: " + carObj.brandName + " " + carObj.modelName + " (" + carObj.yearReleased + ")");
    }
}
