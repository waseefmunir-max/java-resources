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

        System.out.println(car.modelName + " " + car.brandName);
        car.horn();
    }
}
