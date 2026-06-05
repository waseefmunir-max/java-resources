public class SoutTraps {
    public static void main(String[] args) {
        System.out.println(5 + 10); // prints 15
        System.out.println("Amount: " + 5 + 10); // prints 510, because of the order of operations, it first concatenates "Amount: " with 5, which results in "Amount: 5", and then concatenates that with 10, which results in "Amount: 510"
        // To fix this, we can use parentheses to change the order of operations:
        System.out.println("Amount: " + (5 + 10)); // prints "Amount: 15", because the parentheses force the addition to be performed before the concatenation, so it first calculates 5 + 10, which results in 15, and then concatenates that with "Amount: ", which results in "Amount: 15"
    }
}
