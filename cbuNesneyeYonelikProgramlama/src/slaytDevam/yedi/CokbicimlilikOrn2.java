package slaytDevam.yedi;

public class CokbicimlilikOrn2 {
    public static void nesneAl(Canli c){
        c.yaz();
    }
    public void main(String[] args) {
        Canli c=new Canli();
        Insan i=new Insan();
        Hayvan h= new Hayvan();
        Bitki b=new Bitki();
        nesneAl(c);
        nesneAl(i); //upcasting (yukarı çevrim)
        nesneAl(h); //upcasting
        nesneAl(b); //upcasting
    }
}
