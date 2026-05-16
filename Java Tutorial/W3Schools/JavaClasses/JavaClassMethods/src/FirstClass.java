public class FirstClass {
    //    public static void fullThrottle() {
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public void gearNo(int x) {
        System.out.println("The car is running on gear no. " + x);
    }

    public static void main(String[] args) {
        FirstClass carObject = new FirstClass();

        carObject.fullThrottle();
        carObject.speed(180);
        carObject.gearNo(6);
    }
}
