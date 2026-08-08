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
//        listFruit.remove(0); // removes "Mango" from the list by index
        listFruit.remove("Mango"); // removes "Mango" from the list by value
        System.out.println("Removed 'Mango' from the array: " + listFruit);

        System.out.println();


        // .set() method:
        listFruit.set(1, "Mango"); // replaces "Apple" with "Mango" at index 1
        System.out.println(listFruit);

        System.out.println();


        // .get() method:
        System.out.println(listFruit.get(1));

        System.out.println();


        // .size() method:
        System.out.println(listFruit.size()); // prints the size (number of elements) of the array

        System.out.println();

        listFruit.remove(1);
        listFruit.add(0, "Mango");
        listFruit.add("Banana");
        listFruit.add("Apple");
        listFruit.add("Orange");
        listFruit.add("Watermelon");
        listFruit.add("Apple");

        System.out.println("listFruit Array: \n" + listFruit);
        System.out.println();


        // .contains() method:
        System.out.println(listFruit.contains("Watermelon")); // outputs 'true' if the listFruit contains "Watermelon"

        System.out.println();


        // .indexOf and .lastIndexOf() method:

        System.out.println("Index: " + listFruit.indexOf("Watermelon")); // prints first index of Watermelon
        System.out.println("Last index of Apple: " + listFruit.lastIndexOf("Apple"));

        System.out.println();


        // Collections.sort(ArrayName) - Sorts an array alphanumerically
        System.out.println(listFruit); // prints in default (by index) order

        Collections.sort(listFruit);
        System.out.println(listFruit); // prints the elements in alphanumerical order
        System.out.println();


        // .isEmpty() method:
        System.out.println(listFruit.isEmpty()); // returns false as listFruit is not empty (even if it contains whitespaces, it won't be considered empty by .isEmpty() as .isEmpty() counts whitespaces)

        System.out.println();


        // .clear() method:
        System.out.println("Before clearing: \n" + listFruit);

        listFruit.clear(); // clearing the method

        System.out.println("After clearing: \n" + listFruit);

        System.out.println();
    }
}
