package loops;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for(int i =10;i>=0;i-=2){
            System.out.print(i+"-");
        }

        for(boolean run = true;run;){
            int a = input.nextInt();
            if(a<0) {
                run = false;
            }
        }
        System.out.println("level 2");

        int b = 1;
        while (b>0){
            b = input.nextInt();
        }

    }
}
