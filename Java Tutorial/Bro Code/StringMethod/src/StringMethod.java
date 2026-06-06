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
        System.out.println();


        // lastIndex()
        int index6 = name.lastIndexOf('e');
        int index7 = name.lastIndexOf("e");

        System.out.println(index6);
        System.out.println(index7);
        System.out.println();


        // toUppercase() and toLowerCase()
        String index8 = name.toUpperCase();
        String index9 = name.toLowerCase();

        System.out.println(index8);
        System.out.println(index9);
        System.out.println();


        // trim()
        String text1 = "Hello world!";
//        String text2 = "                       Loren Ipsum           ";
        String text2 = "                       Loren             Ipsum           ";

        text1 = text1.trim();
        text2 = text2.trim();

        System.out.printf("|%s|\n", text1);
        System.out.printf("|%s|\n", text2);
        System.out.println();


        // replace()
        String nameType = "Human";

        nameType = nameType.replace('u', 'o');
//        nameType = nameType.replace("u", "o"); // Both works fine

        System.out.println(nameType);
        System.out.println();
    }
}
