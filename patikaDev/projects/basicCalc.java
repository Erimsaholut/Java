package projects;

import java.util.Scanner;

public class basicCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first value");
        int n1 = input.nextInt();

        System.out.println("Please enter second value");
        int n2 = input.nextInt();

        System.out.println("1 for addition 2 for subtraction 3 for multiplication 4 for division");
        int op = input.nextInt();

        switch (op){
            case 1 -> System.out.println(n1+n2);
            case 2 -> System.out.println(n1-n2);
            case 3 -> System.out.println(n1/n2);
            case 4 -> System.out.println(n1*n2);
            default -> System.out.println("Wrong value ! ");
        }
    }
}
