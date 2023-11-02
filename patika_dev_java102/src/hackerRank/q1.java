package hackerRank;

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b, h;
        b = input.nextInt();
        h = input.nextInt();
        if (b <= 0 || h <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            System.exit(0);
        }
        System.out.println(h * b);


    }

}
