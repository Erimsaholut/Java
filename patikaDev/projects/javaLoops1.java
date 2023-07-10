package projects;

import java.util.Scanner;

public class javaLoops1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

//        while (number!=0){
//            if (number%2==0)
//                System.out.println(number);
//            number--;
//        }

        for (int i = 0; number >= i; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
                i++;
            }

        }

    }
}
