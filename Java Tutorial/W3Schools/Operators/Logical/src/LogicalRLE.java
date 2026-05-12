public class LogicalRLE {
    public static void main(String[] args) {
        boolean isAdmin = true, isLoggedIn = true;

        System.out.println("Is regular user: " + (!isAdmin && isLoggedIn));
        System.out.println("Has access: " + (isAdmin || isLoggedIn));
        System.out.println("Not logged in: " + (!isLoggedIn));
    }
}
