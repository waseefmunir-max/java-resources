public class Main {
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    public void maxSpeed(int x) {
        System.out.println("Max speed is: " + x);
    }
}

class Second {
    public static void main(String[] args) {
        Main carObject = new Main();

        carObject.fullThrottle();
        carObject.maxSpeed(200);
    }
}
