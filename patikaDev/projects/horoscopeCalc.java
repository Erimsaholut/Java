package projects;

import java.util.Scanner;

public class horoscopeCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month,day;

        System.out.println("Enter your birth moth as a number ");
        month = input.nextInt();
        System.out.println("Enter your birth day as a number ");
        day = input.nextInt();

        if((month==3 && day>=21)||(month==4 && day<=20)){
            System.out.println("Your horoscope is Aries");
        }        else if((month==4 && day>=21)||(month==5 && day<=20)){
            System.out.println("Your horoscope is Taurus");
        }        else if((month==5 && day>=21)||(month==6 && day<=20)){
            System.out.println("Your horoscope is Gemini");
        }        else if((month==6 && day>=21)||(month==7 && day<=20)){
            System.out.println("Your horoscope is cancer");
        }
    }
}
