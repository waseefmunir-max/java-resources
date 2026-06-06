public class StringMethod {
    public static void main(String[] args) {
        String name = "Waseef Munir";

        System.out.println(name.length());

        char letter = name.charAt(0);
        System.out.println(letter);

        int index1 = name.indexOf("e");
        int index2 = name.indexOf('s');
        int index3 = name.indexOf("e", 1); // start searching for "e" from index 1
        int index4 = name.indexOf('s', 2); // start searching for 's' from index 2
        int index5 = name.indexOf("Munir"); // returns the index of the first character of "Munir"

        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);
        System.out.println(index5);
    }
}
