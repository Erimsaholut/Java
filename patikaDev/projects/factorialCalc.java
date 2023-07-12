package projects;

import java.util.Scanner;

public class factorialCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter value for calculate factorial:");
        int num = input.nextInt();
        int sum = 1;

        for (int i = 1;num>=i;i++){
            sum *= i;
        }
        System.out.println("Answer:"+ sum);


    }
}
