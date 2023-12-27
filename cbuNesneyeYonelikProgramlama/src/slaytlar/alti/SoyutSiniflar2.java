package slaytlar.alti;

abstract class SoyutSinif {
    abstract public void goster(); //soyut metot

    public SoyutSinif() { //soyut sınıf yapıcısı
        System.out.println("burası soyut sınıf yapıcısı");
    }

    public void metot() { //normal metot
        System.out.println("soyut sınıfa air normal metot");
    }

    public static void metot2() { //static metot
        System.out.println("soyut sınıfa ait static normal metot");
    }
}


public class SoyutSiniflar2 {
    public static void main(String[] args) {
        AltSinif1 a1= new AltSinif1();
        AltSinif2 a2= new AltSinif2();
        a1.goster();
        a2.goster();
    }
}