public class ArithmeticRLE {
    public static void main(String[] args) {
        int peopleInRoom = 0;

        System.out.println("Number of people: " + peopleInRoom);

        // 3 person enters:
        peopleInRoom++;
        peopleInRoom++;
        peopleInRoom++;
        System.out.println("Number of people: " + peopleInRoom);

        // 1 person leaves
        peopleInRoom--;
        System.out.println("Number of people: " + peopleInRoom);
    }
}
