import java.util.Random; // import the Random class

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random(); // Creating an object 'random' for 'Random' class

        int randomNumber1 = random.nextInt(); // generates a random number of type int, in the range of -2,147,483,648 to 2,147,483,647
        int randomNumber2 = random.nextInt(6); // generates a random number of type int, in the range of 0 to 5 (6 is exclusive, so it will not be included in the range)
        int randomNumber3 = random.nextInt(1, 7); // generates a random number of type int, in the range of 1 to 6 (7 is exclusive, so it will not be included in the range, where 1 is inclusive, so it will be included in the range)

        double randomDouble = random.nextDouble(); // We can generate random numbers for doubles also

        System.out.println(randomNumber1);
        System.out.println(randomNumber2);
        System.out.println(randomNumber3);

        System.out.println(randomDouble);
    }
}
