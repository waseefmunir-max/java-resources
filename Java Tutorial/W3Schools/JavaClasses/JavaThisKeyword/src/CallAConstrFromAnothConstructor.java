public class CallAConstrFromAnothConstructor {
    int releaseYear;
    String brandName, modelName;

    public CallAConstrFromAnothConstructor(String modelName, String brandName) {
//        brandName = "Hello";
        this(2000, brandName, modelName); // Note that while calling a constructor from another constructor of same class, the calling line has to be the first line, otherwise it will throw an error
    }

    public CallAConstrFromAnothConstructor(int releaseYear, String brandName, String modelName) {

    }

    public static void main(String[] args) {

    }
}
