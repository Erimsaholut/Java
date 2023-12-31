package gercektenOkuldaYaptiklarimiz.interfaceOrnek;

public class Motor {
    Motor() {
        DisliSeti disliSeti = new DisliSeti();
        disliSeti.calistir();
    }

    int motorHacmi = 1400;


}

class DisliSeti {
    void calistir() {
        System.out.println("vıınnnn");
    }
}