import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        DogGenetics app = new DogGenetics();
        app.run();
    }

    void run(){
        Scanner sc = new Scanner(System.in);
        String[] dog_breeds = {"Labrador", "Poodle", "Pug", "Pomeranian", "Poodle", "St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Poodle", "Common Cur"};
        List<String> dog_breeds_list = new ArrayList<>(List.of(dog_breeds));
        int[] percentages = new int[5];
        float sum = 0;
        int newsum = 0;
        String dog_name;
        Random rand = new Random();

        System.out.print("What is your dog's name? ");
        dog_name = sc.next();
        System.out.println("Well then, I have this highly reliable report on "+ dog_name +"'s prestigious background right here.");
        System.out.println();
        System.out.println(dog_name +" is:");
        System.out.println();
        System.out.println();
        for (int i = 0; i < 5; i++) {
            percentages[i] = rand.nextInt(98) + 1;;
            sum += percentages[i];
        }
        for (int i = 0; i < 5; i++) {
            float temp = ((float)percentages[i] / (float)sum) * 100;
            percentages[i] = (int)temp;
            newsum += percentages[i];
        }
        if(newsum != 100){
            percentages[4] += 100 - newsum;
        }
        for (int i = 0; i < 5; i++) {
            int x = rand.nextInt(dog_breeds_list.size());
            System.out.println(dog_breeds_list.remove(x) + ": " + percentages[i] + "%");
        }

        System.out.println("\nWow, that's QUITE the dog!");
    }
}