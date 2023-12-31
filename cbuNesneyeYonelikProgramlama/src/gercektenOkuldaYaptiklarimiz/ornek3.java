package gercektenOkuldaYaptiklarimiz;

import java.util.Scanner;

public class ornek3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int deger = 123456789;
        int degerGecici = deger;
        int birlerBas = 0;

        while (deger > 10) {
            degerGecici %= 10;
            System.out.println(degerGecici);
            birlerBas = degerGecici;
            degerGecici = (deger - degerGecici) / 10;
            deger = degerGecici;

        }
        System.out.println(degerGecici);
    }

}
