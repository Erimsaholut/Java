package gercektenOkuldaYaptıklarimiz;

public class ornek7bitmisYeni {

    static void  sirala(int[] liste, int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            if(liste[i]>liste[i+1]){
                temp = liste[i];
                liste[i] = liste[i+1];
                liste[i+1] = temp;
            }
            for (int a:liste
                 ) {
                System.out.print(a);

            }
        }

    }

    public static void main(String[] args) {
        int[] liste = new int[]{23, 15, 45, 39, 6, 34, 35, 20, 7, 44};
        int length = liste.length;

        int[] yeni = new int[liste.length];
        int K = 0;

        for (int k : liste) {
            if (k % 2 == 0) {
                yeni[K] = k;
                K++;
             sirala(liste,k);
            }
        }
        for (int j : liste) {
            if (j % 2 == 1) {
                yeni[K] = j;
                K++;
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(yeni[i] + " ");
        }


    }
}
