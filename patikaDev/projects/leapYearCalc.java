package projects;

import java.util.Scanner;

public class leapYearCalc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Please enter year:");
        int year = inp.nextInt();

        if(year%4==0){
            System.out.println(year + " is a leap year ");
        }
        else {
            System.out.println(year + " isn't a leap year ");
        }
    }
}
