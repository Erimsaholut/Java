package projects;

import java.util.Scanner;

public class biggestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers will you enter ?");
        int numC = input.nextInt();
        int biggestNum = 0, smallestNum = 0, tNum;

        for (int i = 0; numC > i; i++) {
            System.out.println("Enter the " + (i + 1) + ". number: ");
            tNum = input.nextInt();
            if (i == 0) {
                biggestNum = tNum;
                smallestNum = tNum;
            }
            biggestNum = (tNum > biggestNum) ? tNum : biggestNum;
            smallestNum = (tNum < smallestNum) ? tNum : smallestNum;
        }
        System.out.println("Biggest number is " + biggestNum);
        System.out.println("Smallest number is " + smallestNum);
    }
}
