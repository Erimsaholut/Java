package projects;

import java.util.Scanner;

public class javaLoops2 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        while (i > 0){
            System.out.println("enter value");
            if (i % 2 == 1) {
                sum += i;
            }
            i = input.nextInt();
        }

        System.out.println("Sum:");
        System.out.println(sum);
    }
}
