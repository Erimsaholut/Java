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



        for (int i = 0; i < mtrs.length; i++) {
            for (int k = mtrs.length; k > 0; k--) {
                System.out.print(mtrs[i][k]);
            }


            for (int j = 0; j < mtrs[i].length; j++) {
                System.out.print(mtrs[i][j]);
            }
        }




    }
}
