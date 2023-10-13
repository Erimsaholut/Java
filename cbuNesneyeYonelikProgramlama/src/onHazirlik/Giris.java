package onHazirlik;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;

class Beer {
    String name;
    float alcholPercent;
    boolean glassBottle;

    Beer(boolean glassBottle, String name) {
        this.name = name;
        this.glassBottle = glassBottle;
        System.out.println("Beer Created {" + name + "}");
    }

    private void recyleIt() {
        String material = glassBottle ? ("Glass") : ("Tin");
        System.out.println("Recycled one " + material + " bootle !");
    }

    void drinkIt() {
        System.out.println("No it's not healthy.");
    }

    void throwItToBin() {
        System.out.println("Throwed");
    }

    void throwItToRycBin() {
        recyleIt();
    }

}

class Separator {
    void shortSeperator() {
        System.out.println("\n\n############\n\n");
    }

    void midSeperator() {
        System.out.println("\n\n\n########################\n\n\n");
    }

    void longSeperator() {
        System.out.println("\n\n\n\n####################################\n\n\n\n");
    }
}


public class Giris {
    /*
     * @author, Erimsah Olut 2023
     */
    public static void plaka(int plaka) {
        switch (plaka) {
            case 1:
                System.out.println("Adana");
                break;
            case 6:
                System.out.println("Ankara");
                break;
            case 31:
                System.out.println("Hatay");
                break;
            case 34:
                System.out.println("İstanbul");
                break;
            case 35:
                System.out.println("İzmir");
                break;
            case 45:
                System.out.println("Manisa");
                break;
            default:
                System.out.println("Hatalı değer girdiniz");

        }

    }

    public static void breakdans() {

        for (int i = 1; 10 >= i; i++) {
            if (i == 3) {
                continue;
            }

            System.out.println(i);

            if (i == 3) {
                break;
            }

        }

    }

    public static int eleven() {
        // if you want to write eleven with letters instead of using numbers

        return 11;

    }

    public static int sumThem(int a, int b) {
        return a + b;
    }

    public static int sumThem(int a, int b, int c) {
        return a + b + c;
    }

    public static void fibo(int n) {
        int k = 0;
        int l = 1;

        for (int i = 0; n > i; ) {

            System.out.println(k);
            k = k + l;
            i++;

            if (n <= i)
                break;

            System.out.println(l);
            l = l + k;
            i++;
        }


    }

    public static void ucuncuSlaytOrnek(int n) {
        int deger = (int) Math.signum(n);

        switch (deger) {
            case 1:
                System.out.println((2.0 / 3.0) * ((float) Math.abs(n + 1)));

                break;
            case 0:
                System.out.println(Math.sqrt(2.0 / 3.0));
                break;
            case -1:
                System.out.println((2.0 / 3.0) * ((float) Math.abs(n - 1)));
                break;
        }
    }

    public static void zarSalla() {

        int bir = 0, iki = 0, uc = 0, dort = 0, bes = 0, alti = 0, n;

        for (int i = 0; i < 100; i++) {

            n = (int) (Math.random() * 6) + 1;

            switch (n) {
                case 1:
                    bir += 1;
                    break;
                case 2:
                    iki += 1;
                    break;
                case 3:
                    uc += 1;
                    break;
                case 4:
                    dort += 1;
                    break;
                case 5:
                    bes += 1;
                    break;
                case 6:
                    alti += 1;
                    break;
            }
        }
        System.out.println("Bir:" + bir + " iki:" + iki + " uc:" + uc + " dort:" + dort + " Bes:" + bes + " alti:" + alti);
    }

    public static void eSayisiBulma() {

        int n = 1;
        double eEski, eYeni, fark;
        eEski = Math.pow(1.0 + 1.0 / n, n);
        System.out.println("n=" + n + "icin" + "e=" + eEski);
        do {
            n++;
            eYeni = Math.pow(1.0 + 1.0 / n, n);
            fark = Math.abs(eYeni - eEski);
            eEski = eYeni;
            System.out.println("n=" + n + " icin " + " e=" + eYeni);
        } while (fark >= 0.001);
    }


    public static void main(String[] args) {
        System.out.println("Merhaba diyecekler ve hoş geldin !");
        Scanner input = new Scanner(System.in);
        Separator sep = new Separator();

        int _myNumber = 90;
        System.out.println(_myNumber);
        System.out.println(15 / 8);

        sep.midSeperator();

        // int a = input.nextInt();
        // System.out.println(a);
        plaka(6);
        breakdans();
        System.out.println(eleven());
        System.out.println(sumThem(eleven(), 5));
        System.out.println(sumThem(eleven(), 5, 10));


        fibo(10);

        sep.midSeperator();

        Beer efes = new Beer(false, "Efes Xtra");
        efes.drinkIt();
        efes.throwItToBin();
        efes.throwItToRycBin();

        sep.midSeperator();

        double[] myList; //this is java style list declaration

        double myKist[]; //this is c style list declaration

        double[] mypist = new double[10];

        double[] myMint = {1.1, 1.2, 1.3, 3.1, 31};

        for (double i : myMint) {
            System.out.println(i + "\t");
        }


        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int[] i : matris) {

            for (int j : i)
                System.out.print(j + " ");

        }

        sep.shortSeperator();

        System.out.println(Arrays.toString(myMint));


        sep.midSeperator();

        int a = 3;
        int b = 18;
        System.out.println(a + b);
        System.out.println(a + b + "");
        System.out.print(a + b + " ");
        System.out.println(a + " " + b);
        // bizim slaytta bie yanlışlık var ama

        sep.shortSeperator();

        String israel = "palestine";
        System.out.println(israel.charAt(0));

        byte charTest = 'z';
        short charTest2 = 'z';
        double charTest3 = 'z';

        System.out.println(charTest + " " + charTest2 + " " + charTest3);

        byte charTest4 = (byte) '€'; // yamuldu
        short charTest5 = '€';
        double charTest6 = '€';

        System.out.println(charTest4 + " " + charTest5 + " " + charTest6);


        sep.shortSeperator();


        double duyarlilikKaybi = 5.0;
        //int duyarlilikKaybi2 = duyarlilikKaybi; bu hata veriyo
        int duyarlilikKaybi2 = (int) duyarlilikKaybi;
        System.out.println(duyarlilikKaybi + " " + duyarlilikKaybi2);


        sep.shortSeperator();


        // String sDokuz= '9'; hatalı
        String sDokuz = "9";
        char cDokuz = '9';

        int int_cDokuz = cDokuz;    // bunda sorun yok
        //int int_sDokuz = sDokuz;  //BU HATALI

        //int int_sDokuz = (int) sDokuz; // Bu da HATALI
        int int_sDokuz = Integer.parseInt(sDokuz);
        int int_sDokuz2 = new Integer(sDokuz);


        System.out.println("String olarak dokuzlar:");
        System.out.println(sDokuz + " " + cDokuz);
        System.out.println("integer olarak dokuzlar: string - char");
        System.out.println(int_sDokuz + " " + int_cDokuz);
        System.out.println("Bu da int'e çevrilmiş dokuz ama hata fırlatıyor bu: ");
        System.out.println(int_sDokuz2);


        sep.shortSeperator();
        System.out.println("Hocanın örnek birebir:\n");

        char dokuzKarakteri = '9';
        String dokuzDizgisi = "9";
        int dokuzSayisi = 9;
        String stringeCevrilmisDokuzKarakteri = dokuzKarakteri + "";
        String stringeCevrilmisDokuzSayisi = dokuzSayisi + "";
        double ondalikliDokuz = Double.parseDouble(dokuzDizgisi);
        System.out.println(ondalikliDokuz);

        sep.shortSeperator();
        System.out.println("Hocanın örnek veritipleri:\n");

        int intBolmeSonucu = 10 / 4;
        System.out.println(intBolmeSonucu);

        double doubleBolmeSonucu = 10 / 4.0;
        System.out.println(doubleBolmeSonucu);

        double doubleBolmeSonucu2 = 10.0 / 4;
        System.out.println(doubleBolmeSonucu2);

        double ilgincDoubleBolmeSonucu = 10 / 4;
        System.out.println(ilgincDoubleBolmeSonucu);


        sep.shortSeperator();
        System.out.println("Hocanın örnek degerAtama:\n");

        a = 2;
        b = 5;
        int sonuc;
        sonuc = a * (b--);
        System.out.println(b);
        System.out.println(sonuc);

        a = 2;
        b = 5;
        sonuc = a * (--b);
        System.out.println(b);
        System.out.println(sonuc);

        a = 3;
        b = 5;
        int c = a * ++b / 5 - 12 * a + b;
        System.out.println("c = " + c);


        sep.shortSeperator();

        a = 5;
        b = 3;
        c = a ^ b; // "a" ve "b" için bit düzeyinde XOR işlemi yapar
        System.out.println("c = " + c); // "c" değeri ekrana yazdırılır

        boolean isTrue = true;
        boolean isFalse = !isTrue; // "!" operatörü ile "isTrue" değeri tersine çevrilir
        System.out.println("isFalse = " + isFalse); // "isFalse" değeri ekrana yazdırılır

        sep.shortSeperator();

        System.out.println("true ^ true = " + (true ^ true));
        System.out.println("true ^ false = " + (true ^ false));
        System.out.println("false ^ false = " + (false ^ false));
        System.out.println("false == false = " + (false == false));

        sep.midSeperator();

        final int BIRTH_DATE = 2003;

        // BIRTH_DATE++; // BIRTH_DATE += 1; Bunlar hep hata

        System.out.println(BIRTH_DATE + " " + (BIRTH_DATE + 1));

        String string1 = "My ";
        String string2 = "Name Is: ";
        String string3 = "Erimsah";

        String string4 = string1 + string2 + string3;
        System.out.println(string4);

        System.out.println("Length:");
        System.out.println(string4.length());
        System.out.println("to Lower, to Upper: \n");
        System.out.println(string4.toLowerCase());
        System.out.println(string4.toUpperCase());

        System.out.println("\nSubString: ");
        System.out.println(string4.substring(5));
        System.out.println(string4.substring(0, 8));

        System.out.println("\nindexOf: ");
        System.out.println(string4.indexOf("E"));
        System.out.println(string4.indexOf('E'));
        System.out.println(string4.indexOf('Ğ'));

        String denemeStr = "   abcdefghijklmne    ";
        System.out.println(denemeStr.indexOf("e"));
        System.out.println(denemeStr.indexOf("e", 5)); //
        System.out.println(denemeStr.lastIndexOf("e"));

        System.out.println("\nCompare to, charAt, trim:\n");
        System.out.println(denemeStr.trim());
        System.out.println(denemeStr.charAt(17));
        System.out.println(denemeStr.compareTo(denemeStr)); // eşit 00000
        System.out.println(denemeStr.compareTo("abc")); // yeni eleman büyük ----
        System.out.println("abcdef".compareTo("abc"));// bizimki büyük ++++

        System.out.println("Equals :\n");
        System.out.println(("ABC").equals("ABC"));
        System.out.println(("ABC").equals("Abc"));
        System.out.println(("ABC").equalsIgnoreCase("Abc"));


        int x = 0;

        if (x == 0) {
            x++;
            System.out.println("Coca Cola Zero");
        } else if (x > 0) {
            System.out.println("Don't drink cola man");
        } else {
            System.out.println("Do what do you want");
        }

        sep.midSeperator();

        // float fltDeneme = 4.0; Hata verdi bir dil çünkü
        float fltDeneme = 4.0F;
        float fltDeneme2 = (float) 4.0;
        System.out.println(Math.max(fltDeneme, fltDeneme2));

        byte byte1 = 1;
        byte byte2 = 2;
        System.out.println(Math.min(byte1, byte2));
        // diğer veri türlerinde de çalışıyor ama 2 den fazla değeri karşılaştıramıyor

        System.out.println(Math.PI); //DOUBLE
        System.out.println(Math.random());
        System.out.println((int) (Math.random() * 100));
        System.out.println(Math.round(1.49) + " " + Math.round(1.5));

        System.out.println("math trigo\n");

        System.out.println(Math.sin(90));
        System.out.println(Math.cos(0));
        System.out.println(Math.tan(45));
        System.out.println(Math.toDegrees(1.0));
        System.out.println(Math.toRadians(180.0));

        ucuncuSlaytOrnek(10);

        eSayisiBulma();

        sep
                .
                midSeperator();

        int mySonuc = 1, n;
        for (n = 1; 10 >= n; n++) ;
        mySonuc = mySonuc * n;
        System.out.println(mySonuc);

        System.out.println("sayaca calışıyor demek istemis, n iste aq = " + n);

        zarSalla();

        System.out.println("31 sayısı girme");
        if(input.nextInt()==31){
            System.out.println("Girme demiştim sana ");
            System.exit(0);
        }
        System.out.println("Teşekkürler");


    }
}