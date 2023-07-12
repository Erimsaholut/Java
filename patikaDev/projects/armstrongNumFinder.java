package projects;

import java.util.Scanner;

public class armstrongNumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = input.nextInt();
        System.out.println();
        int tNum = num, ttNum, bas = 0, total = 0;

        while (tNum != 0) {
            bas += 1;
            ;
            tNum /= 10;
        }

        tNum = num;
        while (tNum != 0) {
            ttNum = tNum % 10;
            int a = ttNum;
            for (int i = 1; i < bas; i++) {
                ttNum *= a;
            }
            total += ttNum;
            tNum /= 10;
        }
        if (total == num) {
            System.out.println(num + " is the armstrong number");
        } else {
            System.out.println(num + " isn't the armstrong number");
        }
    }
}
