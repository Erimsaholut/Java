package hackerRank;

import java.util.Scanner;

import static java.lang.Math.pow;


public class challange4 {
    static void calculate(int a, int b, int n) {

        for (int i = 0; n > i; i++) {

            int x = (int) (a + (b * pow(2, 0)));

            for (int k = 1; i >= k; k++) {
                x += (b * pow(2, k));
            }


            System.out.print(x+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            calculate(a, b, n);
        }
        in.close();


    }
}