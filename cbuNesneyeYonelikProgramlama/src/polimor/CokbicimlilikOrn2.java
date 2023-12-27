package polimor;


public class CokbicimlilikOrn2 {
    public static void nesneAl(Canli c){
        c.yaz();
    }
    public static void main(String[] args) {
        Canli c=new Canli();
        Insan i=new Insan();
        Hayvan h= new Hayvan();
        Bitki b=new Bitki();
        nesneAl(c);
        nesneAl(i); //upcasting (yukarı çevrim)
        nesneAl(h); //upcasting
        nesneAl(b); //upcasting

        Canli k=new Canli();
        Canli l=new Insan();
        Canli m=new Hayvan();
        Canli n=new Bitki();
        nesneAl(k);
        nesneAl(l);
        nesneAl(m);
        nesneAl(n);

        // Hayvan x = new Canli();

    }
}

