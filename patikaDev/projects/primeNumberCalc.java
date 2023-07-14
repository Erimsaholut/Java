package projects;

public class primeNumberCalc {
    public static void main(String[] args) {


        for (int i = 1; 100 > i; i++) {


            for (int j = i - 1; j > 1; j--) {


                if (i % j == 0) {
                    break;
                } else if (j == 2) {
                    System.out.println(i);
                }
            }


        }


    }
}
