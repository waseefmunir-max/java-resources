public class ArraysRLEFindLowestAge {
    public static void main(String[] args) {
        int[] ages = {31, 33, 18, 34, 56, 23, 21, 60, 55, 78, 31, 35};
        int lowestAge = ages[0];
        for (int agesFor : ages) {
            if (agesFor < lowestAge) {
                lowestAge = agesFor;
            }
        }
        System.out.println("The lowest age in the array is: " + lowestAge);
    }
}
