public class JavaTypeCastingRLE {

    public static void main(String[] args) {

        int maxScore = 2000;
        int userScore = 1234;

        double scorePercentage = (double) userScore / maxScore * 100;

        System.out.println("User score percentage: " + scorePercentage);
    }
}
