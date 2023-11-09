package staticTest;

public class Employe {
    // Gerekli Değişkenler:
    String isim, soyad, bolum = "Çalışan", calisanBilgileri;
    int izingünü = 14;
    double maas = 2500;

    // Yapıcı Metot Tanımlaması:
    Employe(String isim, String soyad) {
        this.isim = isim;
        this.soyad = soyad;
    }

    // Yazdırılacak Metin Değişkenleri:
    void printInfo() {
        calisanBilgileri = "-> İsim ve Soyisim: " + isim + " " + soyad + "\n-> Bölüm: " + bolum + "\n-> İzin Günü: " + izingünü + " Gün" + "\n-> Maaş: " + maas + " TL";
        System.out.println(calisanBilgileri);
    }
}
