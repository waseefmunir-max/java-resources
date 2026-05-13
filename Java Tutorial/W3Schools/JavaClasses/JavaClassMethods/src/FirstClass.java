public class FirstClass {
//    public static void fullThrottle() {
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        FirstClass myObject = new FirstClass();

        myObject.fullThrottle(); // calling methods just like  variables
        myObject.speed(180);

    }
}
