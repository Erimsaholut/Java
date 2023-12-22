package slaytlar;

interface Kitap {
    String getTur();
    String getYazar();
    double getFiyat();

    void yazdir();
}

// BilimKurgu sınıfı
class BilimKurgu implements Kitap {
    private String tur;
    private String yazar;
    private double fiyat;

    public BilimKurgu(String tur, String yazar, double fiyat) {
        this.tur = tur;
        this.yazar = yazar;
        this.fiyat = fiyat;
    }

    @Override
    public String getTur() {
        return tur;
    }

    @Override
    public String getYazar() {
        return yazar;
    }

    @Override
    public double getFiyat() {
        return fiyat;
    }

    @Override
    public void yazdir() {
        System.out.println("Bilim Kurgu Kitabı:");
        System.out.println("Tür: " + getTur());
        System.out.println("Yazar: " + getYazar());
        System.out.println("Fiyat: " + getFiyat());
        System.out.println();
    }
}

// Polisiye sınıfı
class Polisiye implements Kitap {
    private String tur;
    private String yazar;
    private double fiyat;

    public Polisiye(String tur, String yazar, double fiyat) {
        this.tur = tur;
        this.yazar = yazar;
        this.fiyat = fiyat;
    }

    @Override
    public String getTur() {
        return tur;
    }

    @Override
    public String getYazar() {
        return yazar;
    }

    @Override
    public double getFiyat() {
        return fiyat;
    }

    @Override
    public void yazdir() {
        System.out.println("Polisiye Kitabı:");
        System.out.println("Tür: " + getTur());
        System.out.println("Yazar: " + getYazar());
        System.out.println("Fiyat: " + getFiyat());
        System.out.println();
    }
}

// Macera sınıfı
class Macera implements Kitap {
    private String tur;
    private String yazar;
    private double fiyat;

    public Macera(String tur, String yazar, double fiyat) {
        this.tur = tur;
        this.yazar = yazar;
        this.fiyat = fiyat;
    }

    @Override
    public String getTur() {
        return tur;
    }

    @Override
    public String getYazar() {
        return yazar;
    }

    @Override
    public double getFiyat() {
        return fiyat;
    }

    @Override
    public void yazdir() {
        System.out.println("Macera Kitabı:");
        System.out.println("Tür: " + getTur());
        System.out.println("Yazar: " + getYazar());
        System.out.println("Fiyat: " + getFiyat());
        System.out.println();
    }
}
