package cbuLabOrnekleri.Ornek1;

import java.util.ArrayList;
import java.util.List;

public class Kasa {
    static double satisMiktari = 0;
    double gunlukKar;
    double salatalardanEldeEdilenKar = 0;
    static int tatliSayisi = 0;
    static int salataSayisi;

    List<String> foodsList = new ArrayList<>(List.of("Salata", "Hamburger", "Pizza", "Tatli"));
    List<Double> percentList = new ArrayList<>(List.of(0.3, 0.25, 0.35, 0.20));


    Kasa() {
        System.out.println("Hoş geldin");
    }

    Kasa(String isim) {
        System.out.println("Hoş geldin " + isim);

    }

    public void hesapla(int secim, double fiyat) {
        topSatHesapla(fiyat);
        gunlukKrHesapla(secim, fiyat);
    }

    private void topSatHesapla(double fiyat) {
        satisMiktari += fiyat;
    }

    private void gunlukKrHesapla(int secim, double fiyat) {
        System.out.println(foodsList.get(secim - 1));
        System.out.println( percentList.get(secim - 1));
        double kar = fiyat * percentList.get(secim - 1);
        System.out.println("Kar oranı: "+kar);

        if (foodsList.get(secim - 1) == "Salata") {
            salataKari(kar);
        } else if (foodsList.get(secim - 1) == "Tatli") {
            tatliSayisiArttir();
        }
        gunlukKar += kar;


    }

    private void salataKari(double kar) {
        salatalardanEldeEdilenKar += kar;
    }


    private void tatliSayisiArttir() {
        tatliSayisi++;
    }


    public void fisYazdir() {
        System.out.println("toplam satis miktarı = " + Math.round(satisMiktari));
        System.out.println("günlük kar miktarı = " + gunlukKar);
        System.out.println("ortalama salata karı = " + salatalardanEldeEdilenKar);
        System.out.println("Tatlı sayisi = " + tatliSayisi);
    }


}

