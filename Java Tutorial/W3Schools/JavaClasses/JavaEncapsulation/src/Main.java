public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        // This following will cause error as the fields are declared as private
//        p.name = "John";
//        p.age = 21;
//
//        System.out.println(p.name);
//        System.out.println(p.age);

        // Setting (assigning) the values to private attributes using setters:
        p.setName("John Doe");
        p.setAge(21);

        // Getting (printing) the values to private attributes using getters:
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
