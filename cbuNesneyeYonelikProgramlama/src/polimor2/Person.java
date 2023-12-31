package polimor2;

public class Person {
    String name;
    double saat;
    double saatUcreti;

    public Person(String s, double h, double f) {
        name = s;
        saat = h;
        saatUcreti = f;
    }

    public double mesaiHesapla() {
        return saat * saatUcreti;
    }
}

