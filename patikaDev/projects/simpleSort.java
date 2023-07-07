package projects;

import java.util.Scanner;

public class simpleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("Please enter first value:");
        a = input.nextInt();

        System.out.println("Please enter second value:");
        b = input.nextInt();

        System.out.println("Please enter third value:");
        c = input.nextInt();

        if((a>=b)&&(a>=c)){
            System.out.println("Biggest number is: "+a);
        }
        else if(b>=c){
            System.out.println("Biggest number is: "+b);
        }else{
            System.out.println("Biggest number is: "+c);
        }
    }
}
