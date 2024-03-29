package arrays;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        int[] frequencyArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            frequencyArray[i] = count;
        }

        for (int i = 0; i < arr.length; i++) {
            if (frequencyArray[i] != 0) {
                System.out.println(arr[i] + "=" + frequencyArray[i]);
                frequencyArray[i] = 0;
            }
        }
    }
}
