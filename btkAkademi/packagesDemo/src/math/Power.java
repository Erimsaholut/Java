package math;

public class Power {
    public int logarithmCalc(int floor, int ceil) {
        int result = 1;
        for (int i = 0; ceil > i; i++) {
            result *= floor;
        }
        return result;
    }
}
