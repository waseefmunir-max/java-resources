public class LogicalOperatorsRLE {
    public static void main(String[] args) {
        boolean isLoggedIn = true, isAdmin = false;

        int securityLevel = 3;

        if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }
}
