// This class has no relation with Car.java and Driver.java

public class CarSample {
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
        CarSample carSampleObject = new CarSample();

        carSampleObject.fullThrottle();
        carSampleObject.speed(180);
        carSampleObject.gearNo(6);
    }
}
