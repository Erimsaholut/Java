package staticTest;

public class FazladanYukleme {
    public void ayniSey() {
        System.out.println("Merhaba gençler...");
    }

    public boolean ayniSey(int sayi) {
        boolean yanit;
        if (sayi % 2 == 0)
            yanit = true;
        else
            yanit = false;
        return yanit;
    }
}
