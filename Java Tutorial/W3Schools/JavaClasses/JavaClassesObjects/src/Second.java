public class Second {
    int z = 7;

    public static void main(String[] args) {
        First myObj1 = new First(); // Accessing the 'First' class
        Second myObj2 = new Second(); // Accessing the 'Second' class
        First myObj3 = new First();

        System.out.println(myObj1.y);
        System.out.println(myObj2.z);

        myObj1.y = 60;
        myObj2.z = 80;

        System.out.println(myObj1.y);
        System.out.println(myObj2.z);

//        myObj3.PI = 4.14159; // causes an error
    }
}
