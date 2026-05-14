public class MultidimArrays {
    public static void main(String[] args) {
        int[][] number = {{2, 4, 6, 8}, {1, 3, 5, 7}};
        for (int numberFor1[] : number) {
            for (int numberFor2 : numberFor1) {
                System.out.print(numberFor2 + " ");
            }
            System.out.println();
        }
    }
}
