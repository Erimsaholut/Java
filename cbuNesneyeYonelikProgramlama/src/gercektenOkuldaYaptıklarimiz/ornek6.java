package gercektenOkuldaYaptıklarimiz;

import java.util.Scanner;

public class ornek6 {
    public static void main(String[] args) {
        int[] a = {4, 8, 3, 1, 18, 9, 21, 20, 5, 11};
        int toplam=0,adet=0;

        for (int i : a) {
            toplam+=i;
            adet++;
        }
        System.out.println("Sayiların ortalaması = "+ (toplam/adet));


    }
}
