public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        // This following will cause error as the fields are declared as private
//        p.name = "John";
//        p.age = 21;
//
//        System.out.println(p.name);
//        System.out.println(p.age);

        // Instead, we can use getters and setters
        p.setName("Alan Walker"); // calling setters because we are 'setting' a value for a field/variable
        p.setAge(24);

        System.out.println(p.getName()); // calling getters because we need to get the value to display
        System.out.println(p.getAge());
    }
}
