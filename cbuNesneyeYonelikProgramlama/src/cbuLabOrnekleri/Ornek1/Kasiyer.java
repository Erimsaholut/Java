package cbuLabOrnekleri.Ornek1;

import java.util.Scanner;

public class Kasiyer {
    Kasa kasa;
    Scanner input = new Scanner(System.in);
    int secim;
    double fiyat;

    Kasiyer() {
        kasa = new Kasa();
        isVakti();
    }

    Kasiyer(String isim) {
        kasa = new Kasa(isim);
        isVakti();

    }

    public void isVakti() {
        do {
            System.out.println("Salata için 1 hamburger 2 pizza için 3 tatlı için 4 kodunu giriniz; çıkmak için 5 kodunu giriniz");
            secim = input.nextInt();
            if (secim == 5) {
                break;
            }
            System.out.println("Yiyeceğin fiyatını giriniz: ");
            fiyat = input.nextDouble();

            kasa.hesapla(secim, fiyat);
        } while (secim != 5);

        kasa.fisYazdir();

    }
}
