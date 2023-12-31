package gercektenOkuldaYaptiklarimiz;

import java.util.Scanner;

public class ornek8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String ilkSifre = input.nextLine();
        String ilkSifre = "abc";

        //int anahtar = input.nextInt();
        int yeni, anahtar = 3;

        for (int i = 0; i < ilkSifre.length(); i++) {
            yeni = ((int) ilkSifre.charAt(i)) + anahtar;
            System.out.print((char) (yeni));


        }


    }
}
