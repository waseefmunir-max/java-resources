abstract public class Main {
    public String name = "John";
    public int age = 24;

    public abstract void study();
}

class Student extends Main {
    public void study() {
        System.out.println("Studying all day long....");
    }
}
