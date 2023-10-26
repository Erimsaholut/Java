package gercektenOkuldaYaptıklarimiz;

import java.util.Scanner;

public class ornek4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bölünmesini istediğiniz degeri giriniz: ");
        int bolunen = input.nextInt();
        System.out.println("Kaça böleceksiniz: ");
        int bolen = input.nextInt();
        int bolum = 0;


        while (bolunen > 0) {
            bolum++;
            bolunen -= bolen;

        }
        System.out.println("Bolum = "+bolum);
        System.out.println("Kalan = "+bolunen*-1);


    }
}
