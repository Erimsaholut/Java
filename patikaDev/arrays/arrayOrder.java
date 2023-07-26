//todo git
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of your array:");
        int length = input.nextInt();
        int[] arr = new int[length];

        for (int i = 0; length > i; i++) {
            System.out.println("Please enter " + (i + 1) + ". value of your array:");
            arr[i] = input.nextInt();
        }

        System.out.println("Sorted: ");
        //kolay yolu bu       Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        int box;

        for (int i = 0; arr.length-1 > i; i++) {
            for (int j = 0; arr.length-1 > j; j++) {
                if (arr[j] > arr[j + 1]) {
                    box = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = box;

                }
            }
        }
System.out.println(Arrays.toString(arr));

    }
}
