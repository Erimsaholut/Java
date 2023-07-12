package projects;

import java.util.Scanner;

public class harmonicSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter base num:");
        int num = input.nextInt();
        double total = 0;

        for (double i = 1; i <= num; i++) {
            total += (1 / i);
        }

        System.out.println(total);
    }
}
