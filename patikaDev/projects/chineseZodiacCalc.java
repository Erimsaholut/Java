package projects;

import java.util.Scanner;

public class chineseZodiacCalc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Please enter your year of birth:");
        int year = inp.nextInt()%12;

        switch (year){
            case 0:
                System.out.println("Your chinese zodiac is: Monkey ");
                break;
            case 1:
                System.out.println("Your chinese zodiac is: Rooster");
                break;
            case 2:
                System.out.println("Your chinese zodiac is: Dog");
                break;
            case 3:
                System.out.println("Your chinese zodiac is: Pig");
                break;
            case 4:
                System.out.println("Your chinese zodiac is: Mice");
                break;
            case 5:
                System.out.println("Your chinese zodiac is: Ox");
                break;
            case 6:
                System.out.println("Your chinese zodiac is: Tiger");
                break;
            case 7:
                System.out.println("Your chinese zodiac is: Rabbit");
                break;
            case 8:
                System.out.println("Your chinese zodiac is: Dragon");
                break;
            case 9:
                System.out.println("Your chinese zodiac is: Snake");
                break;
            case 10:
                System.out.println("Your chinese zodiac is: Horse");
                break;
            case 11:
                System.out.println("Your chinese zodiac is: Sheep");
                break;
        }


    }
}
