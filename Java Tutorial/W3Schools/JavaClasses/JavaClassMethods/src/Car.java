public class Car {
    String brand = "Ford", model = "Mustang", numberPlate = "GW-1265";
    int maxSpeed = 240, noOfGears = 7;

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
        Car carObject = new Car();

        System.out.println("Car info: ");
        System.out.println("Name: " + carObject.brand + " " + carObject.model);
        System.out.println("Licence: " + carObject.numberPlate);
        System.out.println("Max speed: " + carObject.maxSpeed);
        System.out.println("Number of gears: " + carObject.noOfGears);
        carObject.status();
    }

    public static void main(String[] args) {
        Car carObject = new Car();

        driverInfo();
        System.out.println();
        carInfo();
    }
}
