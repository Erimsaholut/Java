package cbuLabOrnekleri.Ornek2;

import java.util.Objects;

public class GPSProgrami {
    private String konumVerisi;
    private String enlem = "";
    private String boylam = "";

    GPSProgrami(GPSAlicisi gA) {
        konumVerisi = gA.programaVeriGonder();
        konumBilgisi(konumVerisi);
    }

    private void konumBilgisi(String konumVerisi) {
        String veriTuru = konumVerisi.substring(1, 6);
        System.out.println(konumVerisi);

        for (int i = 0; i < konumVerisi.length(); i++) {
            int ascii = konumVerisi.charAt(i);
            if (ascii > 47 && ascii < 58) {
                if (Objects.equals(enlem, "")) {
                    enlem = konumVerisi.charAt(i) + "" + konumVerisi.charAt(i + 1);
                } else {
                    boylam = konumVerisi.charAt(i) + "" + konumVerisi.charAt(i + 1);
                    break;
                }
            }
        }
        System.out.println(veriTuru + " " + enlem + " " + boylam);

    }


}
