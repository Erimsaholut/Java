package slaytDevam;

class Araba {
    public String getRenk() {
        return renk;
    }

    public String getBeygir() {
        return beygir;
    }

    public String getSonHiz() {
        return sonHiz;
    }

    private String renk;
    private String beygir;
    private String sonHiz;

    public void set(String renk, String
            beygir, String sonHiz) {
        this.renk = renk;
        this.beygir = beygir;
        this.sonHiz = sonHiz;
    }

    public void veriGoster() {
        System.out.println(renk + " " + beygir + " " + sonHiz);
    }
}