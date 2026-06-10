abstract public class Main {
    public String name = "John";
    public int age = 24;

    public abstract void study();

    public void study2() { // methods can be declared (with their body) without abstract

    }

//    public abstract void animalSound(); // Will cause an error if BOTH study() and animalSound() are not implemented in the child class
}

class Student extends Main {
    public void study() {
        System.out.println("Studying all day long....");
    }
}

abstract class Animal {
    abstract void animalSound();
}

class Dog extends Animal {
    @Override
    void animalSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    void animalSound() {
        System.out.println("Meow!");
    }
}
