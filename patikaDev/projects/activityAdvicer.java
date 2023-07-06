package projects;

import java.util.Scanner;

public class activityAdvicer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature");
        int heat = input.nextInt();

        if(heat < 5 ){
            System.out.println("Make snowboarding");
        }else if(heat<=25){
            if(heat<=15){
                System.out.println("go to cinema");
            }
            if( heat>=10){
                System.out.println("go to picnic");
            }
        }
        else{
            System.out.println("go to swim");
        }

    }
}
