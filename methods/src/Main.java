public class methods {
    public static void main(String[] args) {
        int number=1;
        findingNumber(number);
    }

    public static void findingNumber(int number) {
        boolean isIn = false;
        int[] sayilar = {1, 2, 3, 4, 5, 6};


        for (int say : sayilar) {
            if (say == number) {
                isIn = true;
                break;
            }

        }
        sendMessage(isIn);
    }

    public static void sendMessage(boolean isIn) {
        if (isIn)
            System.out.println("Yes that's true");
        else
            System.out.println("No No No No");
    }
}