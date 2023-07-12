package projects;

import java.util.Scanner;

public class UssuSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter base num:");
        int num = input.nextInt();

        System.out.println("Please enter pow num:");
        int pow = input.nextInt();
        int total = num;

        for (int i = 1; pow > i; i++) {
            total *= num;

        }
        System.out.println(total);
    }
}
