public class MultidimArrays {
    public static void main(String[] args) {
        int[][] myNumbers = {{1, 3, 5}, {2, 4, 6, 8, 10}};

        System.out.println("Rows: " + myNumbers.length);
        System.out.println("Column 1: " + myNumbers[0].length);
        System.out.println("Column 2: " + myNumbers[1].length);

        System.out.println();

        int[][] number = {{2, 4, 6, 8}, {1, 3, 5, 7}};


//        for (int[] numberFor1 : number) {
//            for (int numberFor2 : numberFor1) {
//                System.out.print(numberFor2 + " ");
//            }
//            System.out.println();
//        }
    }
}
