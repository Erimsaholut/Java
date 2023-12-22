package slaytlar;

public class slayt6 {


    public static void main(String[] args) {
        Sayici nesne1 = new Sayici();
        Sayici nesne2 = new Sayici();
        Sayici nesne3 = new Sayici();

        System.out.println();

        Sayici2 nesne4 = new Sayici2();
        Sayici2 nesne5 = new Sayici2();
        Sayici2 nesne6 = new Sayici2();

        System.out.println(FaktoriyelBulucuClass.buyukIslem(5));

        FaktoriyelBulucuClass fbc = new FaktoriyelBulucuClass();

        fbc.callClass("TestTestTest");

        Integer sarmalayanInt = 0;

        OtBokClassı obc = new OtBokClassı(27, 4.0);

        EnUstClass enUstClass = new EnUstClass();
        OrtaClass ortaClass = new OrtaClass();
        AltClass altClass = new AltClass();
        EnAltClass enAltClass = new EnAltClass();

        enUstClass.printMaas();
        ortaClass.printMaas();
        altClass.printMaas();
        enAltClass.printMaas();

        Ucgen ucgen = new Ucgen();
        ucgen.bilgi(3.0, 4.0);
        System.out.println(ucgen.alanHesap());

        ucgen.isimBelirle("Benim güzel ucgenim");
        System.out.println(ucgen.isimGetir());

        GeometrikSekil geometrikSekil = new GeometrikSekil() {
            @Override
            public double alanHesap() {
                return 0;
            }
        };


        BilimKurgu bilimKurguKitabi = new BilimKurgu("Bilim Kurgu", "Isaac Asimov", 25.0);
        Polisiye polisiyeKitap = new Polisiye("Polisiye", "Agatha Christie", 30.0);
        Macera maceraKitap = new Macera("Macera", "Jules Verne", 20.0);

        bilimKurguKitabi.yazdir();
        polisiyeKitap.yazdir();
        maceraKitap.yazdir();



    }
}

class Sayici {
    int sayac = 0;

    Sayici() {
        sayac++;
        System.out.println(sayac);
    }
}

class Sayici2 {
    static int sayac = 0;

    Sayici2() {
        sayac++;
        System.out.println(sayac);
    }
}

class FaktoriyelBulucuClass {

    private static int faktoriyel(int n) {
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        return total;
    }

    public static int buyukIslem(int n) {
        int sonuc = 0;
        for (int i = 1; i <= n; i++) {
            sonuc += faktoriyel(i);
        }
        return sonuc;

    }

    public void callClass(String text) {
        Naber selam = new Naber();
        selam.print(text);
    }

    private static class Naber {
        void print(String text) {
            System.out.println(text);
        }
    }
}

class OtBokClassı {
    OtBokClassı(int randomDeger, double onemsizDeger) {
        System.out.println(randomDeger + onemsizDeger);
    }
}

