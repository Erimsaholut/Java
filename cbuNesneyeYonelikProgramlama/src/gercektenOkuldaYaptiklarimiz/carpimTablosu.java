package gercektenOkuldaYaptiklarimiz;

import java.util.Scanner;

public class carpimTablosu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tablo kaca kaçlık olsun ");
        int deger = input.nextInt();

        for (int i = 1; i <= deger; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" * "+j + " = "+i*j);
                System.out.print("    ");
            }
            System.out.println("\n");

        }
    }
}
