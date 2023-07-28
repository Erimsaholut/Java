package arrays;

import java.util.Arrays;

public class matrisTransp {
    public static void main(String[] args) {


        int[][] mtrs = {{1, 2, 3}, {4, 5, 6}};
        for (int[] i : mtrs) {
            for (int j : i) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }


        System.out.println("\n^^^^^^^^^^^\n");


        for (int i = 0; i <= mtrs.length; i++) {

                System.out.print(" "+mtrs[mtrs.length-2][i]+" ");

                System.out.print(" "+mtrs[mtrs.length-1][i]+" ");
            System.out.println();
        }


    }
}
