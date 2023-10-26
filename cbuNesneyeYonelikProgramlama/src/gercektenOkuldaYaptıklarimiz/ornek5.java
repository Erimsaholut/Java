package gercektenOkuldaYaptıklarimiz;

import java.util.Scanner;

public class ornek5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int i, j;

        for (i = 0; i < 5; i++) {
            System.out.print("*");
            for (j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }

    }

}
