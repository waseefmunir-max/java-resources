public class NestedIfRLE {
    public static void main(String[] args) {
        int minAge = 18, userAge = 20;
//        boolean isCitizen = true;
        boolean isCitizen = false;

        if (userAge >= minAge) {
            if (isCitizen) {
                System.out.println("You are a citizen and eligible to vote!");
            } else {
                System.out.println("You are not a citizen");
            }
        } else {
            System.out.println("You are not old enough to vote");
        }
    }
}

