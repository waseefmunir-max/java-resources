import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> listIntegers = new ArrayList<>();

        listIntegers.add(2);
        listIntegers.add(4);
        listIntegers.add(6);

        System.out.println(listIntegers);
        System.out.println();


        ArrayList<Double> listDouble = new ArrayList<>();

        listDouble.add(1.5);
        listDouble.add(2.0);
        listDouble.add(2.5);

        System.out.println(listDouble);
        System.out.println();


        ArrayList<String> listFruit = new ArrayList<>();

        listFruit.add("Mango");
        listFruit.add("Watermelon");
        listFruit.add("Apple");

        System.out.println(listFruit);

        for (String lF: listFruit) {
            System.out.println(lF);
        }

        System.out.println();


    }
}
