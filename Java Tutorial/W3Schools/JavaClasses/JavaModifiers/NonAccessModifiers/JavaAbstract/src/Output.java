public class Output {
    public static void main(String[] args) {
        Student s = new Student(); // creating student object

        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
        System.out.print("Status: ");
        s.study();

        System.out.println("Animal sounds: ");

    }
}
