package cbuLabOrnekleri.Ornek2;

public class GPSAlicisi {
    private int sicaklik;
    boolean isActive;
    private String gpsString;

    private void sicaklikOlc() {
        int degree = (int) (Math.random() * 40 + 1);
        isActive = degree >= 5 && degree <= 40;
        System.out.println(isActive);
    }

    public void uydudanVeriAl(int cumleCesidi) {
        switch (cumleCesidi) {
            case 1:
                gpsString = "$GPGGA, N, 40, 30, E";
                break;
            case 2:
                gpsString = "$GPRMC, 41, N, E, 31";
                break;
            case 3:
                gpsString = "$GPGLL, N, E, 42, 32";
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + cumleCesidi);
        }
    }

    public String programaVeriGonder() {
        return gpsString;
    }

    GPSAlicisi() {
        sicaklikOlc();
    }

}
