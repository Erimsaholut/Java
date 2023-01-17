public class loopDemo {
    public static void main(String[] args) {
        // FOR LOOP
        int i;
        for (i = 1; 10 >= i; i += 2) {
            //System.out.println(i);
        }

        // WHİLE
        i = 2;
        while (100 >= i) {
            //System.out.println(i);
            i += 2;
        }

        // prime number algorithm
        int j;
        for (i = 2; 100 > i; i++) {

            j = i - 1;

            while (j > 1) {

                if (i % j == 0) {
                    break;
                }

                if (j == 2) {
                    System.out.println("Prime numb: " + i);
                }

                j--;
            }
        }

        // while loop
        i=0;
        do{
            System.out.println(i);
            i++;
        }while(i!=5);

    }
}