import java.util.Scanner;

public class InfoAndBehaviours {
    // Attributes:
    private String name;
    private int age;
    private String departmentAndProgramme;
    private String term;

    // Methods:
    public String loginOnPortal(int loginCode) {
        if (loginCode == 1234) {
            return "You have successfully logged in";
        } else {
            return "Wrong code. Try again.";
        }
    }

    public void viewResult(){

    }
}
