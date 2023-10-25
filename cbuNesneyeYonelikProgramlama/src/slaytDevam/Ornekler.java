package slaytDevam;

import java.util.Scanner;

public class Ornekler {
    public static void main(String[] args) {
        String[] beerBrands = new String[5];
        beerBrands[0] = "Efes";
        beerBrands[1] = "Tuborg";
        beerBrands[2] = "Carlsberg";
        beerBrands[3] = "Bomonti";
        beerBrands[4] = "Amsterdam";


        for (String a : beerBrands) {
            System.out.println(a);
        }

        Student muhammed = new Student("Mohammad", "El Buhr-i Kaddayifi bin laddame ül sıddık", 711711);
        muhammed.fireTheStudent();
        muhammed.printExamResult(35);


        Student secondOne;
        secondOne = new Student("Ahmet", "düzİnsanEvladı", 123123);
        secondOne.appreciate();
        System.out.println(secondOne.assesTheExam());

        int sembolSayisi;
        VeriDondur eleman = new VeriDondur();
        sembolSayisi = eleman.veriYazidir();
        System.out.println("sembolSayisi = " + sembolSayisi);
        sembolSayisi = eleman.veriYazidir();
        System.out.println("sembolSayisi = " + sembolSayisi);


        //AAKKKKILLLARA ZARAR AMK KODU
        int pay1, pay2, payda1, payda2;
        KesirliSayi ilkSayi = new KesirliSayi();
        KesirliSayi ikinciSayi = new KesirliSayi();

        KesirliSayi sayilarToplami;

//        KesirliSayi sonSayi = new KesirliSayi();
//
//        Scanner klavye = new Scanner(System.in);
//
//        System.out.println("Birinci sayinin pay ve paydasini:");
//        pay1 = klavye.nextInt();
//        payda1 = klavye.nextInt();
//        ilkSayi.setSayi(pay1, payda1);
//
//
//        System.out.println("ikinci sayinin pay ve paydasini:");
//        pay2 = klavye.nextInt();
//        payda2 = klavye.nextInt();
//        ikinciSayi.setSayi(pay2, payda2);
//
//        sayilarToplami = ilkSayi.topla(ikinciSayi);
//        sayilarToplami.yazdir();
//
//        sonSayi.setSayi(7, 8); // Burası niye var olmuş hocaya sorsana bi
//        sonSayi.yazdir();


        int i, j;
        i = 10;
        j = i;
        i = 20;
        System.out.println(i + " ve " + j);

        VeriDondur p1 = new VeriDondur();
        VeriDondur p2 = new VeriDondur();
        if (p1 == p2)
            System.out.println("Ayni VeriDondur nesneleri");
        else
            System.out.println("Farkli VeriDondur nesneleri");


        VeriDondur p3 = new VeriDondur();
        VeriDondur p4 = p3;

        if (p3 == p4)
            System.out.println("Ayni VeriDondur nesneleri");
        else
            System.out.println("Farkli VeriDondur nesneleri");
    }


}
