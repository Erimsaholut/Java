package gercektenOkuldaYaptiklarimiz;

import java.util.Scanner;

public class papatya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1 ya da 0 degeri giriniz: ");
        System.out.println("Seviyor mu sevmiyor mu");

        int ilkDeger = input.nextInt();
        int yaprakSayisi = (int) (Math.random() * 10 + 20);
        System.out.println(yaprakSayisi);

        if ((yaprakSayisi % 2) == ilkDeger) {
            System.out.println("Sevmiyor");
        }else {
            System.out.println("Seviyor");
        }




    }
}
