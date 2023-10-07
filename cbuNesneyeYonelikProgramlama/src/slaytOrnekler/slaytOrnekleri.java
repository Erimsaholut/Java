package slaytOrnekler;

import java.util.Scanner;

public class slaytOrnekleri {

    public static int basamakSayisiniBul(int sayi) {
        int basamak = 1;
        while (sayi >= 10) {
            sayi /= 10;
            basamak += 1;
        }
        return basamak;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int toplam = 0;
        int sayi = 123456789;
        int basamakSayisi = basamakSayisiniBul(sayi);

        for (int i = basamakSayisi; i > 0; i--) {
            int faktor = 1;

            for (int j = 1; i > j; j++) {
                faktor *= 10;
            }

            int basamakDegeri = sayi % faktor;
            int basamak = (sayi - basamakDegeri) / faktor;
            toplam += basamak;
            sayi -= basamak * faktor;
        }

        System.out.println("Basamakların toplamı: " + toplam);
    }
}
