package projects;
import java.util.Scanner;

public class BmiCalc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your weight as kg:");
        int kg = input.nextInt();
        System.out.println("Please enter height weight as meter:");
        Double height = input.nextDouble();

        System.out.println("Your bmi is = " + kg/(height*height));



    }
}
