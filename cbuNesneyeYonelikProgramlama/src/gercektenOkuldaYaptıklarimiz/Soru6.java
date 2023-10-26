package gercektenOkuldaYaptıklarimiz;

public class Soru6 {

    public static void main(String[] args) {
        int[] liste = new int[]{23, 15, 45, 39, 6, 34, 35, 20, 7, 44};
        int i, boyut, temp=0;
        boyut = liste.length;

        for (i = 0; i <= boyut / 2; i++) {
            temp = liste[i];
            liste[i] = liste[boyut - i - 1];
            liste[boyut - i - 1] = temp;
        }


        for (int a : liste) {
            System.out.print(a + " ");

        }


    }
}
