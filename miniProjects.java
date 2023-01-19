public class miniProjects {
    public static void main(String[] args) {
        //Prime number algorithm
        int i, j;

        for (i = 2; 100 > i; i++) {
            for (j = 2; i >= j; j++) {
                if (j == i)
                    //System.out.println(i);

                    if (i % j == 0)
                        break;

            }
        }

        // Perfect Number algoritm

        int number, total = 0;
        for (number = 1; 500 >= number; number++) {
            for (i = 1; number > i; i++) {
                if (number % i == 0)
                    total += i;
            }
            if (total == number)
                //System.out.println(number + " is a prime number.");
                total = 0;
        }

        // Amicable numbers algoritm

        int num1, num2, top1 = 0, top2 = 0;

        for (num1 = 1; 300 >= num1; num1++) {
            for (i = 1; num1 > i; i++) {
                if (num1 % i == 0)
                    top1 += i;
            }

            //###########################################################

            for (num2 = 1; 300 >= num2; num2++) {
                for (i = 1; num2 > i; i++) {
                    if (num2 % i == 0)
                        top2 += i;
                }

                if (num1 != num2 && top1 == num2 && top2 == num1) {
                    System.out.println("num1 = " + num1 + " and num2= " + num2);
                }
                top2 = 0;

            }
            top1 = 0;
        }
        // İs contains
        int[] sayilar = {1, 2, 3, 4, 5, 6};
        int numberr = 31;
        boolean isIn = false;

        for(int say:sayilar){
            if(say==numberr)
                isIn=true;
                break;
        }
        System.out.println("İs there "+ numberr +" in the array: "+ isIn);

        
    }

}