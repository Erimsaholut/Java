package onHazirlik;

import java.util.Arrays;
import java.util.Scanner;

class Beer {
    String name;
    float alcholPercent;
    boolean glassBottle;

    Beer(boolean glassBottle, String name) {
        this.name = name;
        this.glassBottle = glassBottle;
        System.out.println("Beer Created {" + name + "}");
    }

    private void recyleIt() {
        String material = glassBottle ? ("Glass") : ("Tin");
        System.out.println("Recycled one " + material + " bootle !");
    }

    void drinkIt() {
        System.out.println("No it's not healthy.");
    }

    void throwItToBin() {
        System.out.println("Throwed");
    }

    void throwItToRycBin() {
        recyleIt();
    }

}

class Separator {
    void shortSeperator() {
        System.out.println("\n############\n");
    }

    void midSeperator() {
        System.out.println("\n\n########################\n\n");
    }

    void longSeperator() {
        System.out.println("\n\n\n####################################\n\n\n");
    }
}


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
        Separator sep = new Separator();
        // int a = input.nextInt();
        // System.out.println(a);
        plaka(6);
        breakdans();
        System.out.println(eleven());
        System.out.println(sumThem(eleven(), 5));
        System.out.println(sumThem(eleven(), 5, 10));


        fibo(10);

        sep.midSeperator();

        Beer efes = new Beer(false, "Efes Xtra");
        efes.drinkIt();
        efes.throwItToBin();
        efes.throwItToRycBin();

        sep.midSeperator();

        double[] myList; //this is java style list declaration

        double myKist[]; //this is c style list declaration

        double[] mypist = new double[10];

        double[] myMint = {1.1, 1.2, 1.3, 3.1, 31};

        for (double i : myMint) {
            System.out.println(i + "\t");
        }


        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int[] i : matris) {

            for (int j : i)
                System.out.print(j+" ");

        }

        sep.shortSeperator();

        System.out.println(Arrays.toString(myMint));
    }
}