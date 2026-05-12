public class JavaArrays {
    public static void main(String[] args) {
        String[] cars = {"BMW", "Mazda", "McLaren", "Lamborghini", "Bugatti"};
        for (int i = 0; i < 5; i++) {
            System.out.println(cars[i]);
        }

        int[] primeNumber = {2, 3, 5, 7, 11, 13};
        for (int i = 0; i < 5; i++) {
            System.out.println(primeNumber[i]);
        }

        System.out.println();

        // length keyword:
        System.out.println("Length of cars array: " + cars.length);
        System.out.println("Length of primeNumber array: " + primeNumber.length);
        System.out.println();

        // new keyword:
//        String[] classSCars = new String[4];
//
//        classSCars[0] = "Koenigsegg";
//        classSCars[1] = "Ferrari";
//        classSCars[2] = "BMW";
//        classSCars[3] = "Lamborghini";
//
//        for (int i = 0; i < classSCars.length; i++) {
//            System.out.println(classSCars[i]);
//        }

        // The array can be declared like this:
//        String[] classSCars = new String[] {"Koenigsegg", "Ferrari", "BMW", "Lamborghini"};

        // But it's most common to write in the usual way:
        String[] classSCars = {"Koenigsegg", "Ferrari", "BMW", "Lamborghini"};

        for (int i = 0; i < classSCars.length; i++) {
            System.out.println(classSCars[i]);
        }

        // Arrays can be declared in C-style way:
        String mobiles[] = {"Samsung", "Xiaomi", "Oppo", "Realme"};
        for (String mobileFor : mobiles) {
            System.out.println(mobileFor);
        }
    }
}