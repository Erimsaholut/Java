package arrays;

import java.util.Arrays;

public class findRepeatingNums {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 9, 1, 33, 1};
        int[] listClean = new int[list.length];
        int startIndex = 0;

        for (int i : list) {
            if (!isFind(listClean, i)) {
                listClean[startIndex++] = i;
            }
        }

        // Truncate the listClean array to remove the unused elements (zeros)
        listClean = Arrays.copyOf(listClean, startIndex);

        System.out.println(Arrays.toString(listClean));
    }
}
