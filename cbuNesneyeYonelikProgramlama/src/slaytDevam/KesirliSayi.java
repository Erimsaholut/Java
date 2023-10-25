package slaytDevam;

public class KesirliSayi { //akıllara zarar valla
    private int pay;
    private int payda;

    public void setSayi(int pay1, int pay2) {
        pay = pay1;
        payda = pay2;
    }

    public int getPay() {
        return pay;
    }

    public int getPayda() {
        return payda;
    }

    public KesirliSayi topla(KesirliSayi sayi1) {
        System.out.println("sayi1 dediğimiz şey : "+sayi1);
        KesirliSayi sayi2 = new KesirliSayi();

        sayi2.pay = sayi1.pay * payda + pay * sayi1.payda;
        System.out.println("sayi2 pay dediğimiz şey : "+sayi2.pay);

        sayi2.payda = sayi1.payda*payda;
        System.out.println("sayi2 payda dediğimiz şey : "+sayi2.payda);

        return sayi2;
    }
    public void yazdir(){
        System.out.println(pay +" / "+payda);
    }


}
