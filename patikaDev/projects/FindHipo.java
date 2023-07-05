package projects;

import java.util.Scanner;

public class FindHipo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,hipo;

        System.out.println("Enter the first side of triangle");
        a = input.nextDouble();
        System.out.println("Enter the second side of triangle");
        b = input.nextDouble();

        hipo = Math.sqrt(a*a + b*b);


        System.out.println("Hipotenus is :" + hipo);

    }

}
