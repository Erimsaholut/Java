public class FourOperations {
    public int Sum(int... number) {
        int total = 0;
        for (int num : number) {
            total += num;
        }
        return total;
    }

    public int Multip(int... number) {
        int total = 1;
        for (int num : number) {
            total *= num;
        }
        return total;
    }

    public int Divide(int num1, int num2) {
        if (num2 != 0)
            return num1 / num2;
        else {
            return -1;
        }

    }


}
