package projects;
import java.util.Scanner;

public class AvgGrade {
    public static void main(String[] args) {
        int mat,fizik,kimya,tarih;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.println("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        double sonuc = (double) (mat + kimya + fizik + tarih) /4;

        System.out.println("Ortalamanız"+sonuc);


    }
}
