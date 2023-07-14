package projects;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter num:");
        int num = input.nextInt();
        int j = 1, k = 0;

        for (int i = 1; num >= i; i++) {
            k = j + k;
            System.out.println(k);


            i += 1;

            if (num <= i) {
                break;
            }


            j = k + j;
            System.out.println(j);

        }


    }
}
