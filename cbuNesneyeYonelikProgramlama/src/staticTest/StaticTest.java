package staticTest;

import java.util.Scanner;

public class StaticTest {
    public static void main(String[] args) {
        StaticOrnek s1 = new StaticOrnek();
        StaticOrnek s2 = new StaticOrnek();
        s1.setStaticA(5);
        s1.setA(10);
        s2.setStaticA(15);
        s2.setA(20);
        System.out.println("s1 nesnesinin staticA değeri=" + s1.getStaticA());
        System.out.println("s1 nesnesinin A değeri= " + s1.getA());
        System.out.println("s2 nesnesinin staticA değeri=" + s2.getStaticA());
        System.out.println("s2 nesnesinin A değeri= " + s2.getA());

        DaireHesabi daire1 = new DaireHesabi();
        daire1.setDaireCapi(2);
        System.out.println("Eğer dairenin çapı 2 ise");
        daire1.alaniGoster();
        System.out.println("Şimdi yeni bir daire hesaplayalım.");
//        DaireHesabi.alanBulma();

        System.out.println(Math.E);
        System.out.println(Math.PI);

        boolean yanit;
        int N;
        System.out.print("Bir sayı giriniz:");
        Scanner klavye = new Scanner(System.in);
//        N = klavye.nextInt();
        N = 5;
        FazladanYukleme fark = new FazladanYukleme();
        yanit = fark.ayniSey(N);
        if (yanit)
            System.out.println(N + " çift sayıdır.");
        else
            System.out.println(N + " tek sayıdır.");
        fark.ayniSey();

        System.out.println(Toplayici.topla(11, 11));
        System.out.println(Toplayici.topla(12.3, 64.2));

        Araba ferrari = new Araba("kirmizi", 450, 320);

        
        Araba fiat = new Araba("beyaz");
        fiat.setBeygirGucu(70);
        fiat.setHiz(155);
        System.out.println("Ferrari özellikleri");
        ferrari.veriGoster();
        System.out.println("Fiat özellikleri");
        fiat.veriGoster();
    }
}

class Araba {
    private String renk;
    private int beygirGucu;

    public void setBeygirGucu(int beygirGucu) {
        this.beygirGucu = beygirGucu;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    private int hiz;

    public Araba(String renk, int guc, int hiz) {
        this.renk = renk;
        this.beygirGucu = guc;
        this.hiz = hiz;
    }

    public Araba(String renk) {
        this.renk = renk;
    }

    public void veriGoster() {
        System.out.println("Renk=" + this.renk);
        System.out.println("Beygir gücü=" + this.beygirGucu);
        System.out.println("Hız=" + this.hiz);
        System.out.println();
    }
}

class Toplayici {
    static int topla(int a, int b) {
        return a + b;
    }

    static double topla(double a, double b) {
        return a + b;
    }
}
