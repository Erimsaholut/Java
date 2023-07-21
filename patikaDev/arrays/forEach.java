package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class forEach {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        String[] cars = {"BMW", "AUDI", "MERCEDES"};

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        System.out.println("###################");

        for (int i : list) {
            System.out.println(i);
        }

        System.out.println("###################");

        for (String str : cars) {
            System.out.println(str);
        }

        System.out.println("###################");

        int[][] arr = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};

        for (int[] col : arr) {
            for (int row : col) {
                System.out.println(row);
            }
        }

        System.out.println(Arrays.toString(list));
        Arrays.fill(list,10);
        System.out.println(Arrays.toString(list));



    }
}
