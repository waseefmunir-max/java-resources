public class ArraysRLEAvgOfAges {
    public static void main(String[] args) {
//        int ages[] = {20,34,56,23,21,60,55,78,31,35};
        int[] ages = {20,34,56,23,21,60,55,78,31,35};
        int sum = 0;
        for (int agesFor : ages) {
            sum += agesFor;
        }

        float avg = (float) sum / ages.length;

        System.out.println("The average age is: " + avg);
//        System.out.printf("The average age is: %.2f", avg);
    }
}
