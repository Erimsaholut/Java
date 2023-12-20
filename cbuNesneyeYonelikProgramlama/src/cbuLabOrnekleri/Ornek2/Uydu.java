package cbuLabOrnekleri.Ornek2;

public class Uydu {
    Uydu(){
        System.out.println("HATA: Uydu için GPSAlicisi bulunamadi");
    }
    Uydu(GPSAlicisi gA){
        System.out.println("BAŞARILI: GPS alicisina bağlanıldı.");
        gA.uydudanVeriAl(veriTuruSec());

    }
    int veriTuruSec(){
        return (int) (Math.random()*3+1);
    }
}
