package projects;

import java.util.Scanner;

public class javaLoop3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter value");
        int num = input.nextInt();

//        for(int i=0;num>=i;i++ ){
//            System.out.println("2^"+i+" --> "+Math.pow(2,i));
//        }

        for (int i = 0; num >= i; i++) {
            for(int j=0;j<i;j++){
                System.out.println(j*=2);
            }
        }



    }
}
