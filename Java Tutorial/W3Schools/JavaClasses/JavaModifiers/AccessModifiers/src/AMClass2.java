public class AMClass2 {
    public static void main(String[] args) {
        AMClass1 object1 = new AMClass1(); // AMClass1 is accessible from here
        System.out.println(object1.name);
        System.out.println(object1.agePublic);

        System.out.println();

        AMClass object = new AMClass(); // AMClass wil also be accessible, but there's a catch
        System.out.println(object.name); // 'name' will be accessible as it is declared as a public access modifiers
//        System.out.println(object.agePrivate); // 'agePrivate' won't be accessible as it is declared as a private access modifiers
    }
}
