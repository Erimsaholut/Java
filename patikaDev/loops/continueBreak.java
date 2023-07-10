package loops;

public class continueBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }

        }
        System.out.println("**************");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);

        }


        System.out.println("**************");

        int x = 1;
        while (x < 10) {
            if (x == 5) {
                break;
            }
            x++;
            System.out.println(x);
        }

        System.out.println("**************");

        x = 1;
        while (x < 10) {
            if (x == 5) {
                continue;
            }
            System.out.println(x);
            x++;
        }


    }
}
