package methods;

import java.util.Scanner;

public class CalculatorWithMethods {
    static void sum(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    static void sub(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    static void multi(int a, int b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    static void div(double a, double b) {
        if (b == 0) {
            System.out.println("Wrong value!");
            return;
        }
        double result = a / b;
        System.out.println(a + " / " + b + " = " + result);
    }


    static void exp(int a, int b) {
        int temp = a;
        for (int i = 1; i < b; i++) {
            temp *= a;
        }
        System.out.println(a + " ^ " + b + " = " + (temp));
    }

    static void mod(int a, int b) {
        System.out.println(a + " % " + b + " = " + (a % b));
    }

    static void rec(int a, int b) {
        System.out.println("Area of rectangle = " + (a * b) + "\nPerimeter of the rectangle = " + (a + b) * 2);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu =
                "1- Addition\n" +
                        "2- Subtraction\n" +
                        "3- Multiplication\n" +
                        "4- Division\n" +
                        "5- Exponentiation\n" +
                        "6- Modulus\n" +
                        "7- Rectangle Area and Perimeter Calculation\n" +
                        "0- Exit";

        do {
            System.out.println(menu);
            System.out.println("Select an operation:");
            select = input.nextInt();

            System.out.println("Enter the first value:");
            int a = input.nextInt();

            System.out.println("Enter the second value:");
            int b = input.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    sub(a, b);
                    break;
                case 3:
                    multi(a, b);
                    break;
                case 4:
                    div(a, b);
                    break;
                case 5:
                    exp(a, b);
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    rec(a, b);
                    break;
                case 0:
                    break;
            }


        } while (select != 0);
        System.out.println("Good Bye !");
    }
}
