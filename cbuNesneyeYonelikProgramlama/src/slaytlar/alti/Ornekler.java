package slaytlar.alti;

import java.util.Objects;

public class Ornekler {

    static void arabalariKarsilastir(Araba a1, Araba a2) {
        if ((Objects.equals(a1.getRenk(), a2.getRenk())) && (Objects.equals(a1.getBeygir(), a2.getBeygir())) && (Objects.equals(a1.getSonHiz(), a2.getSonHiz())))
            System.out.println("Esittir");
        else System.out.println("Esit degildir");
    }

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
        if (p1 == p2) System.out.println("Ayni VeriDondur nesneleri");
        else System.out.println("Farkli VeriDondur nesneleri");


        VeriDondur p3 = new VeriDondur();
        VeriDondur p4 = p3;

        if (p3 == p4) System.out.println("Ayni VeriDondur nesneleri");
        else System.out.println("Farkli VeriDondur nesneleri");


        Araba ferrari, fiat;
        ferrari = new Araba();
        fiat = new Araba();

        ferrari.set("kirmizi", "450 HP", "320 km/s");
        fiat.set("beyaz", "70 HP", "200 km/s");

        System.out.println(fiat == ferrari);

        fiat = ferrari;

        System.out.println(fiat == ferrari);
        System.out.println("Ferrari:");
        ferrari.veriGoster();
        System.out.println("Fiat:");
        fiat.veriGoster();

        Araba opel, bmw;
        opel = new Araba();
        bmw = new Araba();

        opel.set("kirmizi", "450 HP", "320 km/s");
        bmw.set("kirmizi", "450 HP", "320 km/s");
        System.out.println("bmw ve opel eşit mi = " + (bmw.equals(opel)));
        System.out.println("bmw ve opel eşit mi = " + (bmw == opel));

        arabalariKarsilastir(opel,bmw); // burada attirbuteleri karşılaştırdık ama hard code ile karşılaştırdık



        opel = bmw;
        System.out.println("bmw ve opel eşit mi = " + (bmw.equals(opel)));    // BURADA BELLEK ADRESLERİ KARŞILAŞTIRILDI
        System.out.println("bmw ve opel eşit mi = " + (bmw == opel));


        System.out.println(opel.toString());
        System.out.println(bmw.toString());



    }
}
