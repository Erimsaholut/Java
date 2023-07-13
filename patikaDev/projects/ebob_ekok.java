package projects;

import java.util.Scanner;

public class ebob_ekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number 1:");
        int num1 = input.nextInt();

        System.out.println("Please enter number 2:");
        int num2 = input.nextInt();

        for (int i = num1; i > 0; i--) {
            if (num2 % i == 0 && num1 % i == 0) {
                System.out.println(i);
                break;
            }
        }


        int max = (num1>num2)?num1:num2;
        int Tmax = max;

        while (true) {
            if (Tmax % num1 == 0 && Tmax % num2 == 0) {
                System.out.println(Tmax);
                break;
            } else {
                Tmax += max;
            }
        }



    }
}
