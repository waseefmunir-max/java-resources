public class CallAConstrFromAnothConstructor {
    private final int releaseYear;
    private final String brandName;
    private final String modelName;

    public CallAConstrFromAnothConstructor(String brandName, String modelName) {
//        brandName = "Hello"; // This line will cause an error
        // Calling the 3-parameterized constructor:
        this(2000, brandName, modelName); // Calling the constructor with 3 parameters from the constructor with 2 parameters. Here, we are passing the value of releaseYear as 2000, and the values of brandName and modelName are being passed from the parameters of this constructor.
        // Note that while calling a constructor from another constructor of same class, the calling line has to be the first line, otherwise it will throw an error

        // Or declaring values here, like this:
//        this.releaseYear = 2000;
//        this.brandName = brandName;
//        this.modelName = modelName;
    }

    public CallAConstrFromAnothConstructor(int releaseYear, String brandName, String modelName) {
        this.releaseYear = releaseYear;
        this.brandName = brandName;
        this.modelName = modelName;
    }

    public void printCarInfo() {
        // As we have already put the parameter values of releaseYear, brandName and modelName, we can now use them directly.
        System.out.println("Car: " + brandName + " " + modelName + " (" + releaseYear + ")");
    }

    public static void main(String[] args) {
        CallAConstrFromAnothConstructor carObj1 = new CallAConstrFromAnothConstructor("BMW", "GTR"); // It will call the 1st constructor (at line 6)

        CallAConstrFromAnothConstructor carObj2 = new CallAConstrFromAnothConstructor(1969, "Ford", "Mustang"); // It will call the 2nd constructor (at line 12)

        carObj1.printCarInfo();
        carObj2.printCarInfo();
    }
}
