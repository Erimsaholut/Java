package polimor2;

public class Mudur extends Person {
    public Mudur(String m, double zaman, double
            ucr) {
        super(m, zaman, ucr);
    }

    public double mesaiHesapla() {
        return saat * saatUcreti;
    }

    public class Teknisyen extends Person {
        public Teknisyen(String m, double zaman, double
                ucr) {
            super(m, zaman, ucr);
        }

        public double mesaiHesapla() {
            return saat * saatUcreti;
        }
    }

    public class Sekreter extends Person {
        public Sekreter(String m, double zaman, double
                ucr) {
            super(m, zaman, ucr);
        }

        public double mesaiHesapla() {
            return saat * saatUcreti;
        }
    }

    public class PersonelTest {
        public void main(String[] args) {
            Person person = new Person("Genel Müdür", 10, 50);
            Mudur mudur = new Mudur("Müdür", 10, 40);
            Teknisyen teknisyen = new Teknisyen("Teknisyen", 10, 30);
            Sekreter sekreter = new Sekreter("Sekreter", 10, 20);
            System.out.println("Genel müdür:" + person.mesaiHesapla());
            person = mudur;
            System.out.println("Müdür:" + person.mesaiHesapla());
            person = teknisyen;
            System.out.println("Teknisyen:" + person.mesaiHesapla());
            person = sekreter;
            System.out.println("Sekreter:" + person.mesaiHesapla());
        }
    }
}
