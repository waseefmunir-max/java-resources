public class Car {
    private final String brand = "Ford";
    private final String model = "Mustang";
    private final String numberPlate = "GW-1265";
    private final int maxSpeed = 240;
    private final int noOfTotalGears = 7;

    public void status() {
        String status = "Running as fast as it can";
        System.out.println("Status: " + status);
    }

    public static void driverInfo() {
        Driver driverObject = new Driver();

        System.out.println("Driver info: ");
        System.out.println("Name: " + driverObject.firstName + " " + driverObject.lastName);
        System.out.println("Age: " + driverObject.age);
        System.out.println("Rating: " + driverObject.rating);
    }

    public static void carInfo() {
        Car carObject = new Car(); // objects can be declared anywhere inside the class

        System.out.println("Car info: ");
        System.out.println("Name: " + carObject.brand + " " + carObject.model);
        System.out.println("Licence: " + carObject.numberPlate);
        System.out.println("Max speed: " + carObject.maxSpeed);
        System.out.println("Number of gears: " + carObject.noOfTotalGears);

        carObject.status();
    }

    public static void main(String[] args) {
        driverInfo();
        System.out.println();
        carInfo();
    }
}
