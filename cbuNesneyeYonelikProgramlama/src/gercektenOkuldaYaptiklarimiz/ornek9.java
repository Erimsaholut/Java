package gercektenOkuldaYaptiklarimiz;
public class ornek9 {

    public static void main(String[] args) {
        for (int i = 100; i < 999; i++) {
            int toplam = 0;

            int deger = i;
            int degerGecici = deger;
            int birlerBas = 0;

            int deger2 = deger;
            int basSay = 0;

            // BASAMAK SAYISI BUL
            while (deger2 > 0) {
                deger2 /= 10;
                basSay++;
            }

            //DEGERLERİ BUL
            while (deger > 10) {
                degerGecici %= 10;
                toplam += (int) Math.pow(degerGecici, basSay);
                System.out.println(degerGecici);
                birlerBas = degerGecici;
                degerGecici = (deger - degerGecici) / 10;
                deger = degerGecici;
                basSay++;
            }
            toplam += (int) Math.pow(degerGecici, basSay);

            if (toplam == i) {
                System.out.println(i);
            }

        }
    }
}
