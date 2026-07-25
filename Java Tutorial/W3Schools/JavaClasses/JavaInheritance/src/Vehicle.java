//final class Vehicle { // you cannot inherit from a final class
class Vehicle {
    protected final String brandName = "BMW";

    public void horn() {
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private final String modelName = "M3 GTR";

    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.brandName + " " + car.modelName);
        car.horn();
    }
}
