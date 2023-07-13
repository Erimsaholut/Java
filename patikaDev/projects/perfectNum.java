package projects;

import java.util.Scanner;

public class perfectNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num1 = input.nextInt();
        int num2 = 0;

        for (int i = 1; num1 > i; i++) {
            if (num1 % i == 0) {
                num2 += i;
            }
        }
        if (num1 == num2) {
            System.out.println(num1 + " is a perfect number");
        } else {
            System.out.println(num1 + " isn't a perfect number");
        }
    }
}
