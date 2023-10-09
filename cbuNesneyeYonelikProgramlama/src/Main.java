import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!\n");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        Scanner input = new Scanner(System.in);

        /*
        String yourString = input.nextLine();
        System.out.println(yourString);

        String myString = input.next();
        System.out.println(myString);
        */
        float x = 5;
        System.out.println(x);
        // hata x=5.0;
        x = (float) 10.0; // hata yok
        System.out.println(x);

        double sayac = 2;
        System.out.println(sayac);
        int deger = 8;
        double kayac = deger;
        System.out.println();
        System.out.println(deger + " " + kayac);

        int charnum = 'A';
        System.out.println(charnum);

    }
}