package arrays;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] myArray = {10, 20, 20, 10, 10, 20, 5, 20};
        int repeat = 0;

        for (int i : myArray) {
            for (int j : myArray) {
                if (i == j) {
                    repeat++;
                }
            }
                System.out.println(i+"= "+repeat);
            repeat=0;
        }



    }
}
