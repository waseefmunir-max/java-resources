import java.util.ArrayList;
import java.util.Collections;

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

        for (String lF : listFruit) {
            System.out.println(lF);
        }

        System.out.println();

        // .remove() method:
        listFruit.remove(0); // removes "Mango" from the list
        System.out.println(listFruit);

        // .set() method:
        listFruit.set(1, "Mango"); // replaces "Apple" with "Mango" at index 1
        System.out.println(listFruit);

        // .get() method:
        System.out.println(listFruit.get(1));

        // .size() method:
        System.out.println(listFruit.size()); // prints the size (number of elements) of the array

        // Collections.sort(ArrayName) - Sorts an array alphanumerically
        listFruit.remove(1);
        listFruit.add(0, "Mango");
        listFruit.add("Banana");
        listFruit.add("Orange");
        listFruit.add("Apple");

        System.out.println(listFruit); // prints in default (by index) order

        Collections.sort(listFruit);
        System.out.println(listFruit); // prints the elements in alphanumerical order
    }
}
