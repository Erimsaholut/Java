package arrays;

import java.util.Scanner;

public class minMaxArr {
    public static void main(String[] args) {
        int[] list = {32, 54, 786, 12, 33, -22, 43, -5};
        int min = list[0];
        int max = list[0];


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a num: ");
        int myNum = input.nextInt();
        int closestNum = list[0];


        for (int i : list) {
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
            if (Math.abs(myNum - closestNum) > Math.abs(myNum - i)) {
                closestNum = i;
            }
        }


        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
        System.out.println("Closest num: " + closestNum);

    }
}
