public class ForEachLoops {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "Mazda", "BMW", "Toyota"};
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);
//        }
        // this loop can be replaced with this:
        for (String carFor : cars) {
            System.out.println(carFor);
        }

        System.out.println();

        // Summing up numbers in an array:
        int[] number = {2, 4, 6, 8, 10};
        int sum = 0;
//        for (int i = 0; i < number.length; i++) { // Typical way
//            sum += number[i];
//        }
        for (int numberFor : number) { // Better way
            sum += numberFor;
        }
        System.out.println(sum);
    }
}
