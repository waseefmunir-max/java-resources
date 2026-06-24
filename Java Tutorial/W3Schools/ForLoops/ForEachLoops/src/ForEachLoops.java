public class ForEachLoops {
    public static void main(String[] args) {

        int[] number = {10, 20, 30, 40, 50};

        // Tips: Reduce a third bracket from the array when writing the array as a condition inside the parenthesis of for-each loop.
        // In the following, number is of type int[]. But when written inside the parenthesis of the for-each loop, we remove a [], thus the type of number becomes int. Also, numberArr is also of type int. So both type matches and compiler doesn't throw an error
        for (int numberArr : number) {
            System.out.println(numberArr);
        }

        // Same goes for 2D arrays:
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // matrix of int[][] type, so it becomes int[]:
        for (int[] matrixArr1 : matrix) {
            // matrixArr1 is of int[] type, so it becomes int:
            for (int matrixArr2 : matrixArr1) {
//                System.out.println(matrixArr1); // Will print memory address because it is of type int[] (array), and array indicates memory address
                System.out.print(matrixArr2 + " ");
            }
            System.out.println();

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
            int[] numbers = {2, 4, 6, 8, 10};
            int sum = 0;
//        for (int i = 0; i < number.length; i++) { // Typical way
//            sum += number[i];
//        }
            for (int numberFor : numbers) { // Better way
                sum += numberFor;
            }
            System.out.println(sum);

            System.out.println();

            // Printing multiplication of numbers in an array:
            int multiplication = 1;
            int[] numBer = {1, 2, 3, 4, 5};
            for (int numBerFor : numBer) {
                multiplication *= numBerFor;
            }
            System.out.println(multiplication);

        }
    }
}
