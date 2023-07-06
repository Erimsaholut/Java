package projects;

import java.util.Scanner;

public class isFailed {
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

        double gpa  = (double) (mat + fizik + kimya + tarih) /4;

        if(gpa>=55){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
        System.out.println("Your gpa is " + gpa);

    }
}
