package operators;

import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        int a=5,b=10;
        if (b>a) {
            System.out.println("b>a");
        }else if (b==a ){
            System.out.println("b = a");
        }else {
            System.out.println("a<b");
        }

        int k=3,l=2,m=1;

        if((k>l)&&(k>m)){
            System.out.println("biggest number is k");
        } else if ((l>k)&&(l>m)) {
            System.out.println("biggest number is k");
        }else{
            System.out.println("biggest number is l");
        }

        Scanner input = new Scanner(System.in);

        int plaka = input.nextInt();

        switch (plaka) {
            case 6 -> System.out.println("Ankara");
            case 35 -> System.out.println("İzmir");
            case 34 -> System.out.println("istanbul");
            case 1 -> System.out.println("Adana");
            case 31 -> System.out.println("Hatay");
            case 45 -> System.out.println("Manisa");
            default -> System.out.println("I dont know this plate");
        }

    }
}
