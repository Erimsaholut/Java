package projects;
import java.util.Scanner;

public class groceryStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much pear did you buy : ");
        int pearKg = input.nextInt();
        System.out.println("How much apple did you buy : ");
        int appleKg = input.nextInt();
        System.out.println("How much tomato did you buy : ");
        int tomatoKg = input.nextInt();
        System.out.println("How much banana did you buy : ");
        int bananaKg = input.nextInt();
        System.out.println("How much eggplant did you buy : ");
        int eggplantKg = input.nextInt();

        System.out.println("Total : $"+ (pearKg*2.14+appleKg*3.67+tomatoKg*1.11 +bananaKg*0.95 +eggplantKg*5));

    }
}
