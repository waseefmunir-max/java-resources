public class First {
    int x = 5;
    int y = 6;
    final double PI = 3.14159;

    public static void main(String[] args) {
        First myObject1 = new First(); // creating an object
        First myObject2 = new First(); // creating another object

        System.out.println(myObject1.x); // accessing the value of x through the first object (myObject1)
        System.out.println(myObject2.x); // accessing the value of x through the second object (myObject2)
    }
}
