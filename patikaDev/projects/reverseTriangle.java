package projects;

import java.util.Scanner;

public class reverseTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter num:");
        int num = input.nextInt();


        for(int i = 0;i<num+1;i++){

            for(int j = 0;j<=i*2;j++){
                System.out.print(" ");
            }

            for(int k = (num-i)*4;k>=0;k--){
                System.out.print("*");
            }

            System.out.print("\n");


        }




    }
}



