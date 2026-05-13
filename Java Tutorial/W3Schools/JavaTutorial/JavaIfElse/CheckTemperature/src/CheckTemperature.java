public class CheckTemperature {
    public static void main(String[] args) {
        float temperature = 25.5f;

        if (temperature <= 0.0f) {
            System.out.println("It's freezing!");
        } else if (temperature > 0.0f && temperature <= 20.0f) {
            System.out.println("It's cold");
        } else {
            System.out.println("It's warm");
        }
    }
}
