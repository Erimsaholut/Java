package staticTest;

import java.util.Scanner;

public class DaireHesabi {
    public static final double PI = 3.14159;
    private double daireCapi;

    public void setDaireCapi(double Cap) {
        daireCapi = Cap;
    }

    public static double alan(double yaricap) {
        return (PI * yaricap * yaricap);
    }

    public void alaniGoster() {
        System.out.print("Dairenin alani");
        System.out.println(alan(daireCapi / 2));
    }

    public static void alanBulma() {
        System.out.println("Dairenin çapını giriniz:");
        Scanner klavye = new Scanner(System.in);
        double cap1 = klavye.nextDouble();
        DaireHesabi daire1 = new DaireHesabi();
        daire1.setDaireCapi(cap1);
        daire1.alaniGoster();
    }
}
