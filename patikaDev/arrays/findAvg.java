package arrays;

public class findAvg {
    public static void main(String[] args) {
        int[] list = {32, 34, 1, 23, 4, 90, 87, 43};
        double avg = 0.0;

        for (int i : list) {
            avg += i;
        }
        avg /= list.length;

        System.out.println(avg);
    }
}
