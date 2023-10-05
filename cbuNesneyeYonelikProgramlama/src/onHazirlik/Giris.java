package onHazirlik;

import java.util.Scanner;

public class Giris {
    /*
     * @author, Erimsah Olut 2023
     */
    public static void plaka(int plaka) {
        switch (plaka) {
            case 1:
                System.out.println("Adana");
                break;
            case 6:
                System.out.println("Ankara");
                break;
            case 31:
                System.out.println("Hatay");
                break;
            case 34:
                System.out.println("İstanbul");
                break;
            case 35:
                System.out.println("İzmir");
                break;
            case 45:
                System.out.println("Manisa");
                break;
            default:
                System.out.println("Hatalı değer girdiniz");

        }

    }

    public static void breakdans() {

        for (int i = 1; 10 >= i; i++) {
            if (i == 3) {
                continue;
            }

            System.out.println(i);

            if (i == 3) {
                break;
            }

        }

    }

    public static int eleven() {
        // if you want to write eleven with letters instead of using numbers

        return 11;

    }

    public static int sumThem(int a, int b) {
        return a + b;
    }

    public static int sumThem(int a, int b, int c) {
        return a + b + c;
    }

    public static void fibo(int n) {
        int k = 0;
        int l = 1;

        for (int i = 0; n > i; ) {

            System.out.println(k);
            k = k + l;
            i++;

            if (n <= i)
                break;

            System.out.println(l);
            l = l + k;
            i++;
        }


    }

    public static void main(String[] args) {
        System.out.println("Merhaba diyecekler ve hoş geldin !");
        Scanner input = new Scanner(System.in);
        // int a = input.nextInt();
        // System.out.println(a);
        plaka(6);
        breakdans();
        System.out.println(eleven());
        System.out.println(sumThem(eleven(), 5));
        System.out.println(sumThem(eleven(), 5, 10));

        System.out.println("\n\n##############################\n\n");

        fibo(10);
    }
}
