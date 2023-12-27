package slaytlar.alti;
abstract class Sporcu {
    String isim;
    double maas;
    String kulup;
    int basari;

    public Sporcu(String isim, double maas, String kulup, int basari) {
        this.isim = isim;
        this.maas = maas;
        this.kulup = kulup;
        this.basari = basari;
    }

    abstract void bilgiAl();

    abstract void yazdir();
}

class Basketbolcu extends Sporcu {
    public Basketbolcu(String isim, double maas, String kulup, int basari) {
        super(isim, maas, kulup, basari);
        System.out.println("Basketbolcu branşıyla ilgili yapılandırıcı çalıştı.");
    }

    @Override
    void bilgiAl() {

    }

    @Override
    void yazdir() {
        System.out.println("Basketbolcu Bilgileri:");
        System.out.println("İsim: " + isim);
        System.out.println("Maaş: " + maas);
        System.out.println("Kulüp: " + kulup);
        System.out.println("Başarı Sıralaması: " + basari);
    }
}


class Futbolcu extends Sporcu {
    public Futbolcu(String isim, double maas, String kulup, int basari) {
        super(isim, maas, kulup, basari);
        System.out.println("Futbolcu branşıyla ilgili yapılandırıcı çalıştı.");
    }

    @Override
    void bilgiAl() {
    }

    @Override
    void yazdir() {
        System.out.println("Futbolcu Bilgileri:");
        System.out.println("İsim: " + isim);
        System.out.println("Maaş: " + maas);
        System.out.println("Kulüp: " + kulup);
        System.out.println("Başarı Sıralaması: " + basari);
    }
}

class Voleybolcu extends Sporcu {
    public Voleybolcu(String isim, double maas, String kulup, int basari) {
        super(isim, maas, kulup, basari);
        System.out.println("Voleybolcu branşıyla ilgili yapılandırıcı çalıştı.");
    }

    @Override
    void bilgiAl() {
    }

    @Override
    void yazdir() {
        System.out.println("Voleybolcu Bilgileri:");
        System.out.println("İsim: " + isim);
        System.out.println("Maaş: " + maas);
        System.out.println("Kulüp: " + kulup);
        System.out.println("Başarı Sıralaması: " + basari);
    }
}

abstract class Medya {
    abstract String isim();

    abstract int yil();

    abstract int adet();
}
