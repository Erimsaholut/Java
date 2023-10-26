package gercektenOkuldaYaptıklarimiz;

public class ornek7 {
    public static void main(String[] args) {
        int[] liste = new int[]{23, 15, 45, 39, 6, 34, 35, 20, 7, 44};
        int length = liste.length;

        int[] yeni = new int[liste.length];
        int k = 0;
        int l = length - 1;


        for (int j : liste) {
            if (j % 2 == 0) {
                System.out.println(j);
                yeni[k] = j;
                k++;
            } else {
                yeni[l] = j;
                l--;
            }
        }

        for (int a:yeni) {
            System.out.print(a+" ");

        }


    }
}
