package cbuLabOrnekleri.Ornek2;

public class Test {
    public static void main(String[] args) {
        GPSAlicisi gpsAlicisi;
        do {
            gpsAlicisi = new GPSAlicisi();

        } while (!gpsAlicisi.isActive);

        Uydu uyduParametresiz = new Uydu();
        Uydu uyduParametreli = new Uydu(gpsAlicisi);

        GPSProgrami gpsProgrami = new GPSProgrami(gpsAlicisi);

    }
}
