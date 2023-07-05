package scanners;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;

        Scanner input = new Scanner(System.in);

        System.out.print("A sayısını giriniz: ");
        a = input.nextInt();
        System.out.println(a);

        double b;

        System.out.print("b ondalıklı sayısını giriniz: ");
        b = input.nextDouble();
        System.out.println(b);
    }
}
