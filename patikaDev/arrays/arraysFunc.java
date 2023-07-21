package arrays;

public class arraysFunc {
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];


        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }

    static void printArray(int[] list) {
        for (int j : list) {
            System.out.println(j);
        }

    }


    public static void main(String[] args) {
        int[] myList = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newList = reverse(myList);
        printArray(newList);
    }
}
