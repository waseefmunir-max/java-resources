public class Variables {
    public static void main(String[] args){
        String name = "Waseef Munir";
        String firstname = "John";
        String lastname = "Doe";
        int age = 20;
        float pi = 3.14159f;
        double temperature = 25.56;
        char letter = 'A';
        char symbol = '$';
//        boolean CheckResult = 1; // Not acceptable
        boolean CheckResult = true;

        int x = 5, y = 6;
        
        final double PI = 3.14159; // 'final' acts like 'const' in c
//        PI = 3.14; // Causes an error

        System.out.println(name);
        System.out.println(age);
        System.out.println(pi);
        System.out.println(temperature);
        System.out.println(letter);
        System.out.println(symbol);
        System.out.println(CheckResult);
        System.out.println(PI);

        System.out.println(firstname + " " + lastname + ", age " + age);
        System.out.println("x = " + x + ", y = " + y + ", x + y = " + (x + y));
    }
}
