import java.util.Scanner;

public class HealthyHeartRateCalculator {
    public static void main(String[] args) {
        HealthyHeartRateCalculator app = new HealthyHeartRateCalculator();
        app.run();
    }

    void run() {
        int age;
        int target_heart_rate;
        int max_heart_rate;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.println("Your maximum heart rate should be " + (220-age) + " beats per minute\n" +
                "Your target HR Zone is "+ percentage(age,50) +" - "+ percentage(age,85) +" beats per minute");
    }

    int percentage(float age, float percentage) {
        return Math.round((220-age) * percentage / 100);
    }
}
