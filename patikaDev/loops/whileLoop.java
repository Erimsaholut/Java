package loops;

import java.util.Scanner;

public class whileLoop {
    public static <Int> void main(String[] args) {
        int x = 1;

        while(x<=5){
            System.out.println("\n"+x);
            x++;
            int y=5;
            while (y>=1){
                System.out.print(y+",");
                y--;
            }
        }
        int right =200,left = 100;

        while (++left < --right);
        System.out.println(left+"+"+right);

        Scanner input = new Scanner(System.in);
        String password = "12345";
        boolean haveAcsess = false;

        while (!haveAcsess){
            System.out.println("Enter your password:");
            int typedPassword = input.nextInt();
            if(typedPassword == 12345){
                System.out.println("Welcome to system");
                haveAcsess = true;
            }else {
                System.out.println("wrong password try again.");
            }
        }


    }
}
