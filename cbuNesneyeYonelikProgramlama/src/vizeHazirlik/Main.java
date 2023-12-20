package vizeHazirlik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sınav = 3;
        double var = 7.77;
        System.out.println(sınav + var + "");
        System.out.println("" + sınav + var);

        int a = 6, b = 18, c = 3;
        System.out.println(a);
        System.out.println(b);
        System.out.print("a=" + a);
        System.out.println(", a+b=" + a + b);
        System.out.println("a+b=" + (a + b));
        System.out.println(a + b + "_");
        System.out.println(a + " " + b + " ");


        System.out.println(a + b + "___" + a + b);


        System.out.println(a + b + c);
        a = 1;
        b = 3;
        c = 4;
        System.out.println("a=" + a + " ,b=" + b + ", c= " + c);
        System.out.println(a+++b+++c);


        Scanner input = new Scanner(System.in);
        String test = input.nextLine();
        System.out.println(test);


        String test2 = input.next();
        String test3 = input.next();

        System.out.println(test2);
        System.out.println(test3);

        System.out.println("selami");


        int intBolmeSonucu = 10 / 4;
        double doubleBolmeSonucu = 10 / 4.0;
        double ilgincBolmeSonucu = 10 / 4;
        System.out.println(intBolmeSonucu);
        System.out.println(doubleBolmeSonucu);
        System.out.println(ilgincBolmeSonucu);

        System.out.println("\n\n*****\n\n");

        a = 3;
        b = 5;
        c = a * ++b / 5 - 12 * a + b;
        System.out.println("c: " + c); // c: -27
        boolean bool = a + b < a * c && a + b >= b + a;
        System.out.println("bool: " + bool); // bool: false

        System.out.println("Filistin ve Gazze arasındaki savaş hepimizi derinden üzdü      ".trim());

        for (int i = 0; i < 10; i++) {

            System.out.println(i);
            for (int j = 0; j < 3; j++) {
                System.out.println(j);
                if (i == 8) {
                    break;
                }

            }
            System.out.println();
        }


        int[] listeleme = {1, 2, 3, 4, 5};
        int[] listelememe = new int[5];
        listelememe = new int[]{1, 2, 3, 4, 5};


        Sayici nesne1 = new Sayici();
        Sayici nesne2 = new Sayici();
        Sayici nesne3 = new Sayici();

        int deger = 8;
        double sayac = deger;
        System.out.println(deger + "" + sayac);


        String dokuzStringi = "9";
        int baba = Integer.valueOf(dokuzStringi);
        int abab = Integer.parseInt(dokuzStringi);

        System.out.println(abab);
        System.out.println(baba);

        //float nasi = 3.0;
        float nasil = (float) 3.0;
        float nas = 3;


    }
}

class Sayici {
    static int sayac = 0;

    Sayici() { //yapıcı metot
        sayac++;
        System.out.println(sayac);
    }
}