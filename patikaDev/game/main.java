package game;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = (int) (Math.random() * 100);
        int lives = 7;
        int guess;

        do {
            System.out.println("Guess a number");
            guess = input.nextInt();


            if (guess > num) {
                lives -= 1;
                System.out.println("You have " + lives + " change to try");
                System.out.println("Smaller");
            } else if (guess < num) {
                lives -= 1;
                System.out.println("You have " + lives + " change to try");
                System.out.println("Bigger");
            }

        } while (guess != num && lives != 0);
        if (lives != 0) {
            System.out.println("Congrats. You Win");
        } else {
            System.out.println("You lose right number is " + num);
        }
    }
}
