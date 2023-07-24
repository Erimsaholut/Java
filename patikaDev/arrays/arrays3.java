package arrays;

import java.util.Arrays;

public class arrays3 {
    public static void main(String[] args) {
        int[] list = {5,32,-32,35,87,1234,6765,1,-1,0,55};
        Arrays.sort(list);

        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.binarySearch(list,1234));

        //int[] copyList = Arrays.copyOf(list,5);

        int[] copyList = Arrays.copyOfRange(list,2,5);
        System.out.println(Arrays.toString(copyList));

        System.out.println(Arrays.equals(list,copyList));
        System.out.println(Arrays.equals(list,copyList));




    }
}
